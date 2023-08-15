package org.kpmp.repositoryDataset;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositoryFileDatasetRepository
        extends CrudRepository<RepositoryFileDataset, Integer> {

    List<RepositoryFileDataset> findAll();

    @Query (value = "SELECT MAX(release_version) AS max FROM repo_file_v", nativeQuery = true)
    public Double max();
}