package org.kpmp.repositoryDataset;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.kpmp.file.File;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

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
    public void setFileId() {
        repositoryDataset.setFileId(12345);
        assertEquals(12345, repositoryDataset.getFileId());
    }

    @Test
    public void setDlFileId() {
        repositoryDataset.setDlFileId("dl_file_id");
        assertEquals("dl_file_id", repositoryDataset.getDlFileId());
    }

    @Test
    public void setFileName() {
        repositoryDataset.setFileName("file.jpg");
        assertEquals("file.jpg", repositoryDataset.getFileName());
    }

    @Test
    public void setPackageId() {
        repositoryDataset.setPackageId("package_id");
        assertEquals("package_id", repositoryDataset.getPackageId());
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
    public void setImageType() {
        repositoryDataset.setImageType("type");
        assertEquals("type", repositoryDataset.getImageType());
    }

    @Test
    public void setDataType() {
        repositoryDataset.setDataType("dtype");
        assertEquals("dtype", repositoryDataset.getDataType());
    }

    @Test
    public void setParticipantId() {
        repositoryDataset.setParticipantId(12);
        assertEquals(12, repositoryDataset.getParticipantId());
    }

    @Test
    public void setRedcapId() {
        repositoryDataset.setRedcapId("redcapid");
        assertEquals("redcapid", repositoryDataset.getRedcapId());
    }

    @Test
    public void setAge() {
        repositoryDataset.setAge("age");
        assertEquals("age", repositoryDataset.getAge());
    }

    @Test
    public void setSampleType() {
        repositoryDataset.setSampleType("sample");
        assertEquals("sample", repositoryDataset.getSampleType());
    }

    @Test
    public void setSex() {
        repositoryDataset.setSex("sex");
        assertEquals("sex", repositoryDataset.getSex());
    }

    @Test
    public void setTissueSource() {
        repositoryDataset.setTissueSource("tsource");
        assertEquals("tsource", repositoryDataset.getTissueSource());
    }

    @Test
    public void setTissueType() {
        repositoryDataset.setTissueType("ttype");
        assertEquals("ttype", repositoryDataset.getTissueType());
    }

    @Test
    public void setSpectrackSampleId() {
        repositoryDataset.setSpectrackSampleId("spectrack");
        assertEquals("spectrack", repositoryDataset.getSpectrackSampleId());
    }

    @Test
    public void setLevel() {
        repositoryDataset.setLevel("L0");
        assertEquals("L0", repositoryDataset.getLevel());
    }
}