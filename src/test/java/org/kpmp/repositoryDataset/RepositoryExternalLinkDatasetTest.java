package org.kpmp.repositoryDataset;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class RepositoryExternalLinkDatasetTest {

    private RepositoryExternalLinkDataset repositoryExternalLink;

    @BeforeEach
    public void setUp() throws Exception {
        repositoryExternalLink = new RepositoryExternalLinkDataset();
    }

    @AfterEach
    public void tearDown() throws Exception {
        repositoryExternalLink = null;
    }

    @Test
    public void setExternalLink() {
        repositoryExternalLink.setExternalLink("12345");
        assertEquals("12345", repositoryExternalLink.getExternalLink());
    }

    @Test
    public void setConfigType() {
        repositoryExternalLink.setConfigType("12345");
        assertEquals("12345", repositoryExternalLink.getConfigType());
 
    }

    @Test
    public void setImageType() {
        repositoryExternalLink.setImageType("12345");
        assertEquals("12345", repositoryExternalLink.getImageType());
    }

    @Test
    public void setDataType() {
        repositoryExternalLink.setDataType("12345");
        assertEquals("12345", repositoryExternalLink.getDataType());
    }

    @Test
    public void setSpectrackSampleId() {
        repositoryExternalLink.setSpectrackSampleId("12345");
        assertEquals("12345", repositoryExternalLink.getSpectrackSampleId());
    }

    @Test
    public void setRedcapId() {
        repositoryExternalLink.setRedcapId("12345");
        assertEquals("12345", repositoryExternalLink.getRedcapId());
    }

    @Test
    public void setParticipantId() {
        repositoryExternalLink.setParticipantId(12345);
        assertEquals(12345, repositoryExternalLink.getParticipantId());
    }

    @Test
    public void setAge() {
        repositoryExternalLink.setAge("12345");
        assertEquals("12345", repositoryExternalLink.getAge());
    }

    @Test
    public void getProtocol() {
        repositoryExternalLink.setProtocol("12345");
        assertEquals("12345", repositoryExternalLink.getProtocol());
    }

    @Test
    public void getSampleType() {
        repositoryExternalLink.setSampleType("12345");
        assertEquals("12345", repositoryExternalLink.getSampleType());
    }

    @Test
    public void getSex() {
        repositoryExternalLink.setSex("12345");
        assertEquals("12345", repositoryExternalLink.getSex());
    }

    @Test
    public void getTissueSource() {
        repositoryExternalLink.setTissueSource("12345");
        assertEquals("12345", repositoryExternalLink.getTissueSource());
    }

    @Test
    public void getTissueType() {
        repositoryExternalLink.setTissueType("12345");
        assertEquals("12345", repositoryExternalLink.getTissueType());
    }
}