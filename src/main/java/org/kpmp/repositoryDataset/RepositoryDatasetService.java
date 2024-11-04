package org.kpmp.repositoryDataset;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.IOException;

@Component
public class RepositoryDatasetService  {

	@Value("${enterprise-search.host}")
	private String enterpriseSearchHost;
	@Value("${enterprise-search.engine.name}")
	private String enterpriseSearchEngineName;
	private RepositoryFileDatasetRepository fileRepo;
	@Value("${recently-released-date}")
	private String recentlyReleasedDate;

	private RestTemplate restTemplate;
	private Environment env;

	public static class ESResponse {
		String id;
		List<String> errors;

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public List<String> getErrors() {
			return errors;
		}

		public void setErrors(List<String> errors) {
			this.errors = errors;
		}
	}

	@Autowired
	public RepositoryDatasetService(RepositoryFileDatasetRepository fileRepo, RestTemplate restTemplate, Environment env) {
		this.fileRepo = fileRepo;
		this.restTemplate = restTemplate;
		this.env = env;
	}

  public List<RepositoryDatasetDisplay> getRepositoryDataset() throws Exception {
    List <RepositoryFileDataset> datasets = new ArrayList<>(); 
    Double maxReleaseVersion = fileRepo.max();
    datasets.addAll(fileRepo.findAll());
    Map<String, RepositoryDatasetDisplay> displayFiles = new HashMap<>();
	for (RepositoryFileDataset repositoryDataset : datasets) {
        if (displayFiles.containsKey(repositoryDataset.getId().getDlFileId())) {
            // update all of the list items in that display file
            RepositoryDatasetDisplay displayFile = displayFiles.get(repositoryDataset.getId().getDlFileId());
            displayFile.addAgeBinned(repositoryDataset.getAgeBinned());
            displayFile.addRedCapId(repositoryDataset.getId().getRedcapId());
            displayFile.addSampleType(repositoryDataset.getSampleType());
            displayFile.addenrollmentCategory(repositoryDataset.getenrollmentCategory());
            displayFile.addSex(repositoryDataset.getSex());
            displayFile.addProtocol(repositoryDataset.getProtocol());
            displayFile.addTissueSource(repositoryDataset.getTissueSource());
            displayFile.addExperimentalStrategy(repositoryDataset.getId().getExperimentalStrategy());
			displayFile.addDoi(repositoryDataset.getId().getDoi());
            displayFile.addWorkflowType(repositoryDataset.getWorkflowType());
			displayFile.setAccess(repositoryDataset.getAccess());
            displayFiles.put(repositoryDataset.getId().getDlFileId(), displayFile);
        } else {
            RepositoryDatasetDisplay displayFile = new RepositoryDatasetDisplay(repositoryDataset);
            
            if (Double.compare(repositoryDataset.getReleaseVersion(), maxReleaseVersion) == 0) {
			    displayFile.setReleaseVersion("Recently Released - " + recentlyReleasedDate); 
		    } else {
			    displayFile.setReleaseVersion(null);
		    }
            displayFiles.put(repositoryDataset.getId().getDlFileId(), displayFile);
        }
		
	}
	return new ArrayList<>(displayFiles.values());
}

	public List<RepositoryFileDataset> getRepositoryFileDataset() throws IOException, Exception {
		return fileRepo.findAll();
	}

	public List<ESResponse> loadEnterpriseSearch() throws Exception {
		
		List<ESResponse> responses = new ArrayList<>();
		List<RepositoryDatasetDisplay> datasets = getRepositoryDataset();
		String token = env.getProperty("ES_API_TOKEN");
		HttpHeaders headers = new HttpHeaders();
		headers.set("Authorization", "Bearer "+ token);
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("Access-Control-Allow-Origin", "*");
		int chunks = (int) Math.ceil((double) datasets.size() / 100.00);
		for (int i = 0; i < chunks; i++) {
			int beginIndex = i * 100;
			int endIndex;
			if (i == chunks - 1) {
				endIndex = datasets.size();
			}
			else {
				endIndex = (i * 100) + 100;
			}
			List<RepositoryDatasetDisplay> datasetSlice = datasets.subList(beginIndex, endIndex);
			ObjectMapper objectMapper = new ObjectMapper();
    		String jsonArray = objectMapper.writeValueAsString(datasetSlice);

			HttpEntity<Object> entity = new HttpEntity<>(jsonArray, headers);
			String uri = enterpriseSearchHost + "/api/as/v1/engines/" + enterpriseSearchEngineName + "/documents";
			ESResponse[] response = restTemplate.postForObject(uri, entity, ESResponse[].class);
			Collections.addAll(responses, response);
		}
		return responses;
	}

	


}
