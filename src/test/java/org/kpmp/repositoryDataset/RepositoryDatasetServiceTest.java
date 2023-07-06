package org.kpmp.repositoryDataset;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.web.client.RestTemplate;

public class RepositoryDatasetServiceTest {

	@Mock
	private RepositoryFileDatasetRepository fileRepo;
	@Mock
	private RepositoryExternalLinkRepository externalLinkRepo;

	@Mock
	private RestTemplate restTemplate;

	@Mock
	Environment env;

  
	private RepositoryDatasetService service;

	@BeforeEach
	public void setUp() throws Exception {
		MockitoAnnotations.openMocks(this);
		service = new RepositoryDatasetService(externalLinkRepo, fileRepo, restTemplate, env);
		ReflectionTestUtils.setField(service, "enterpriseSearchHost", "host");
		ReflectionTestUtils.setField(service, "enterpriseSearchEngineName", "search-engine");
	}

  @AfterEach
	public void tearDown() throws Exception {
		MockitoAnnotations.openMocks(this).close();
		service = null;
	}

	@Test
	public void testGetRepositoryDataset() throws JSONException, Exception {
    List<RepositoryDataset> expectedResult = new ArrayList<>();
		assertEquals(expectedResult, service.getRepositoryDataset());
	}

	@Test
	public void testGetRepositoryExternalLink() throws JSONException, Exception {
    List<RepositoryDataset> expectedResult = new ArrayList<>();
		assertEquals(expectedResult, service.getRepositoryExternalLink());
	}

	@Test
	public void testRepositoryFileDataset() throws JSONException, Exception {
    List<RepositoryDataset> expectedResult = new ArrayList<>();
		assertEquals(expectedResult, service.getRepositoryFileDataset());
	}

	@Test
	public void testLoadEnterpriseSearch() throws JSONException, Exception {
		when(env.getProperty("ES_API_TOKEN")).thenReturn("TOKEN");
		HttpHeaders headers = new HttpHeaders();
		headers.set("Authorization", "Bearer "+ "TOKEN");
		headers.setContentType(MediaType.APPLICATION_JSON);

		ArrayList<RepositoryDataset> results = new ArrayList<>();
		List<RepositoryExternalLinkDataset> expectedResult1 = new ArrayList<>();
		List<RepositoryFileDataset> expectedResult2 = new ArrayList<>();
		RepositoryExternalLinkDataset repositoryDataset1 = new RepositoryExternalLinkDataset();
		RepositoryExternalLinkDataset repositoryDataset2 = new RepositoryExternalLinkDataset();
		RepositoryFileDataset repositoryDataset3 = new RepositoryFileDataset();
		RepositoryFileDataset repositoryDataset4 = new RepositoryFileDataset();
		expectedResult1.add(repositoryDataset1);
		expectedResult1.add(repositoryDataset2);
		expectedResult2.add(repositoryDataset3);
		expectedResult2.add(repositoryDataset4);
		when(externalLinkRepo.findAll()).thenReturn(expectedResult1);
		when(fileRepo.findAll()).thenReturn(expectedResult2);
		results.addAll(expectedResult1);
		results.addAll(expectedResult2);

		HttpEntity<Object> entity = new HttpEntity<>(results, headers);
		RepositoryDatasetService.ESResponse[] esResponses = {new RepositoryDatasetService.ESResponse()};
		when(restTemplate.postForObject("host/api/as/v1/engines/search-engine/documents", entity, RepositoryDatasetService.ESResponse[].class)).thenReturn(esResponses);
		service.loadEnterpriseSearch();
		verify(restTemplate).postForObject("host/api/as/v1/engines/search-engine/documents", entity, RepositoryDatasetService.ESResponse[].class);
	}
}