package org.kpmp.repositoryDataset;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class RepositoryDatasetController {
    private final RepositoryDatasetService repositoryDatasetService;

    @Autowired
    public RepositoryDatasetController(RepositoryDatasetService repositoryDatasetService) {
        this.repositoryDatasetService = repositoryDatasetService;
    }

    @RequestMapping(value = "/api/v1/repository/load-search", method = RequestMethod.GET)
    public @ResponseBody String loadSearch() throws Exception {
        return "Successfully added " + repositoryDatasetService.loadEnterpriseSearch().size() + " documents.";
    }
}
