package org.kpmp.repositoryDataset;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
@Embeddable
public class RepositoryFileDatasetId implements Serializable{
    private String dlFileId;
    private String redcapId;
    private String experimentalStrategy;

    @Column(name = "dl_file_id")
    public String getDlFileId() {
        return this.dlFileId;
    }

    public void setDlFileId(String dlFileId) {
        this.dlFileId = dlFileId;
    }

    public String getRedcapId() {
        return this.redcapId;
    }

    public void setRedcapId(String redcapId) {
        this.redcapId = redcapId;
    }

    public String getExperimentalStrategy() {
        return this.experimentalStrategy;
    }

    public void setExperimentalStrategy(String experimentalStrategy) {
        this.experimentalStrategy = experimentalStrategy;
    }
}
