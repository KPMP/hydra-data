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
    public void setSampleType() {
        repositoryDataset.setSampleType("sample");
        assertEquals("sample", repositoryDataset.getSampleType());
    }

    @Test
    public void setenrollmentCategory() {
        repositoryDataset.setenrollmentCategory("ttype");
        assertEquals("ttype", repositoryDataset.getenrollmentCategory());
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
        repositoryDataset.setReleaseVersion(45.0);
        assertEquals(45.0, repositoryDataset.getReleaseVersion());
    }

    @Test
    public void setPrimaryAdjudicatedCat() {
        repositoryDataset.setPrimaryAdjudicatedCat("blah");
        assertEquals("blah" ,repositoryDataset.getPrimaryAdjudicatedCat());
    }

    @Test
    public void setKdigoStage() {
        repositoryDataset.setKdigoStage("stage 11");
        assertEquals("stage 11", repositoryDataset.getKdigoStage());
    }

    @Test
    public void setBaselineEgfr() {
        repositoryDataset.setBaselineEgfr("13");
        assertEquals("13", repositoryDataset.getBaselineEgfr());
    }

    @Test
    public void setProteinuria() {
        repositoryDataset.setProteinuria("1234");
        assertEquals("1234", repositoryDataset.getProteinuria());
    }

    @Test
    public void setA1c() {
        repositoryDataset.setA1c("90%");
        assertEquals("90%", repositoryDataset.getA1c());
    }

    @Test
    public void setAlbuminuria() {
        repositoryDataset.setAlbuminuria("yup");
        assertEquals("yup", repositoryDataset.getAlbuminuria());
    }

    @Test
    public void setDiabetesDuration(){
        repositoryDataset.setDiabetesDuration("1 years");
        assertEquals("1 years", repositoryDataset.getDiabetesDuration());
    }

    @Test
    public void setDiabetesHistory() {
        repositoryDataset.setDiabetesHistory("no");
        assertEquals("no", repositoryDataset.getDiabetesHistory());
    }

    @Test
    public void setHypertensionDuration() {
        repositoryDataset.setHypertensionDuration("1 years");
        assertEquals("1 years", repositoryDataset.getHypertensionDuration());
    }

    @Test
    public void setHypertensionHistory() {
        repositoryDataset.setHypertensionHistory("no");
        assertEquals("no", repositoryDataset.getHypertensionHistory());
    }

    @Test
    public void setOnRaasBlockade() {
        repositoryDataset.setOnRaasBlockade("no");
        assertEquals("no", repositoryDataset.getOnRaasBlockade());
    }

}