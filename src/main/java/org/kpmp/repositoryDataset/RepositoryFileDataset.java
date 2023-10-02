package org.kpmp.repositoryDataset;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.springframework.lang.Nullable;

@Entity
@Table(name = "repo_file_v")
public class RepositoryFileDataset {
    @EmbeddedId
    private RepositoryFileDatasetId id;
    private String sampleType;
    private String tissueType;
    private String ageBinned;
    private String sex;
    private String doi;
    private String access;
    private String platform;
    private String dataCategory;
    private String workflowType;
    private String dataFormat;
    private String dataType;
    private String fileName;
    private Long fileSize;
    private String protocol;
    private String packageId;
    private String tissueSource;
    private Double releaseVersion;

    public RepositoryFileDatasetId getId() {
        return this.id;
    }

    public void setId(RepositoryFileDatasetId id) {
        this.id = id;
    }

    public String getSampleType() {
        return sampleType;
    }

    public void setSampleType(String sampleType) {
        this.sampleType = sampleType;
    }

    public String getTissueType() {
        return tissueType;
    }

    public void setTissueType(String tissueType) {
        this.tissueType = tissueType;
    }

    @Nullable

    public String getAgeBinned() {
        return ageBinned;
    }

    public void setAgeBinned(String ageBinned) {
        this.ageBinned = ageBinned;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Nullable

    public String getDoi() {
        return doi;
    }

    public void setDoi(String doi) {
        this.doi = doi;
    }

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getDataCategory() {
        return dataCategory;
    }

    public void setDataCategory(String dataCategory) {
        this.dataCategory = dataCategory;
    }

    public String getWorkflowType() {
        return workflowType;
    }

    public void setWorkflowType(String workflowType) {
        this.workflowType = workflowType;
    }

    public String getDataFormat() {
        return dataFormat;
    }

    public void setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public String getTissueSource() {
        return tissueSource;
    }

    public void setTissueSource(String tissueSource) {
        this.tissueSource = tissueSource;
    }

    public Double getReleaseVersion() {
        return releaseVersion;
    }

    public void setReleaseVersion(Double releaseVersion) {
        this.releaseVersion = releaseVersion;
    }

}
