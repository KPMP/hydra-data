package org.kpmp.repositoryDataset;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
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
    assertEquals(1, repositoryDatasetDisplay.getSampleType().size());

    RepositoryDatasetDisplay repositoryDatasetDisplay = new RepositoryDatasetDisplay(repositoryFile);
    repositoryDatasetDisplay.addSampleType("sample_type");

    assertEquals(2, repositoryDatasetDisplay.getSampleType().size());
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
  public void testAddTissueType() {
    assertEquals(1, repositoryDatasetDisplay.getTissueType().size());

    RepositoryDatasetDisplay repositoryDatasetDisplay = new RepositoryDatasetDisplay(repositoryFile);
    repositoryDatasetDisplay.addTissueType("tissue_type");

    assertEquals(2, repositoryDatasetDisplay.getTissueType().size());
    assertEquals(true, repositoryDatasetDisplay.getTissueType().contains("tissue_type"));
  }

  @Test
  public void setTissueType() {
    Set<String> expected = new HashSet<String>(Arrays.asList("tissue_type"));
    repositoryDatasetDisplay.setTissueType(expected);
    Set<String> actual = repositoryDatasetDisplay.getTissueType();
    assertEquals(expected, actual);
  }

  @Test
  public void testAddAgeBinned() {
    assertEquals(1, repositoryDatasetDisplay.getAgeBinned().size());

    RepositoryDatasetDisplay repositoryDatasetDisplay = new RepositoryDatasetDisplay(repositoryFile);
    repositoryDatasetDisplay.addAgeBinned("40-49");

    assertEquals(2, repositoryDatasetDisplay.getAgeBinned().size());
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
    assertEquals(1, repositoryDatasetDisplay.getSex().size());

    RepositoryDatasetDisplay repositoryDatasetDisplay = new RepositoryDatasetDisplay(repositoryFile);
    repositoryDatasetDisplay.addSex("Female");

    assertEquals(2, repositoryDatasetDisplay.getSex().size());
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
    assertEquals(1, repositoryDatasetDisplay.getDoi().size());

    RepositoryDatasetDisplay repositoryDatasetDisplay = new RepositoryDatasetDisplay(repositoryFile);
    repositoryDatasetDisplay.addDoi("doi");

    assertEquals(2, repositoryDatasetDisplay.getDoi().size());
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
    assertEquals(1, repositoryDatasetDisplay.getProtocol().size());

    RepositoryDatasetDisplay repositoryDatasetDisplay = new RepositoryDatasetDisplay(repositoryFile);
    repositoryDatasetDisplay.addProtocol("protocol");

    assertEquals(2, repositoryDatasetDisplay.getProtocol().size());
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
    assertEquals(1, repositoryDatasetDisplay.getTissueSource().size());

    RepositoryDatasetDisplay repositoryDatasetDisplay = new RepositoryDatasetDisplay(repositoryFile);
    repositoryDatasetDisplay.addTissueSource("tissueSource");

    assertEquals(2, repositoryDatasetDisplay.getTissueSource().size());
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
    assertEquals(1, repositoryDatasetDisplay.getExperimentalStrategy().size());

    RepositoryDatasetDisplay repositoryDatasetDisplay = new RepositoryDatasetDisplay(repositoryFile);
    repositoryDatasetDisplay.addExperimentalStrategy("experimental_strategy");

    assertEquals(2, repositoryDatasetDisplay.getExperimentalStrategy().size());
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
    assertEquals(1, repositoryDatasetDisplay.getWorkflowType().size());

    RepositoryDatasetDisplay repositoryDatasetDisplay = new RepositoryDatasetDisplay(repositoryFile);
    repositoryDatasetDisplay.addWorkflowType("workflow_type");

    assertEquals(2, repositoryDatasetDisplay.getWorkflowType().size());
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
  }
}
 