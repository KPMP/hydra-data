package org.kpmp.repositoryDataset;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositoryFileDatasetRepository
        extends CrudRepository<RepositoryFileDataset, Integer> {

    List<RepositoryFileDataset> findAll();

}