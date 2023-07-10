package org.kpmp.repositoryDataset;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;

import com.fasterxml.jackson.annotation.*;
import org.springframework.lang.Nullable;

@Entity
@Table(name = "repo_file_v")
public class RepositoryFileDataset implements RepositoryDataset {

    @Id
    @Column(name = "dl_file_id")
    private String dlFileId;
    private String redcapId;
    private String sampleType;
    private String tissueType;
    private String ageBinned;
    private String sex;
    private String doi;
    private String access;
    private String platform;
    private String experimentalStrategy;
    private String dataCategory;
    private String workflowType;
    private String dataFormat;
    private String dataType;
    private String fileName;
    private Long fileSize;
    private String protocol;
    private String packageId;
    private String tissueSource;
    private Integer releaseVersion;
    
    @JsonProperty("dlfileid")
    public String getDlFileId(){
        return dlFileId;
    }
    
    public void setDlFileId(String dlFileId) {
        this.dlFileId = dlFileId;
    }

    @Nullable
    @JsonProperty("redcapid")
    public String getRedcapId() {
        return redcapId;
    }

    public void setRedcapId(String redcapId) {
        this.redcapId = redcapId;
    }
    
    @Nullable
    @JsonProperty("sampletype")
    public String getSampleType() {
        return sampleType;
    }

    public void setSampleType(String sampleType) {
        this.sampleType = sampleType;
    }

    @Nullable
    @JsonProperty("tissuetype")
    public String getTissueType(){
        return tissueType;
    }

    public void setTissueType(String tissueType){
        this.tissueType = tissueType;
    }

    @Nullable
    @JsonProperty("agebinned")
    public String getAgeBinned(){
        return ageBinned;
    }

    public void setAgeBinned(String ageBinned){
        this.ageBinned = ageBinned;
    }

    @Nullable
    @JsonProperty("sex")
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    
    @JsonProperty("doi")
    public String getDoi(){
        return doi;
    }

    public void setDoi(String doi){
        this.doi = doi;
    }

    @Nullable
    @JsonProperty("access")
    public String getAccess(){
        return access;
    }

    public void setAccess(String access){
        this.access = access;
    }

    @Nullable
    @JsonProperty("platform")
    public String getPlatform(){
        return platform;
    }

    public void setPlatform(String platform){
        this.platform = platform;
    }

    @Nullable
    @JsonProperty("experimentalstrategy")
    public String getExperimentalStrategy(){
        return experimentalStrategy;
    }

    public void setExperimentalStrategy(String experimentalStrategy){
        this.experimentalStrategy = experimentalStrategy;
    }

    @Nullable
    @JsonProperty("datacategory")
    public String getDataCategory(){
        return dataCategory;
    }

    public void setDataCategory(String dataCategory){
        this.dataCategory = dataCategory;
    }

    @Nullable
    @JsonProperty("workflowtype")
    public String getWorkflowType(){
        return workflowType;
    }

    public void setWorkflowType(String workflowType){
        this.workflowType = workflowType;
    }

    @Nullable
    @JsonProperty("dataformat")
    public String getDataFormat(){
        return dataFormat;
    }

    public void setDataFormat(String dataFormat){
        this.dataFormat = dataFormat;
    }


    @JsonProperty("datatype")
    public String getDataType() {
            return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }


    @JsonProperty("filename")
    public String getFileName(){
        return fileName;
    }

    public void setFileName(String fileName){
        this.fileName = fileName;
    }

    @Nullable
    @JsonProperty("filesize")
    public Long getFileSize(){
        return fileSize;
    }

    public void setFileSize(Long fileSize){
        this.fileSize = fileSize;
    }
    

    @Nullable
    @JsonProperty("protocol")
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    
    @Nullable
    @JsonProperty("packageid")
    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }
    

    @Nullable
    @JsonProperty("tissuesource")
    public String getTissueSource() {
        return tissueSource;
    }

    public void setTissueSource(String tissueSource) {
        this.tissueSource = tissueSource;
    }

    @Nullable
    @JsonProperty("releaseversion")
    public Integer getReleaseVersion(){
        return releaseVersion;
    }

    public void setReleaseVersion(Integer releaseVersion){
        this.releaseVersion = releaseVersion;
    }

}