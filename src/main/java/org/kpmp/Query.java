package org.kpmp;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.kpmp.repositoryDataset.RepositoryDataset;
import org.kpmp.repositoryDataset.RepositoryDatasetService;
import org.kpmp.repositoryDataset.RepositoryFileDataset;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class Query implements GraphQLQueryResolver {

	private RepositoryDatasetService repositoryDatasetService;

	@Autowired
	public Query(
		RepositoryDatasetService repositoryDatasetService
	) {
		this.repositoryDatasetService = repositoryDatasetService;
	}

	public List<RepositoryDataset> getRepositoryDataset() throws IOException, Exception {
		return repositoryDatasetService.getRepositoryDataset();
	}

	public List<RepositoryFileDataset> getRepositoryFileDataset() throws IOException, Exception {
		return repositoryDatasetService.getRepositoryFileDataset();
	}
}