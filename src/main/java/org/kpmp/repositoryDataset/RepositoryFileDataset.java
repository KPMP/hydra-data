package org.kpmp.repositoryDataset;

import jakarta.persistence.*;
import org.springframework.lang.Nullable;

@Entity
@Table(name = "repo_file_v")
public class RepositoryFileDataset {
    @EmbeddedId
    private RepositoryFileDatasetId id;
    private String sampleType;
    private String enrollmentCategory;
    private String ageBinned;
    private String sex;
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
    @Column(name = "primary_adjudicated_cat")
    private String primaryAdjudicatedCat;
    private String kdigoStage;
    private String baselineEgfr;
    private String proteinuria;
    private String a1c;
    private String albuminuria;
    private String diabetesHistory;
    private String diabetesDuration;
    private String hypertensionHistory;
    private String hypertensionDuration;
    private String onRaasBlockade;
    private String race;


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

    public String getenrollmentCategory() {
        return enrollmentCategory;
    }

    public void setenrollmentCategory(String enrollmentCategory) {
        this.enrollmentCategory = enrollmentCategory;
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

    public String getPrimaryAdjudicatedCat() {
        return this.primaryAdjudicatedCat;
    }

    public void setPrimaryAdjudicatedCat(String primaryAdjudicatedCat) {
        this.primaryAdjudicatedCat = primaryAdjudicatedCat;
    }

    public String getKdigoStage() {
        return this.kdigoStage;
    }

    public void setKdigoStage(String kdigoStage) {
        this.kdigoStage = kdigoStage;
    }

    public String getBaselineEgfr() {
        return this.baselineEgfr;
    }

    public void setBaselineEgfr(String baselineEgfr) {
        this.baselineEgfr = baselineEgfr;
    }

    public String getProteinuria() {
        return this.proteinuria;
    }

    public void setProteinuria(String proteinuria) {
        this.proteinuria = proteinuria;
    }

    public String getA1c() {
        return this.a1c;
    }

    public void setA1c(String a1c) {
        this.a1c = a1c;
    }

    public String getAlbuminuria() {
        return this.albuminuria;
    }

    public void setAlbuminuria(String albuminuria) {
        this.albuminuria = albuminuria;
    }

    public String getDiabetesHistory() {
        return this.diabetesHistory;
    }

    public void setDiabetesHistory(String diabetesHistory) {
        this.diabetesHistory = diabetesHistory;
    }

    public String getDiabetesDuration() {
        return this.diabetesDuration;
    }

    public void setDiabetesDuration(String diabetesDuration) {
        this.diabetesDuration = diabetesDuration;
    }

    public String getHypertensionHistory() {
        return this.hypertensionHistory;
    }

    public void setHypertensionHistory(String hypertensionHistory) {
        this.hypertensionHistory = hypertensionHistory;
    }

    public String getHypertensionDuration() {
        return this.hypertensionDuration;
    }

    public void setHypertensionDuration(String hypertensionDuration) {
        this.hypertensionDuration = hypertensionDuration;
    }

    public String getOnRaasBlockade() {
        return this.onRaasBlockade;
    }

    public void setOnRaasBlockade(String onRaasBlockade) {
        this.onRaasBlockade = onRaasBlockade;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
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
