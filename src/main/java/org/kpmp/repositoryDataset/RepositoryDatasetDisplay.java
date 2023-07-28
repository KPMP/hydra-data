package org.kpmp.repositoryDataset;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.*;

public class RepositoryDatasetDisplay {
    private static final int UUID_LENGTH = 37;
    private String dlFileId;
    private Set<String> redcapId;
    private Set<String> sampleType;
    private Set<String> tissueType;
    private Set<String> ageBinned;
    private Set<String> sex;
    private Set<String> doi;
    private String access;
    private String platform;
    private String releaseVersion;
    private Set<String> protocol;
    private Set<String> tissueSource;
    private Set<String> experimentalStrategy;
    private Set<String> workflowType;
    private String dataFormat;
    private String dataCategory;
    private String dataType;
    private Long fileSize;
    private String fileName;
    private String packageId;
    private String fileNameSort;

    public RepositoryDatasetDisplay(RepositoryFileDataset repositoryFile) {
        dlFileId = repositoryFile.getId().getDlFileId();
        redcapId = new HashSet<String>();
        sampleType = new HashSet<String>();
        tissueType = new HashSet<String>();
        ageBinned = new HashSet<String>();
        sex = new HashSet<String>();
        doi = new HashSet<String>();
        protocol = new HashSet<String>();
        tissueSource = new HashSet<String>();
        experimentalStrategy = new HashSet<String>();
        workflowType = new HashSet<String>();
        redcapId.add(repositoryFile.getId().getRedcapId());
        sampleType.add(repositoryFile.getSampleType());
        tissueType.add(repositoryFile.getTissueType());
        ageBinned.add(repositoryFile.getAgeBinned());
        sex.add(repositoryFile.getSex());
        doi.add(repositoryFile.getDoi());
        access = repositoryFile.getAccess();
        platform = repositoryFile.getPlatform();
        protocol.add(repositoryFile.getProtocol());
        tissueSource.add(repositoryFile.getTissueSource());
        experimentalStrategy.add(repositoryFile.getExperimentalStrategy());
        workflowType.add(repositoryFile.getWorkflowType());
        dataFormat = repositoryFile.getDataFormat();
        dataCategory = repositoryFile.getDataCategory();
        dataType = repositoryFile.getDataType();
        fileSize = repositoryFile.getFileSize();
        fileName = repositoryFile.getFileName();
        packageId = repositoryFile.getPackageId();
    }

    @JsonProperty("dlfileid")
    public String getDlFileId() {
        return this.dlFileId;
    }

    public void setDlFileId(String dlFileId) {
        this.dlFileId = dlFileId;
    }

    public void addRedCapId(String redcapId) {
        if(!redcapId.isEmpty()){
            this.redcapId.add(redcapId);
        }
        
    }

    @JsonProperty("redcap_id")
    public Set<String> getRedcapId() {
        if(redcapId.isEmpty()) {
            return null;
        }else{
            return this.redcapId;
        }

    }

    public void setRedcapId(Set<String> redcapIds) {
        this.redcapId = redcapIds;
    }

    public void addSampleType(String sampleType) {
        if(!(sampleType == null || sampleType.isEmpty())){
            this.sampleType.add(sampleType);
        }
        
    }

    @JsonProperty("sample_type")
    public Set<String> getSampleType() {
        if(sampleType.isEmpty()){
            return null;
        }else{
            return this.sampleType;
        }

    }

    public void setSampleType(Set<String> sampleType) {
        this.sampleType = sampleType;
    }

    public void addTissueType(String tissueType) {
        if(!tissueType.isEmpty()){
            this.tissueType.add(tissueType);
        }
    }

    @JsonProperty("tissue_type")
    public Set<String> getTissueType() {
        if(tissueType.isEmpty()){
            return null;
        }else{
            return this.tissueType;
        }

    }

    public void setTissueType(Set<String> tissueType) {
        this.tissueType = tissueType;
    }

    public void addAgeBinned(String ageBinned) {
        if(!(ageBinned == null || ageBinned.isEmpty())){
            this.ageBinned.add(ageBinned);
        }
        
    }

    @JsonProperty("age_binned")
    public Set<String> getAgeBinned() {
        if(ageBinned.isEmpty()){
            return null;
        }else{
            return this.ageBinned;
        }

    }

    public void setAgeBinned(Set<String> ageBinned) {
        this.ageBinned = ageBinned;
    }

