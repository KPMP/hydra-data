package org.kpmp.repositoryDataset;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
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
	private RestTemplate restTemplate;

	@Mock
	Environment env;

  
	private RepositoryDatasetService service;

	@BeforeEach
	public void setUp() throws Exception {
		MockitoAnnotations.openMocks(this);
		service = new RepositoryDatasetService(fileRepo, restTemplate, env);
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
    List<RepositoryFileDataset> expectedResult = new ArrayList<>();
		assertEquals(expectedResult, service.getRepositoryDataset());
	}

	@Test
	public void testRepositoryFileDataset() throws JSONException, Exception {
		List<RepositoryFileDataset> expectedResult = new ArrayList<>();
		RepositoryFileDataset repositoryDataset3 = new RepositoryFileDataset();
		RepositoryFileDatasetId id3 = new RepositoryFileDatasetId();
		id3.setDlFileId("321");
		repositoryDataset3.setId(id3);
		repositoryDataset3.setA1c("123");
		repositoryDataset3.setAlbuminuria("321");
		repositoryDataset3.setBaselineEgfr("456");
		repositoryDataset3.setKdigoStage("123");
		repositoryDataset3.setDiabetesHistory("hist");
		repositoryDataset3.setDiabetesDuration("987");
		repositoryDataset3.setProteinuria("567");
		repositoryDataset3.setHypertensionDuration("123");
		repositoryDataset3.setHypertensionHistory("hhist1");
		repositoryDataset3.setOnRaasBlockade("raas");
		repositoryDataset3.setReleaseVersion(3.45);
		RepositoryFileDataset repositoryDataset4 = new RepositoryFileDataset();
		RepositoryFileDatasetId id4 = new RepositoryFileDatasetId();
		id4.setDlFileId("321");
		repositoryDataset4.setId(id4);
		repositoryDataset4.setA1c("321");
		repositoryDataset4.setAlbuminuria("321");
		repositoryDataset4.setBaselineEgfr("456");
		repositoryDataset4.setKdigoStage("123");
		repositoryDataset4.setDiabetesHistory("hist");
		repositoryDataset4.setDiabetesDuration("987");
		repositoryDataset4.setProteinuria("567");
		repositoryDataset4.setHypertensionDuration("123");
		repositoryDataset4.setHypertensionHistory("hhist2");
		repositoryDataset4.setOnRaasBlockade("raas");
		repositoryDataset4.setReleaseVersion(3.45);
		expectedResult.add(repositoryDataset3);
		expectedResult.add(repositoryDataset4);
		when(fileRepo.findAll()).thenReturn(expectedResult);
		List<RepositoryDatasetDisplay> expectedResult1 = service.getRepositoryDataset();
		assertEquals(expectedResult1.size(), 1);
		assertEquals(expectedResult1.get(0).getA1c(), new HashSet<>(Arrays.asList("321 (a1c)", "123 (a1c)")));
	}

	@Test
	public void testLoadEnterpriseSearch() throws JSONException, Exception {
		when(env.getProperty("ES_API_TOKEN")).thenReturn("TOKEN");
		HttpHeaders headers = new HttpHeaders();
		headers.set("Authorization", "Bearer "+ "TOKEN");
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("Access-Control-Allow-Origin", "*");

		List<RepositoryFileDataset> expectedResult2 = new ArrayList<>();
		RepositoryFileDataset repositoryDataset3 = new RepositoryFileDataset();
		RepositoryFileDatasetId id3 = new RepositoryFileDatasetId();
		id3.setDlFileId("123");
		id3.setRedcapId("123");
		repositoryDataset3.setId(id3);
		repositoryDataset3.setA1c("123");
		repositoryDataset3.setAlbuminuria("321");
		repositoryDataset3.setBaselineEgfr("456");
		repositoryDataset3.setKdigoStage("123");
		repositoryDataset3.setDiabetesHistory("hist");
		repositoryDataset3.setDiabetesDuration("987");
		repositoryDataset3.setProteinuria("567");
		repositoryDataset3.setHypertensionDuration("123");
		repositoryDataset3.setHypertensionHistory("hhist1");
		repositoryDataset3.setOnRaasBlockade("raas");
		repositoryDataset3.setReleaseVersion(3.45);
		RepositoryFileDataset repositoryDataset4 = new RepositoryFileDataset();
		RepositoryFileDatasetId id4 = new RepositoryFileDatasetId();
		id4.setDlFileId("321");
		id4.setRedcapId("321");
		repositoryDataset4.setId(id4);
		repositoryDataset4.setA1c("321");
		repositoryDataset4.setAlbuminuria("321");
		repositoryDataset4.setBaselineEgfr("456");
		repositoryDataset4.setKdigoStage("123");
		repositoryDataset4.setDiabetesHistory("hist");
		repositoryDataset4.setDiabetesDuration("987");
		repositoryDataset4.setProteinuria("567");
		repositoryDataset4.setHypertensionDuration("123");
		repositoryDataset4.setHypertensionHistory("hhist2");
		repositoryDataset4.setOnRaasBlockade("raas");
		repositoryDataset4.setReleaseVersion(3.45);
		expectedResult2.add(repositoryDataset3);
		expectedResult2.add(repositoryDataset4);
		when(fileRepo.findAll()).thenReturn(expectedResult2);
		String expectedJson = "[{\"file_id\":\"123\",\"access\":null,\"platform\":null,\"release_version\":null,\"data_format\":null,\"data_category\":null,\"data_type\":null,\"file_size\":null,\"file_name\":null,\"package_id\":null,\"file_name_sort\":null,\"protocol\":null,\"tissue_source\":null,\"experimental_strategy\":null,\"workflow_type\":null,\"redcap_id\":[\"123\"],\"sample_type\":null,\"enrollment_category\":null,\"age_binned\":null,\"sex\":null,\"dois\":null,\"primary_adjudicated_category\":null,\"kdigo_stage\":[\"123 (ks)\"],\"baseline_egfr\":[\"456 (eGFR)\"],\"proteinuria\":[\"567 (prot)\"],\"a1c\":[\"123 (a1c)\"],\"albuminuria\":[\"321 (alb)\"],\"diabetes_duration\":[\"987 (dd)\"],\"diabetes_history\":[\"Hist (dh)\"],\"hypertension_history\":[\"Hhist1 (hh)\"],\"hypertension_duration\":[\"123 (hd)\"],\"race\":null,\"on_raas_blockade\":[\"raas (rb)\"],\"experimental_strategy_sort\":\"\",\"participant_id_sort\":\"123\",\"doi_sort\":\"\",\"platform_sort\":\"aaaaa\"},{\"file_id\":\"321\",\"access\":null,\"platform\":null,\"release_version\":null,\"data_format\":null,\"data_category\":null,\"data_type\":null,\"file_size\":null,\"file_name\":null,\"package_id\":null,\"file_name_sort\":null,\"protocol\":null,\"tissue_source\":null,\"experimental_strategy\":null,\"workflow_type\":null,\"redcap_id\":[\"321\"],\"sample_type\":null,\"enrollment_category\":null,\"age_binned\":null,\"sex\":null,\"dois\":null,\"primary_adjudicated_category\":null,\"kdigo_stage\":[\"123 (ks)\"],\"baseline_egfr\":[\"456 (eGFR)\"],\"proteinuria\":[\"567 (prot)\"],\"a1c\":[\"321 (a1c)\"],\"albuminuria\":[\"321 (alb)\"],\"diabetes_duration\":[\"987 (dd)\"],\"diabetes_history\":[\"Hist (dh)\"],\"hypertension_history\":[\"Hhist2 (hh)\"],\"hypertension_duration\":[\"123 (hd)\"],\"race\":null,\"on_raas_blockade\":[\"raas (rb)\"],\"experimental_strategy_sort\":\"\",\"participant_id_sort\":\"321\",\"doi_sort\":\"\",\"platform_sort\":\"aaaaa\"}]";
		HttpEntity<Object> entity = new HttpEntity<>(expectedJson, headers);
		RepositoryDatasetService.ESResponse[] esResponses = {new RepositoryDatasetService.ESResponse()};
		when(restTemplate.postForObject(anyString(), any(), any(Class.class))).thenReturn(esResponses);
		service.loadEnterpriseSearch();
		verify(restTemplate).postForObject("host/api/as/v1/engines/search-engine/documents", entity, RepositoryDatasetService.ESResponse[].class);
	}
}