package org.kpmp.repositoryDataset;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface RepositoryFileDatasetRepository
        extends CrudRepository<RepositoryFileDataset, Integer> {

    List<RepositoryFileDataset> findAll();

    @Query (value = "SELECT release_version FROM repo_file_v WHERE release_version = (SELECT MAX(release_version) FROM repo_file_v) limit 1", nativeQuery = true)
    public BigDecimal max();
}