    public void addSex(String sex) {
        if(!(sex == null || sex.isEmpty())){
            this.sex.add(sex);
        }
        
    }

    @JsonProperty("sex")
    public Set<String> getSex() {
        if (sex.isEmpty()){
            return null;
        }else{
            return this.sex;
        }
    }

    public void setSex(Set<String> sex) {
        this.sex = sex;
    }

    public void addDoi(String doi) {
        if (!(doi == null || doi.isEmpty())){
            this.doi.add(doi);
        }
        
    }

    @JsonProperty("doi")
    public Set<String> getDoi() {
        if(doi.isEmpty()){
            return null;
        }else{
            return this.doi;
        }

    }

    public void setDoi(Set<String> doi) {
        this.doi = doi;
    }

    @JsonProperty("access")
    public String getAccess() {
        return this.access;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    @JsonProperty("platform")
    public String getPlatform() {
        return this.platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    @JsonProperty("release_version")
    public String getReleaseVersion() {
        return this.releaseVersion;
    }

    public void setReleaseVersion(String releaseVersion) {
        this.releaseVersion = releaseVersion;
    }

    public void addProtocol(String protocol) {
        if(!protocol.isEmpty()){
            this.protocol.add(protocol);
        }

    }

    @JsonProperty("protocol")
    public Set<String> getProtocol() {
        if (protocol.isEmpty()){
            return null;
        }else{
            return this.protocol;
        }

    }

    public void setProtocol(Set<String> protocol) {
        this.protocol = protocol;
    }

    public void addTissueSource(String tissueSource) {
        if(tissueSource.isEmpty()){
            this.tissueSource.add(tissueSource);
        }

    }

    @JsonProperty("tissue_source")
    public Set<String> getTissueSource() {
        if(tissueSource.isEmpty()){
            return null;
        }else{
            return this.tissueSource;
        }

    }

    public void setTissueSource(Set<String> tissueSource) {
        this.tissueSource = tissueSource;
    }

    public void addExperimentalStrategy(String experimentalStrategy) {
        if(!(experimentalStrategy == null || experimentalStrategy.isEmpty())){
            this.experimentalStrategy.add(experimentalStrategy);
        }
   
    }

    @JsonProperty("experimental_strategy")
    public Set<String> getExperimentalStrategy() {
        if(experimentalStrategy.isEmpty()){
            return null;
        }else{
            return this.experimentalStrategy;
        }

    }

    public void setExperimentalStrategy(Set<String> experimentalStrategy) {
        this.experimentalStrategy = experimentalStrategy;
    }

    public void addWorkflowType(String workflowType) {
        if(!(workflowType == null || workflowType.isEmpty())){
            this.workflowType.add(workflowType);
        }

    }

    @JsonProperty("workflow_type")
    public Set<String> getWorkflowType() {
        if(workflowType.isEmpty()){
            return null;
        }else{
            return this.workflowType;
        }

    }

    public void setWorkflowType(Set<String> workflowType) {
        this.workflowType = workflowType;
    }

    @JsonProperty("data_format")
    public String getDataFormat() {
        return this.dataFormat;
    }

    public void setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
    }

    @JsonProperty("data_category")
    public String getDataCategory() {
        return this.dataCategory;
    }

    public void setDataCategory(String dataCategory) {
        this.dataCategory = dataCategory;
    }

    @JsonProperty("data_type")
    public String getDataType() {
        return this.dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    @JsonProperty("file_size")
    public Long getFileSize() {
        return this.fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    @JsonProperty("file_name")
    public String getFileName() {
        return this.fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @JsonProperty("package_id")
    public String getPackageId() {
        return this.packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    @JsonProperty("participant_id_sort")
    public String getParticipantIdSort() {
        if (redcapId.size() == 1) {
            return redcapId.toString().replace("-", "");
        } else {
            return "Multiple Participants";
        }
    }

    @JsonProperty("file_name_sort")
    public String getFileNameSort() {
        fileNameSort = fileName.substring(UUID_LENGTH, fileName.length());
        return fileNameSort;
    }

    public void setFileNameSort(String fileNameSort) {
        this.fileNameSort = fileNameSort;
    }

    @JsonProperty("platform_sort")
    public String getPlatformSort() {
        return (platform == null) ? "aaaaa" : platform;
    }

}