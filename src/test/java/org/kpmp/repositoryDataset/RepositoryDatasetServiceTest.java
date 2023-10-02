package org.kpmp.repositoryDataset;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
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
		assertEquals(expectedResult, service.getRepositoryFileDataset());
	}

	@Test
	public void testLoadEnterpriseSearch() throws JSONException, Exception {
		when(env.getProperty("ES_API_TOKEN")).thenReturn("TOKEN");
		HttpHeaders headers = new HttpHeaders();
		headers.set("Authorization", "Bearer "+ "TOKEN");
		headers.setContentType(MediaType.APPLICATION_JSON);

		ArrayList<RepositoryFileDataset> results = new ArrayList<>();
		List<RepositoryFileDataset> expectedResult2 = new ArrayList<>();
		RepositoryFileDataset repositoryDataset3 = new RepositoryFileDataset();
		RepositoryFileDataset repositoryDataset4 = new RepositoryFileDataset();
		expectedResult2.add(repositoryDataset3);
		expectedResult2.add(repositoryDataset4);
		when(fileRepo.findAll()).thenReturn(expectedResult2);
		results.addAll(expectedResult2);

		HttpEntity<Object> entity = new HttpEntity<>(results, headers);
		RepositoryDatasetService.ESResponse[] esResponses = {new RepositoryDatasetService.ESResponse()};
		when(restTemplate.postForObject("host/api/as/v1/engines/search-engine/documents", entity, RepositoryDatasetService.ESResponse[].class)).thenReturn(esResponses);
		service.loadEnterpriseSearch();
		verify(restTemplate).postForObject("host/api/as/v1/engines/search-engine/documents", entity, RepositoryDatasetService.ESResponse[].class);
	}

	// @Test
	// public void testGetRepositoryDataset_duplicateFile() throws Exception {
	// 	when(fileRepo.max()).thenReturn(11d);
	// 	RepositoryFileDatasetId fileId = mock(RepositoryFileDatasetId.class);
	// 	when(fileId.getDlFileId()).thenReturn("124");
	// 	RepositoryFileDataset file1 = mock(RepositoryFileDataset.class);
	// 	when(file1.getAccess()).thenReturn("1");
	// 	when(file1.getId()).thenReturn(fileId);
	// 	when(file1.getExperimentalStrategy()).thenReturn("strat1");
	// 	RepositoryFileDataset file2 = mock(RepositoryFileDataset.class);
	// 	when(file2.getId()).thenReturn(fileId);
	// 	when(file2.getAccess()).thenReturn("2");
	// 	when(file2.getExperimentalStrategy()).thenReturn("strat2");
	// 	when(fileRepo.findAll()).thenReturn(Arrays.asList(file1, file2));

	// 	List<RepositoryDatasetDisplay> result = service.getRepositoryDataset();
		
	// 	assertEquals(1, result.size());
	// 	assertEquals(new HashSet<>(Arrays.asList("1", "2")), result.get(0).getAccess());
	// 	assertEquals(new HashSet<>(Arrays.asList("strat1", "strat2")), result.get(0).getExperimentalStrategy());
	// }
}