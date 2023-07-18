package org.kpmp.repositoryDataset;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RepositoryFileDatasetTest {

    private RepositoryFileDataset repositoryDataset;

    @BeforeEach
    public void setUp() throws Exception {
        repositoryDataset = new RepositoryFileDataset();
    }

    @AfterEach
    public void tearDown() throws Exception {
        repositoryDataset = null;
    }

    @Test
    public void setDlFileId() {
        repositoryDataset.setDlFileId("dl_file_id");
        assertEquals("dl_file_id", repositoryDataset.getDlFileId());
    }

    @Test
    public void setRedcapId() {
        repositoryDataset.setRedcapId("redcapid");
        assertEquals("redcapid", repositoryDataset.getRedcapId());
    }

     @Test
    public void setSampleType() {
        repositoryDataset.setSampleType("sample");
        assertEquals("sample", repositoryDataset.getSampleType());
    }

    @Test
    public void setTissueType() {
        repositoryDataset.setTissueType("ttype");
        assertEquals("ttype", repositoryDataset.getTissueType());
    }

    @Test
    public void setAgeBinned() {
        repositoryDataset.setAgeBinned("age-age2");
        assertEquals("age-age2", repositoryDataset.getAgeBinned());
    }

    @Test
    public void setSex() {
        repositoryDataset.setSex("sex");
        assertEquals("sex", repositoryDataset.getSex());
    }

    @Test
    public void setDoi() {
        repositoryDataset.setDoi("doi_text");
        assertEquals("doi_text", repositoryDataset.getDoi());
    }

    @Test
    public void setAccess() {
        repositoryDataset.setAccess("open");
        assertEquals("open", repositoryDataset.getAccess());
    }

    @Test
    public void setPlatform() {
        repositoryDataset.setPlatform("Platform");
        assertEquals("Platform", repositoryDataset.getPlatform());
    }

    @Test
    public void setExperimentalStrategy() {
        repositoryDataset.setExperimentalStrategy("strategy");
        assertEquals("strategy", repositoryDataset.getExperimentalStrategy());
    }

    @Test
    public void setDataCategory() {
        repositoryDataset.setDataCategory("category");
        assertEquals("category", repositoryDataset.getDataCategory());
    }

    @Test
    public void setWorkflowType() {
        repositoryDataset.setWorkflowType("working");
        assertEquals("working", repositoryDataset.getWorkflowType());
    }
    
    @Test
    public void setDataType() {
        repositoryDataset.setDataType("dtype");
        assertEquals("dtype", repositoryDataset.getDataType());
    }

    @Test
    public void setFileName() {
        repositoryDataset.setFileName("file.jpg");
        assertEquals("file.jpg", repositoryDataset.getFileName());
    }

    @Test
    public void setFileSize() {
        repositoryDataset.setFileSize((long) 1234123421);
        assertEquals((long) 1234123421, repositoryDataset.getFileSize(), 0.01);
    }

    @Test
    public void setProtocol() {
        repositoryDataset.setProtocol("blah");
        assertEquals("blah", repositoryDataset.getProtocol());
    }


    @Test
    public void setPackageId() {
        repositoryDataset.setPackageId("package_id");
        assertEquals("package_id", repositoryDataset.getPackageId());
    }

    @Test
    public void setTissueSource() {
        repositoryDataset.setTissueSource("blah");
        assertEquals("blah", repositoryDataset.getTissueSource());
    }

    @Test
    public void setReleaseVersion() {
        repositoryDataset.setReleaseVersion("42");
        assertEquals("42", repositoryDataset.getReleaseVersion());
        repositoryDataset.setReleaseVersion("Recently Released");
        assertEquals("Recently Released", repositoryDataset.getReleaseVersion());
    }

    @Test
    public void setFileNameSort() {
        repositoryDataset.setFileName("015eda7d-d867-4d30-b6fd-cbc679203fc3_possorted_genome_bam.bam");
        assertEquals("possorted_genome_bam.bam", repositoryDataset.getFileNameSort());
    }

    @Test
    public void setParticipantIdSort(){
        repositoryDataset.setRedcapId("'43', '44'");
        assertEquals("Multiple Participants", repositoryDataset.getParticipantIdSort());
    }

    @Test
    public void setPlatformSort() {
        repositoryDataset.setPlatform(null);
        assertEquals("aaaaa", repositoryDataset.getPlatformSort());
    }

}