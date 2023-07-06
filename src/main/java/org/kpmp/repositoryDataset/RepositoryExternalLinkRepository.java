package org.kpmp.repositoryDataset;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositoryExternalLinkRepository
    extends CrudRepository<RepositoryExternalLinkDataset, Integer> {

    List<RepositoryExternalLinkDataset> findAll();

}