package org.kpmp.repositoryDataset;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class RepositoryDatasetDisplayTest {
  @Mock
  private RepositoryDatasetDisplay repositoryDatasetDisplay;
  @Mock
  private RepositoryFileDataset repositoryFile;
  @Mock
  private RepositoryFileDatasetId repositoryFileId;

  @BeforeEach
  public void setUp() throws Exception {
    MockitoAnnotations.openMocks(this);
    
    when(repositoryFile.getId()).thenReturn(repositoryFileId);
    repositoryDatasetDisplay = new RepositoryDatasetDisplay(repositoryFile);
  }

  @AfterEach
  public void tearDown() throws Exception {
    MockitoAnnotations.openMocks(this).close();
    repositoryDatasetDisplay = null;
    repositoryFile = null;
  }

 @Test
public void setDlFileId() {
    repositoryDatasetDisplay.setDlFileId("DataLakeId");

    assertEquals("DataLakeId", repositoryDatasetDisplay.getDlFileId());
}


  @Test
  public void testAddRedCapId() {
    assertEquals(1, repositoryDatasetDisplay.getRedcapId().size());

    RepositoryDatasetDisplay repositoryDatasetDisplay = new RepositoryDatasetDisplay(repositoryFile);
    repositoryDatasetDisplay.addRedCapId("redcap_id");

    assertEquals(2, repositoryDatasetDisplay.getRedcapId().size());
    assertEquals(true ,repositoryDatasetDisplay.getRedcapId().contains("redcap_id"));
  }

  @Test
  public void setRedcapId(){
    Set<String> expected = new HashSet<String>(Arrays.asList("redcap_id", "redcap_id2"));
    repositoryDatasetDisplay.setRedcapId(expected);
    Set<String> actual = repositoryDatasetDisplay.getRedcapId();
    assertEquals(expected, actual);
  }

  @Test
  public void testAddSampleType(){

    RepositoryDatasetDisplay repositoryDatasetDisplay = new RepositoryDatasetDisplay(repositoryFile);
    repositoryDatasetDisplay.addSampleType("sample_type");

    assertEquals(1, repositoryDatasetDisplay.getSampleType().size());
    assertEquals(true, repositoryDatasetDisplay.getSampleType().contains("sample_type"));
  }

  @Test
  public void setSampleType() {
    Set<String> expected = new HashSet<String>(Arrays.asList("sample_type"));
    repositoryDatasetDisplay.setSampleType(expected);
    Set<String> actual = repositoryDatasetDisplay.getSampleType();
    assertEquals(expected, actual);
  }

  @Test
  public void testAddEnrollmentCategory() {
    RepositoryDatasetDisplay repositoryDatasetDisplay = new RepositoryDatasetDisplay(repositoryFile);
    repositoryDatasetDisplay.addEnrollmentCategory("enrollment_category");
    assertEquals(1, repositoryDatasetDisplay.getEnrollmentCategory().size());
  }

  @Test
  public void setEnrollmentCategory() {
    Set<String> expected = new HashSet<String>(Arrays.asList("enrollment_category"));
    repositoryDatasetDisplay.setEnrollmentCategory(expected);
    Set<String> actual = repositoryDatasetDisplay.getEnrollmentCategory();
    assertEquals(expected, actual);
  }

  @Test
  public void testAddAgeBinned() {
    RepositoryDatasetDisplay repositoryDatasetDisplay = new RepositoryDatasetDisplay(repositoryFile);
    repositoryDatasetDisplay.addAgeBinned("40-49");

    assertEquals(1, repositoryDatasetDisplay.getAgeBinned().size());
    assertEquals(true, repositoryDatasetDisplay.getAgeBinned().contains("40-49"));
  }

  @Test
  public void setAgeBinned() {
    Set<String> expected = new HashSet<String>(Arrays.asList("40-49"));
    repositoryDatasetDisplay.setAgeBinned(expected);
    Set<String> actual = repositoryDatasetDisplay.getAgeBinned();
    assertEquals(expected, actual);
  }

  @Test
  public void testAddSex() {
    RepositoryDatasetDisplay repositoryDatasetDisplay = new RepositoryDatasetDisplay(repositoryFile);
    repositoryDatasetDisplay.addSex("Female");

    assertEquals(1, repositoryDatasetDisplay.getSex().size());
    assertEquals(true, repositoryDatasetDisplay.getSex().contains("Female"));
  }

  @Test
  public void setSex() {
    Set<String> expected = new HashSet<String>(Arrays.asList("male"));
    repositoryDatasetDisplay.setSex(expected);
    Set<String> actual = repositoryDatasetDisplay.getSex();
    assertEquals(expected, actual);
  }

  @Test
  public void testAddDoi() {

    RepositoryDatasetDisplay repositoryDatasetDisplay = new RepositoryDatasetDisplay(repositoryFile);
    repositoryDatasetDisplay.addDoi("doi");

    assertEquals(1, repositoryDatasetDisplay.getDoi().size());
    assertEquals(true, repositoryDatasetDisplay.getDoi().contains("doi"));
  }

  @Test
  public void setDoi() {
    Set<String> expected = new HashSet<String>(Arrays.asList("doi"));
    repositoryDatasetDisplay.setDoi(expected);
    Set<String> actual = repositoryDatasetDisplay.getDoi();
    assertEquals(expected, actual);
  }

  @Test
  public void setAccess(){
    repositoryDatasetDisplay.setAccess("controlled");
    assertEquals("controlled", repositoryDatasetDisplay.getAccess());
  }

  @Test
  public void setPlatform() {
    repositoryDatasetDisplay.setPlatform("platform");
    assertEquals("platform", repositoryDatasetDisplay.getPlatform());
  }

  @Test
  public void setReleaseVersion() {
    repositoryDatasetDisplay.setReleaseVersion("54");
    assertEquals("54", repositoryDatasetDisplay.getReleaseVersion());
  }

  @Test
  public void testAddProtocol() {

    RepositoryDatasetDisplay repositoryDatasetDisplay = new RepositoryDatasetDisplay(repositoryFile);
    repositoryDatasetDisplay.addProtocol("protocol");

    assertEquals(1, repositoryDatasetDisplay.getProtocol().size());
    assertEquals(true, repositoryDatasetDisplay.getProtocol().contains("protocol"));
  }

  @Test
  public void setProtocol() {
    Set<String> expected = new HashSet<String>(Arrays.asList("Protocol"));
    repositoryDatasetDisplay.setProtocol(expected);
    Set<String> actual = repositoryDatasetDisplay.getProtocol();
    assertEquals(expected, actual);
  }

  @Test
  public void testAddTissueSource() {

    RepositoryDatasetDisplay repositoryDatasetDisplay = new RepositoryDatasetDisplay(repositoryFile);
    repositoryDatasetDisplay.addTissueSource("tissueSource");

    assertEquals(1, repositoryDatasetDisplay.getTissueSource().size());
    assertEquals(true, repositoryDatasetDisplay.getTissueSource().contains("tissueSource"));
  }

  @Test
  public void setTissueSource() {
    Set<String> expected = new HashSet<String>(Arrays.asList("kidneys"));
    repositoryDatasetDisplay.setTissueSource(expected);
    Set<String> actual = repositoryDatasetDisplay.getTissueSource();
    assertEquals(expected, actual);
  }

  @Test
  public void testAddExperimentalStrategy() {
    RepositoryDatasetDisplay repositoryDatasetDisplay = new RepositoryDatasetDisplay(repositoryFile);
    repositoryDatasetDisplay.addExperimentalStrategy("experimental_strategy");

    assertEquals(1, repositoryDatasetDisplay.getExperimentalStrategy().size());
    assertEquals(true, repositoryDatasetDisplay.getExperimentalStrategy().contains("experimental_strategy"));
  }

  @Test
  public void setExperimentalStrategy() {
    Set<String> expected = new HashSet<String>(Arrays.asList("experimental strategy"));
    repositoryDatasetDisplay.setExperimentalStrategy(expected);
    Set<String> actual = repositoryDatasetDisplay.getExperimentalStrategy();
    assertEquals(expected, actual);
  }

  @Test
  public void testAddWorkflowType() {

    RepositoryDatasetDisplay repositoryDatasetDisplay = new RepositoryDatasetDisplay(repositoryFile);
    repositoryDatasetDisplay.addWorkflowType("workflow_type");

    assertEquals(1, repositoryDatasetDisplay.getWorkflowType().size());
    assertEquals(true, repositoryDatasetDisplay.getWorkflowType().contains("workflow_type"));
  }

  @Test
  public void setWorkflowType() {
    Set<String> expected = new HashSet<String>(Arrays.asList("workflowType"));
    repositoryDatasetDisplay.setWorkflowType(expected);
    Set<String> actual = repositoryDatasetDisplay.getWorkflowType();
    assertEquals(expected, actual);
  }

  @Test
  public void setDataformat() {
    repositoryDatasetDisplay.setDataFormat(".xlsx");
    assertEquals(".xlsx", repositoryDatasetDisplay.getDataFormat());
  }

  @Test
  public void setDataCategory() {
    repositoryDatasetDisplay.setDataCategory("category");
    assertEquals("category", repositoryDatasetDisplay.getDataCategory());
  }

  @Test
  public void setDataType(){
    repositoryDatasetDisplay.setDataType("dataType");
    assertEquals("dataType", repositoryDatasetDisplay.getDataType());
  }

  @Test
  public void setFileSize() {
    Long size = 9L;
    repositoryDatasetDisplay.setFileSize(size);
    assertEquals(9L, repositoryDatasetDisplay.getFileSize());
  }

  @Test
  public void setFileName() {
    repositoryDatasetDisplay.setFileName("FileName");
    assertEquals("FileName", repositoryDatasetDisplay.getFileName());
  }

  @Test
  public void setPackageId(){
    repositoryDatasetDisplay.setPackageId("packageId");
    assertEquals("packageId", repositoryDatasetDisplay.getPackageId());
  }

  @Test
  public void setParticipantIdSort() {
    Set<String> redcapIds = new HashSet<String>(Arrays.asList("redcap_id", "redcap_id2"));
    repositoryDatasetDisplay.setRedcapId(redcapIds);
    repositoryDatasetDisplay.getParticipantIdSort();
    assertEquals("Multiple Participants", repositoryDatasetDisplay.getParticipantIdSort());
  }

  @Test
  public void setFileNameSort() {
    repositoryDatasetDisplay.setFileName("this_file_name_has_thirty_seven_chrs_filename.docx");
    assertEquals("filename.docx", repositoryDatasetDisplay.getFileNameSort());
  }

  @Test
  public void setPlatformSort(){
    repositoryDatasetDisplay.getPlatformSort();
    assertEquals("aaaaa", repositoryDatasetDisplay.getPlatformSort());

    repositoryDatasetDisplay.setPlatform("platform");
    assertEquals("PLATFORM", repositoryDatasetDisplay.getPlatformSort());
  }

  @Test
  public void setKdigoStage() {
    Set<String> expected = new HashSet<String>(Arrays.asList("kdigo_stage"));
    repositoryDatasetDisplay.setKdigoStage(expected);
    Set<String> actual = repositoryDatasetDisplay.getKdigoStage();
    assertEquals(expected, actual);
  }

  @Test
  public void testAddKdigoStage() {
    RepositoryDatasetDisplay repositoryDatasetDisplay = new RepositoryDatasetDisplay(repositoryFile);
    repositoryDatasetDisplay.addKdigoStage("kdigo_stage");
    assertEquals(1, repositoryDatasetDisplay.getKdigoStage().size());
  }

  @Test
  public void setPrimaryAdjudicatedCat(){
    Set<String> expected = new HashSet<String>(Arrays.asList("category"));
    repositoryDatasetDisplay.setPrimaryAdjudicatedCat(expected);
    Set<String> actual = repositoryDatasetDisplay.getPrimaryAdjudicatedCategory();
    assertEquals(expected, actual);
  }

  @Test
  public void testAddPrimaryAdjudicatedCat() {
    RepositoryDatasetDisplay repositoryDatasetDisplay = new RepositoryDatasetDisplay(repositoryFile);
    repositoryDatasetDisplay.addPrimaryAdjudicatedCategory("category");
    assertEquals(1, repositoryDatasetDisplay.getPrimaryAdjudicatedCategory().size());
  }

  @Test
  public void setBaselineEgfr(){
    Set<String> expected = new HashSet<String>(Arrays.asList("baseline"));
    repositoryDatasetDisplay.setBaselineEgfr(expected);
    Set<String> actual = repositoryDatasetDisplay.getBaselineEgfr();
    assertEquals(expected, actual);
  }

  @Test
  public void testAddBaselineEgfr() {
    RepositoryDatasetDisplay repositoryDatasetDisplay = new RepositoryDatasetDisplay(repositoryFile);
    repositoryDatasetDisplay.addBaselineEgfr("baseline");
    assertEquals(1, repositoryDatasetDisplay.getBaselineEgfr().size());
  }

  @Test
  public void testSetProteinuria(){
    Set<String> expected = new HashSet<String>(Arrays.asList("proteinuria"));
    repositoryDatasetDisplay.setProteinuria(expected);
    Set<String> actual = repositoryDatasetDisplay.getProteinuria();
    assertEquals(expected, actual);
  }

  @Test
  public void testAddProteinuria() {
    RepositoryDatasetDisplay repositoryDatasetDisplay = new RepositoryDatasetDisplay(repositoryFile);
    repositoryDatasetDisplay.addProteinuria("proteinuria");
    assertEquals(1, repositoryDatasetDisplay.getProteinuria().size());
  }

  @Test
  public void testSetA1c(){
    Set<String> expected = new HashSet<String>(Arrays.asList("a1c"));
    repositoryDatasetDisplay.setA1c(expected);
    Set<String> actual = repositoryDatasetDisplay.getA1c();
    assertEquals(expected, actual);
  }

  @Test
  public void testAddA1c() {
    RepositoryDatasetDisplay repositoryDatasetDisplay = new RepositoryDatasetDisplay(repositoryFile);
    repositoryDatasetDisplay.addA1c("A1c");
    assertEquals(1, repositoryDatasetDisplay.getA1c().size());
  }

  @Test
  public void testSetAlbuminuria(){
    Set<String> expected = new HashSet<String>(Arrays.asList("albuminuria"));
    repositoryDatasetDisplay.setAlbuminuria(expected);
    Set<String> actual = repositoryDatasetDisplay.getAlbuminuria();
    assertEquals(expected, actual);
  }

  @Test
  public void testAddAlbuminuria() {
    RepositoryDatasetDisplay repositoryDatasetDisplay = new RepositoryDatasetDisplay(repositoryFile);
    repositoryDatasetDisplay.addAlbuminuria("albuminuria");
    assertEquals(1, repositoryDatasetDisplay.getAlbuminuria().size());
  }

  @Test
  public void testAddDiabetesDuration() {
    RepositoryDatasetDisplay repositoryDatasetDisplay = new RepositoryDatasetDisplay(repositoryFile);
    repositoryDatasetDisplay.addDiabetesDuration("A1c");
    assertEquals(1, repositoryDatasetDisplay.getDiabetesDuration().size());
  }

  @Test
  public void testSetDiabetesDuration(){
    Set<String> expected = new HashSet<String>(Arrays.asList("duration"));
    repositoryDatasetDisplay.setDiabetesDuration(expected);
    Set<String> actual = repositoryDatasetDisplay.getDiabetesDuration();
    assertEquals(expected, actual);
  }

  @Test
  public void testAddDiabetesHistory() {
    RepositoryDatasetDisplay repositoryDatasetDisplay = new RepositoryDatasetDisplay(repositoryFile);
    repositoryDatasetDisplay.addDiabetesHistory("history");
    assertEquals(1, repositoryDatasetDisplay.getDiabetesHistory().size());
  }

  @Test
  public void testSetDiabetesHistory(){
    Set<String> expected = new HashSet<String>(Arrays.asList("dOn't KNoW"));
    repositoryDatasetDisplay.setDiabetesHistory(expected);
    Set<String> actual = repositoryDatasetDisplay.getDiabetesHistory();
    assertEquals(new HashSet<String>(Arrays.asList("Don't Know")), actual);
  }

  @Test
  public void testAddHypertensionDuration() {
    RepositoryDatasetDisplay repositoryDatasetDisplay = new RepositoryDatasetDisplay(repositoryFile);
    repositoryDatasetDisplay.addHypertensionDuration("duration");
    assertEquals(1, repositoryDatasetDisplay.getHypertensionDuration().size());
  }

  @Test
  public void testSetHypertensionDuration(){
    Set<String> expected = new HashSet<String>(Arrays.asList("duration"));
    repositoryDatasetDisplay.setHypertensionDuration(expected);
    Set<String> actual = repositoryDatasetDisplay.getHypertensionDuration();
    assertEquals(expected, actual);
  }

  @Test
  public void testAddHypertensionHistory() {
    RepositoryDatasetDisplay repositoryDatasetDisplay = new RepositoryDatasetDisplay(repositoryFile);
    repositoryDatasetDisplay.addHypertensionHistory("don't KnoW");
    assertEquals(1, repositoryDatasetDisplay.getHypertensionHistory().size());
  }

  @Test
  public void testSetHypertensionHistory(){
    Set<String> expected = new HashSet<String>(Arrays.asList("dOn't KNoW"));
    repositoryDatasetDisplay.setHypertensionHistory(expected);
    Set<String> actual = repositoryDatasetDisplay.getHypertensionHistory();
    assertEquals(new HashSet<String>(Arrays.asList("Don't Know")), actual);
  }

  @Test
  public void testAddRace() {
    RepositoryDatasetDisplay repositoryDatasetDisplay = new RepositoryDatasetDisplay(repositoryFile);
    repositoryDatasetDisplay.addRace("race");
    assertEquals(1, repositoryDatasetDisplay.getRace().size());
  }

  @Test
  public void testSetRace(){
    Set<String> expected = new HashSet<String>(Arrays.asList("race"));
    repositoryDatasetDisplay.setRace(expected);
    Set<String> actual = repositoryDatasetDisplay.getRace();
    assertEquals(expected, actual);
  }

  @Test
  public void testAddOnRaasBlockade() {
    RepositoryDatasetDisplay repositoryDatasetDisplay = new RepositoryDatasetDisplay(repositoryFile);
    repositoryDatasetDisplay.addOnRaasBlockade("OnRaasBlockade");
    assertEquals(1, repositoryDatasetDisplay.getOnRaasBlockade().size());
  }

  @Test
  public void testSetOnRaasBlockade(){
    Set<String> expected = new HashSet<String>(Arrays.asList("onRaasBlockade"));
    repositoryDatasetDisplay.setOnRaasBlockade(expected);
    Set<String> actual = repositoryDatasetDisplay.getOnRaasBlockade();
    assertEquals(expected, actual);
  }
}
 