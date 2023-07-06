package org.kpmp.repositoryDataset;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.kpmp.file.File;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "sv_file_v")
public class RepositoryFileDataset implements RepositoryDataset {

    @Id
    @Column(name = "file_id")
    private int fileId;
    private String dlFileId;
    private String fileName;
    private String packageId;
    private Long fileSize;
    private String configType;
    private String imageType;
    private String dataType;
    private String spectrackSampleId;
    private int participantId;
    private String redcapId;
    private String age;
    private String protocol;
    private String sampleType;
    private String sex;
    private String tissueSource;
    private String tissueType;
    private String level;

    @JoinTable(
            name = "sv_related_files",
            joinColumns = @JoinColumn(
                    name = "file_id"),
            inverseJoinColumns = @JoinColumn(
                    name = "related_file_id"
            )
    )
    @ManyToMany(fetch = FetchType.EAGER)
    private List<File> relatedFiles;

    @JsonProperty("fileid")
    public int getFileId() {
        return fileId;
    }

    public void setFileId(int fileId) {
        this.fileId = fileId;
    }

    @JsonProperty("dlfileid")
    public String getDlFileId() {
        return dlFileId;
    }

    public void setDlFileId(String dlFileId) {
        this.dlFileId = dlFileId;
    }

    @JsonProperty("filename")
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @JsonProperty("packageid")
    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    @JsonProperty("filesize")
    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    @JsonProperty("protocol")
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    @JsonProperty("configtype")
    public String getConfigType() {
        return configType;
    }

    public void setConfigType(String configType) {
        this.configType = configType;
    }

    @JsonProperty("imagetype")
    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    @JsonProperty("datatype")
    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    @JsonProperty("participantid")
    public int getParticipantId() {
        return participantId;
    }

    public void setParticipantId(int participantId) {
        this.participantId = participantId;
    }

    @JsonProperty("redcapid")
    public String getRedcapId() {
        return redcapId;
    }

    public void setRedcapId(String redcapId) {
        this.redcapId = redcapId;
    }

    @JsonProperty("age")
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @JsonProperty("sampletype")
    public String getSampleType() {
        return sampleType;
    }

    public void setSampleType(String sampleType) {
        this.sampleType = sampleType;
    }

    @JsonProperty("sex")
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @JsonProperty("tissuesource")
    public String getTissueSource() {
        return tissueSource;
    }

    public void setTissueSource(String tissueSource) {
        this.tissueSource = tissueSource;
    }

    @JsonProperty("tissuetype")
    public String getTissueType() {
        return tissueType;
    }

    public void setTissueType(String tissueType) {
        this.tissueType = tissueType;
    }

    @JsonProperty("spectracksampleid")
    public String getSpectrackSampleId() {
        return spectrackSampleId;
    }
    
    public void setSpectrackSampleId(String spectrackSampleId) {
        this.spectrackSampleId = spectrackSampleId;
    }

    @JsonProperty("level")
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @JsonProperty("relatedfiles")
    public List<File> getRelatedFiles() {
        return relatedFiles;
    }

    public void setRelatedFiles(List<File> relatedFiles) {
        this.relatedFiles = relatedFiles;
    }

    @JsonProperty("externallink")
    public String getExternalLink() {
        return null;
    }

    @JsonProperty("Repositorydataset")
    public Object getRepositoryDataset() {
      return null;
    }
}