package org.kpmp;

import org.kpmp.repositoryDataset.RepositoryDatasetDisplay;
import org.kpmp.repositoryDataset.RepositoryDatasetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class Query {

	private RepositoryDatasetService repositoryDatasetService;

	@Autowired
	public Query(RepositoryDatasetService repositoryDatasetService) {
		this.repositoryDatasetService = repositoryDatasetService;
	}

	@QueryMapping
	public List<RepositoryDatasetDisplay> getRepositoryDataset() throws IOException, Exception {
		return repositoryDatasetService.getRepositoryDataset();
	}
}