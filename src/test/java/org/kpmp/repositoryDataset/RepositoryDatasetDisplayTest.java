package org.kpmp.repositoryDataset;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RepositoryDatasetDisplayTest {
  private RepositoryDatasetDisplay repositoryDatasetDisplay;
  private RepositoryFileDataset repositoryFile;

  @BeforeEach
  public void setUp() throws Exception {
    repositoryDatasetDisplay = new RepositoryDatasetDisplay(repositoryFile);
  }

  @AfterEach
  public void tearDown() throws Exception {
    repositoryDatasetDisplay = null;
  }

  @Test
  public void setDlFileId() {
    repositoryDatasetDisplay.setDlFileId("abc_123");
    assertEquals("abc_123", repositoryDatasetDisplay.getDlFileId());

  }

  @Test
  public void testAddRedCapId() {
    assertEquals(0, repositoryDatasetDisplay.getRedcapId().size());

    RepositoryDatasetDisplay repositoryDatasetDisplay = new RepositoryDatasetDisplay(repositoryFile);
    repositoryDatasetDisplay.addRedCapId("redcap_id");

    assertEquals(1, repositoryDatasetDisplay.getRedcapId().size());
    assertEquals(repositoryDatasetDisplay, repositoryDatasetDisplay.getRedcapId());
  }

  @Test
  public void setRedcapId(){
    Set<String> expected = new HashSet<String>(Arrays.asList("redcap_id", "redcap_id2"));
    Set<String> actual = repositoryDatasetDisplay.getRedcapId();
    assertEquals(expected, actual);
  }

  @Test
  public void testAddSampleType(){
    assertEquals(0, repositoryDatasetDisplay.getSampleType().size());

    RepositoryDatasetDisplay repositoryDatasetDisplay = new RepositoryDatasetDisplay(repositoryFile);
    repositoryDatasetDisplay.addSampleType("sample_type");

    assertEquals(1, repositoryDatasetDisplay.getSampleType().size());
    assertEquals(repositoryDatasetDisplay, repositoryDatasetDisplay.getSampleType());
  }

  @Test
  public void setSampleType() {
    Set<String> expected = new HashSet<String>(Arrays.asList("sample_type"));
    Set<String> actual = repositoryDatasetDisplay.getSampleType();
    assertEquals(expected, actual);
  }

  @Test
  public void testAddTissueType() {
    assertEquals(0, repositoryDatasetDisplay.getTissueType().size());

    RepositoryDatasetDisplay repositoryDatasetDisplay = new RepositoryDatasetDisplay(repositoryFile);
    repositoryDatasetDisplay.addTissueType("tissue_type");

    assertEquals(1, repositoryDatasetDisplay.getTissueType().size());
    assertEquals(repositoryDatasetDisplay, repositoryDatasetDisplay.getTissueType());
  }

  @Test
  public void setTissueType() {
    Set<String> expected = new HashSet<String>(Arrays.asList("tissue_type"));
    Set<String> actual = repositoryDatasetDisplay.getTissueType();
    assertEquals(expected, actual);
  }

  @Test
  public void testAddAgeBinned() {
    assertEquals(0, repositoryDatasetDisplay.getAgeBinned().size());

    RepositoryDatasetDisplay repositoryDatasetDisplay = new RepositoryDatasetDisplay(repositoryFile);
    repositoryDatasetDisplay.addAgeBinned("40-49");

    assertEquals(1, repositoryDatasetDisplay.getAgeBinned().size());
    assertEquals(repositoryDatasetDisplay, repositoryDatasetDisplay.getAgeBinned());
  }

  @Test
  public void setAgeBinned() {
    Set<String> expected = new HashSet<String>(Arrays.asList("40-49"));
    Set<String> actual = repositoryDatasetDisplay.getAgeBinned();
    assertEquals(expected, actual);
  }

  @Test
  public void testAddSex() {
    assertEquals(0, repositoryDatasetDisplay.getSex().size());

    RepositoryDatasetDisplay repositoryDatasetDisplay = new RepositoryDatasetDisplay(repositoryFile);
    repositoryDatasetDisplay.addSex("Female");

    assertEquals(1, repositoryDatasetDisplay.getSex().size());
    assertEquals(repositoryDatasetDisplay, repositoryDatasetDisplay.getSex());
  }

  @Test
  public void setSex() {
    Set<String> expected = new HashSet<String>(Arrays.asList("male"));
    Set<String> actual = repositoryDatasetDisplay.getSex();
    assertEquals(expected, actual);
  }

  @Test
  public void testAddDoi() {
    assertEquals(0, repositoryDatasetDisplay.getDoi().size());

    RepositoryDatasetDisplay repositoryDatasetDisplay = new RepositoryDatasetDisplay(repositoryFile);
    repositoryDatasetDisplay.addDoi("doi");

    assertEquals(1, repositoryDatasetDisplay.getDoi().size());
    assertEquals(repositoryDatasetDisplay, repositoryDatasetDisplay.getDoi());
  }

  @Test
  public void setDoi() {
    Set<String> expected = new HashSet<String>(Arrays.asList("doi"));
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
    assertEquals(0, repositoryDatasetDisplay.getProtocol().size());

    RepositoryDatasetDisplay repositoryDatasetDisplay = new RepositoryDatasetDisplay(repositoryFile);
    repositoryDatasetDisplay.addProtocol("protocol");

    assertEquals(1, repositoryDatasetDisplay.getProtocol().size());
    assertEquals(repositoryDatasetDisplay, repositoryDatasetDisplay.getProtocol());
  }

  @Test
  public void setProtocol() {
    Set<String> expected = new HashSet<String>(Arrays.asList("Protocol"));
    Set<String> actual = repositoryDatasetDisplay.getProtocol();
    assertEquals(expected, actual);
  }

  @Test
  public void testAddTissueSource() {
    assertEquals(0, repositoryDatasetDisplay.getTissueSource().size());

    RepositoryDatasetDisplay repositoryDatasetDisplay = new RepositoryDatasetDisplay(repositoryFile);
    repositoryDatasetDisplay.addTissueSource("tissue_source");

    assertEquals(1, repositoryDatasetDisplay.getTissueSource().size());
    assertEquals(repositoryDatasetDisplay, repositoryDatasetDisplay.getTissueSource());
  }

  @Test
  public void setTissueSource() {
    Set<String> expected = new HashSet<String>(Arrays.asList("kidneys"));
    Set<String> actual = repositoryDatasetDisplay.getTissueSource();
    assertEquals(expected, actual);
  }

  @Test
  public void testAddExperimentalStrategy() {
    assertEquals(0, repositoryDatasetDisplay.getExperimentalStrategy().size());

    RepositoryDatasetDisplay repositoryDatasetDisplay = new RepositoryDatasetDisplay(repositoryFile);
    repositoryDatasetDisplay.addExperimentalStrategy("experimental_strategy");

    assertEquals(1, repositoryDatasetDisplay.getExperimentalStrategy().size());
    assertEquals(repositoryDatasetDisplay, repositoryDatasetDisplay.getExperimentalStrategy());
  }

  @Test
  public void setExperimentalStrategy() {
    Set<String> expected = new HashSet<String>(Arrays.asList("experimental strategy"));
    Set<String> actual = repositoryDatasetDisplay.getExperimentalStrategy();
    assertEquals(expected, actual);
  }

  @Test
  public void testAddWorkflowType() {
    assertEquals(0, repositoryDatasetDisplay.getWorkflowType().size());

    RepositoryDatasetDisplay repositoryDatasetDisplay = new RepositoryDatasetDisplay(repositoryFile);
    repositoryDatasetDisplay.addWorkflowType("workflow_type");
    
    assertEquals(1, repositoryDatasetDisplay.getWorkflowType().size());
    assertEquals(repositoryDatasetDisplay, repositoryDatasetDisplay.getWorkflowType());
  }

  @Test
  public void setWorkflowType() {
    Set<String> expected = new HashSet<String>(Arrays.asList("workflowType"));
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
    repositoryDatasetDisplay.getParticipantIdSort();
    assertEquals("Multiple Participants", repositoryDatasetDisplay.getParticipantIdSort());
  }

  @Test
  public void setFileNameSort() {
    repositoryDatasetDisplay.setFileNameSort("this_file_name_has_thirty_seven_chrs_filename.docx");
    assertEquals("filename.docx", repositoryDatasetDisplay.getFileNameSort());
  }

  @Test
  public void setPlatformSort(){
    repositoryDatasetDisplay.getPlatformSort();
    assertEquals("aaaaa", repositoryDatasetDisplay.getPlatformSort());
  }
}
 