package org.kpmp.repositoryDataset;

import java.util.HashSet;
import java.util.TreeSet;

import org.apache.commons.text.WordUtils;

import java.util.Set;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RepositoryDatasetDisplay {
    private static final int UUID_LENGTH = 37;
    private String dlFileId;
    private String access;
    private String platform;
    private String releaseVersion;
    private String dataFormat;
    private String dataCategory;
    private String dataType;
    private Long fileSize;
    private String fileName;
    private String packageId;
    private String fileNameSort;
    private Set<String> protocol;
    private Set<String> tissueSource;
    private Set<String> experimentalStrategy;
    private Set<String> workflowType;
    private Set<String> redcapId;
    private Set<String> sampleType;
    private Set<String> enrollmentCategory;
    private Set<String> ageBinned;
    private Set<String> sex;
    private Set<String> doi;
    private Set<String> primaryAdjudicatedCategory;
    private Set<String> kdigoStage;
    private Set<String> baselineEgfr;
    private Set<String> proteinuria;
    private Set<String> a1c;
    private Set<String> albuminuria;
    private Set<String> diabetesDuration;
    private Set<String> diabetesHistory;
    private Set<String> hypertensionHistory;
    private Set<String> hypertensionDuration;
    private Set<String> race;
    private Set<String> onRaasBlockade;

    public RepositoryDatasetDisplay(RepositoryFileDataset repositoryFile) {
        dlFileId = repositoryFile.getId().getDlFileId();
        redcapId = new HashSet<String>();
        sampleType = new HashSet<String>();
        enrollmentCategory = new HashSet<String>();
        ageBinned = new HashSet<String>();
        sex = new HashSet<String>();
        doi = new TreeSet<String>();
        protocol = new HashSet<String>();
        tissueSource = new HashSet<String>();
        experimentalStrategy = new TreeSet<String>();
        workflowType = new HashSet<String>();
        a1c = new HashSet<String>();
        albuminuria = new HashSet<String>();
        baselineEgfr = new HashSet<String>();
        diabetesDuration = new HashSet<String>();
        diabetesHistory = new HashSet<String>();
        primaryAdjudicatedCategory = new HashSet<String>();
        kdigoStage = new HashSet<String>();
        proteinuria = new HashSet<String>();
        hypertensionDuration = new HashSet<String>();
        hypertensionHistory = new HashSet<String>();
        race = new HashSet<String>();
        onRaasBlockade = new HashSet<String>(); 

        redcapId.add(repositoryFile.getId().getRedcapId());
        if (shouldAdd(repositoryFile.getSampleType())) {
            sampleType.add(repositoryFile.getSampleType());
        }
        if (shouldAdd(repositoryFile.getEnrollmentCategory())) {
            enrollmentCategory.add(repositoryFile.getEnrollmentCategory());
        }
        if(shouldAdd(repositoryFile.getAgeBinned())){
            ageBinned.add(repositoryFile.getAgeBinned());
        }
        if(shouldAdd(repositoryFile.getSex())){
            sex.add(repositoryFile.getSex());
        }
        if(shouldAdd(repositoryFile.getId().getDoi())){
            doi.add(repositoryFile.getId().getDoi());
        }
        if(shouldAdd(repositoryFile.getProtocol())){
            protocol.add(repositoryFile.getProtocol());
        }
        if(shouldAdd(repositoryFile.getTissueSource())){
            tissueSource.add(repositoryFile.getTissueSource());
        }
        if(shouldAdd(repositoryFile.getId().getExperimentalStrategy())){
            experimentalStrategy.add(repositoryFile.getId().getExperimentalStrategy());
        }
        if(shouldAdd(repositoryFile.getWorkflowType())){
            workflowType.add(repositoryFile.getWorkflowType());
        }
        if(shouldAdd(repositoryFile.getA1c())){
            a1c.add(repositoryFile.getA1c());
        }
        if(shouldAdd(repositoryFile.getAlbuminuria())){
            albuminuria.add(repositoryFile.getAlbuminuria());
        }
        if(shouldAdd(repositoryFile.getBaselineEgfr())){
            baselineEgfr.add(repositoryFile.getBaselineEgfr());
        }
        if(shouldAdd(repositoryFile.getDiabetesDuration())){
            diabetesDuration.add(repositoryFile.getDiabetesDuration());
        }
        if(shouldAdd(repositoryFile.getDiabetesHistory())){
            diabetesHistory.add(repositoryFile.getDiabetesHistory());
        }
        if(shouldAdd(repositoryFile.getPrimaryAdjudicatedCategory())){
            primaryAdjudicatedCategory.add(repositoryFile.getPrimaryAdjudicatedCategory());
        }
        if(shouldAdd(repositoryFile.getKdigoStage())){
            kdigoStage.add(repositoryFile.getKdigoStage());
        }
        if(shouldAdd(repositoryFile.getProteinuria())){
            proteinuria.add(repositoryFile.getProteinuria());
        }
        if(shouldAdd(repositoryFile.getHypertensionDuration())){
            hypertensionDuration.add(repositoryFile.getHypertensionDuration());
        }
        if(shouldAdd(repositoryFile.getHypertensionHistory())){
            hypertensionHistory.add(repositoryFile.getHypertensionHistory());
        }
        if(shouldAdd(repositoryFile.getRace())){
            race.add(repositoryFile.getRace());
        }
        if(shouldAdd(repositoryFile.getOnRaasBlockade())){
            onRaasBlockade.add(repositoryFile.getOnRaasBlockade());
        }
        access = repositoryFile.getAccess();
        dataFormat = repositoryFile.getDataFormat();
        platform = repositoryFile.getPlatform();
        dataCategory = repositoryFile.getDataCategory();
        dataType = repositoryFile.getDataType();
        fileSize = repositoryFile.getFileSize();
        fileName = repositoryFile.getFileName();
        packageId = repositoryFile.getPackageId();
    }

    @JsonProperty("file_id")
    public String getDlFileId() {
        if(this.dlFileId == null || this.dlFileId.isEmpty()){
            return null;
        }else{
            return this.dlFileId;
        }
    }

    public void setDlFileId(String dlFileId) {
        this.dlFileId = dlFileId;
    }

    public void addRedCapId(String redcapId) {
        if(redcapId != null && !redcapId.isEmpty()){
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
        if(sampleType != null && !sampleType.isEmpty()){
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

    public void addEnrollmentCategory(String enrollmentCategory) {
        if(enrollmentCategory != null && !enrollmentCategory.isEmpty()){
            this.enrollmentCategory.add(enrollmentCategory);
        }
    }

    @JsonProperty("enrollment_category")
    public Set<String> getEnrollmentCategory() {
        if(enrollmentCategory.isEmpty()){
            return null;
        }else{
            return this.enrollmentCategory;
        }

    }

    public void setEnrollmentCategory(Set<String> enrollmentCategory) {
        this.enrollmentCategory = enrollmentCategory;
    }

    public void addAgeBinned(String ageBinned) {
        if(ageBinned != null && !ageBinned.isEmpty()){
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
        if(sex != null && !sex.isEmpty()){
            this.sex.add(sex);
        }
        
    }

    @JsonProperty("sex")
    public Set<String> getSex() {
        if(sex.isEmpty()){
            return null;
        }else{
            return sex;
        }
    }

    public void setSex(Set<String> sex) {
        this.sex = sex;
    }

    public void addDoi(String doi) {
        if (doi != null && !doi.isEmpty()){
            this.doi.add(doi);
        }
        
    }

    @JsonProperty("dois")
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
        if(this.access == null || this.access.isEmpty()){
            return null;
        }else{
            return access;
        }
    }

    public void setAccess(String access) {
        this.access = access;
    }

    @JsonProperty("platform")
    public String getPlatform() {
        if(this.platform == null || this.platform.isEmpty()){
            return null;
        }else{
            return this.platform;
        }
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    @JsonProperty("release_version")
    public String getReleaseVersion() {
        if(this.releaseVersion == null || this.releaseVersion.isEmpty()){
            return null;
        }else{
            return this.releaseVersion;
        }
    }

    public void setReleaseVersion(String releaseVersion) {
        this.releaseVersion = releaseVersion;
    }

    public void addProtocol(String protocol) {
        if(protocol != null && !protocol.isEmpty()){
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
        if(tissueSource != null && !tissueSource.isEmpty()){
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
        if(experimentalStrategy != null && !experimentalStrategy.isEmpty()){
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
        if(workflowType != null && !workflowType.isEmpty()){
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
        if(this.dataFormat == null || this.dataFormat.isEmpty()){
            return null;
        }else{
            return this.dataFormat;
        }
        
    }

    public void setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
    }

    @JsonProperty("data_category")
    public String getDataCategory() {
        if(this.dataCategory == null || this.dataCategory.isEmpty()){
            return null;
        }else{
            return this.dataCategory;
        }
    }

    public void setDataCategory(String dataCategory) {
        this.dataCategory = dataCategory;
    }

    @JsonProperty("data_type")
    public String getDataType() {
        if (this.dataType == null || this.dataType.isEmpty()){
            return null;
        }else{
            return this.dataType;
        }
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    @JsonProperty("file_size")
    public Long getFileSize() {
        if(this.fileSize == null){
            return null;
        }else{
            return this.fileSize;
        }
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    @JsonProperty("file_name")
    public String getFileName() {
        if(this.fileName == null || this.fileName.isEmpty()){
            return null;
        }else{
            return this.fileName;
        }
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @JsonProperty("package_id")
    public String getPackageId() {
        if(this.packageId == null || this.packageId.isEmpty()){
            return null;
        }else{
            return this.packageId;
        }
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    @JsonProperty("participant_id_sort")
    public String getParticipantIdSort() {
        if (redcapId.size() == 1) {
            return redcapId.toString().replace("-", "").replace("[", "").replace("]", "");
        } else {
            return "Multiple Participants";
        }
    }

    @JsonProperty("experimental_strategy_sort")
    public String getExperimentalStrategySort() {
        return String.join(",", experimentalStrategy);
    }

    @JsonProperty("file_name_sort")
    public String getFileNameSort() {
        if(this.fileName == null || this.fileName.isEmpty()){
            return null;
        }else{
            fileNameSort = fileName.substring(UUID_LENGTH, fileName.length());
            return fileNameSort;
        }
        
    }

    @JsonProperty("doi_sort")
    public String getDoiStrategySort() {
        return String.join(",", doi);
    }

    public void setFileNameSort(String fileNameSort) {
        this.fileNameSort = fileNameSort;
    }

    @JsonProperty("platform_sort")
    public String getPlatformSort() {
        return (platform == null || platform.isEmpty()) ? "aaaaa" : platform.toUpperCase();
    }

    private boolean shouldAdd(String value) {
        if (value == null || value.isEmpty()) {
            return false;
        }
        return true;
    }

    @JsonProperty("primary_adjudicated_category")
    public Set<String> getPrimaryAdjudicatedCategory() {
        if(this.primaryAdjudicatedCategory.isEmpty() ){
            return null;
        }else{
            return this.primaryAdjudicatedCategory;
        }
    }

    public void addPrimaryAdjudicatedCategory(String primaryAdjudicatedCategory) {
        if(primaryAdjudicatedCategory != null && !primaryAdjudicatedCategory.isEmpty()){
            this.primaryAdjudicatedCategory.add(primaryAdjudicatedCategory);
        }
    }

    public void setPrimaryAdjudicatedCat(Set<String> primaryAdjudicatedCategory) {
        this.primaryAdjudicatedCategory = primaryAdjudicatedCategory;
    }

    @JsonProperty("kdigo_stage")
    public Set<String> getKdigoStage() {
        if(this.kdigoStage.isEmpty()){
            return null;
        }else{
            return this.kdigoStage;
        }
    }

    public void addKdigoStage(String kdigoStage) {
        if(kdigoStage != null && !kdigoStage.isEmpty()){
            this.kdigoStage.add(kdigoStage);
        }
    }

    public void setKdigoStage(Set<String> kdigoStage) {
        this.kdigoStage = kdigoStage;
    }

    @JsonProperty("baseline_egfr")
    public Set<String> getBaselineEgfr() {
        if(this.baselineEgfr.isEmpty()){
            return null;
        }else{
            return this.baselineEgfr;
        }
    }

    public void addBaselineEgfr(String baselineEgfr) {
        if(baselineEgfr != null && !baselineEgfr.isEmpty()){
            this.baselineEgfr.add(baselineEgfr);
        }
    }

    public void setBaselineEgfr(Set<String> baselineEgfr) {
        this.baselineEgfr = baselineEgfr;
    }

    @JsonProperty("proteinuria")
    public Set<String> getProteinuria() {
        if(this.proteinuria.isEmpty()){
            return null;
        }else{
            return this.proteinuria;
        }
    }

    public void addProteinuria(String proteinuria) {
        if(proteinuria != null && !proteinuria.isEmpty()){
            this.proteinuria.add(proteinuria);
        }
    }

    public void setProteinuria(Set<String> proteinuria) {
        this.proteinuria = proteinuria;
    }

    @JsonProperty("a1c")
    public Set<String> getA1c() {
        if(this.a1c.isEmpty()){
            return null;
        }else{
            return this.a1c;
        }
    }

    public void addA1c(String a1c) {
        if(a1c != null && !a1c.isEmpty()){
            this.a1c.add(a1c);
        }
    }

    public void setA1c(Set<String> a1c) {
        this.a1c = a1c;
    }

    @JsonProperty("albuminuria")
    public Set<String> getAlbuminuria() {
        if(this.albuminuria.isEmpty()){
            return null;
        }else{
            return this.albuminuria;
        }
    }

    public void addAlbuminuria(String albuminuria) {
        if(albuminuria != null && !albuminuria.isEmpty()){
            this.albuminuria.add(albuminuria);
        }
    }

    public void setAlbuminuria(Set<String> albuminuria) {
        this.albuminuria = albuminuria;
    }

    @JsonProperty("diabetes_duration")
    public Set<String> getDiabetesDuration() {
        if(this.diabetesDuration.isEmpty()){
            return null;
        }else{
            return this.diabetesDuration;
        }
    }

    public void addDiabetesDuration(String diabetesDuration) {
        if(diabetesDuration != null && !diabetesDuration.isEmpty()){
            this.diabetesDuration.add(diabetesDuration);
        }
    }

    public void setDiabetesDuration(Set<String> diabetesDuration) {
        this.diabetesDuration = diabetesDuration;
    }

    @JsonProperty("diabetes_history")
    public Set<String> getDiabetesHistory() {
        if(this.diabetesHistory.isEmpty()){
            return null;
        }else{
            return fixCapitalization(this.diabetesHistory);
        }
    }

    public void addDiabetesHistory(String diabetesHistory) {
        if(diabetesHistory != null && !diabetesHistory.isEmpty()){
            this.diabetesHistory.add(diabetesHistory);
        }
    }

    public void setDiabetesHistory(Set<String> diabetesHistory) {
        this.diabetesHistory = diabetesHistory;
    }

    @JsonProperty("hypertension_history")
    public Set<String> getHypertensionHistory() {
        if(this.hypertensionHistory.isEmpty()){
            return null;
        }else{
            return fixCapitalization(this.hypertensionHistory);
        }
    }

    public void addHypertensionHistory(String hypertensionHistory) {
        if(hypertensionHistory != null && !hypertensionHistory.isEmpty()){
            this.hypertensionHistory.add(hypertensionHistory);
        }
    }

    public void setHypertensionHistory(Set<String> hypertensionHistory) {
        this.hypertensionHistory = hypertensionHistory;
    }

    @JsonProperty("hypertension_duration")
    public Set<String> getHypertensionDuration() {
        if(this.hypertensionDuration.isEmpty()){
            return null;
        }else{
            return this.hypertensionDuration;
        }
    }

    public void addHypertensionDuration(String hypertensionDuration) {
        if(hypertensionDuration != null && !hypertensionDuration.isEmpty()){
            this.hypertensionDuration.add(hypertensionDuration);
        }
    }

    public void setHypertensionDuration(Set<String> hypertensionDuration) {
        this.hypertensionDuration = hypertensionDuration;
    }

    @JsonProperty("race")
    public Set<String> getRace() {
        if(this.race.isEmpty()){
            return null;
        }else{
            return this.race;
        }
    }

    public void addRace(String race) {
        if(race != null && !race.isEmpty()){
            this.race.add(race);
        }
    }

    public void setRace(Set<String> race) {
        this.race = race;
    }

    @JsonProperty("on_raas_blockade")
    public Set<String> getOnRaasBlockade() {
        if(this.onRaasBlockade.isEmpty()){
            return null;
        }else{
            return this.onRaasBlockade;
        }
    }

    public void addOnRaasBlockade(String onRaasBlockade) {
        if(onRaasBlockade != null && !onRaasBlockade.isEmpty()){
            this.onRaasBlockade.add(onRaasBlockade);
        }
    }

    public void setOnRaasBlockade(Set<String> onRaasBlockade) {
        this.onRaasBlockade = onRaasBlockade;
    }

    public Set<String> fixCapitalization(Set<String> input){
        Set<String> wordList = new HashSet<String>();
        for (String string : input) {
            String updatedInput = WordUtils.capitalizeFully(string);
            wordList.add(updatedInput);
        }
        return wordList;
    }
}