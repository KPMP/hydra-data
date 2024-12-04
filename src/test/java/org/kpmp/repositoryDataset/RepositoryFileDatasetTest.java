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
    public void setEnrollmentCategory() {
        repositoryDataset.setEnrollmentCategory("ttype");
        assertEquals("ttype", repositoryDataset.getEnrollmentCategory());
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
        repositoryDataset.setPrimaryAdjudicatedCategory("blah");
        assertEquals("blah" ,repositoryDataset.getPrimaryAdjudicatedCategory());
    }

    @Test
    public void setKdigoStage() {
        repositoryDataset.setKdigoStage("stage 11");
        assertEquals("stage 11 (ks)", repositoryDataset.getKdigoStage());
    }

    @Test
    public void setKdigoStage_whenBlank() {
        repositoryDataset.setKdigoStage("");
        assertEquals("", repositoryDataset.getKdigoStage());
    }

    @Test
    public void setBaselineEgfr() {
        repositoryDataset.setBaselineEgfr("13");
        assertEquals("13 (eGFR)", repositoryDataset.getBaselineEgfr());
    }

    @Test
    public void setBaselineEgfr_whenBlank() {
        repositoryDataset.setBaselineEgfr("");
        assertEquals("", repositoryDataset.getBaselineEgfr());
    }

    @Test
    public void setProteinuria() {
        repositoryDataset.setProteinuria("1234");
        assertEquals("1234 (prot)", repositoryDataset.getProteinuria());
    }

    @Test
    public void setProteinuria_whenBlank() {
        repositoryDataset.setProteinuria("");
        assertEquals("", repositoryDataset.getProteinuria());
    }

    @Test
    public void setA1c() {
        repositoryDataset.setA1c("90%");
        assertEquals("90% (a1c)", repositoryDataset.getA1c());
    }

    @Test
    public void setA1c_whenBlank() {
        repositoryDataset.setA1c("");
        assertEquals("", repositoryDataset.getA1c());
    }

    @Test
    public void setAlbuminuria() {
        repositoryDataset.setAlbuminuria("yup");
        assertEquals("yup (alb)", repositoryDataset.getAlbuminuria());
    }

    @Test
    public void setAlbuminuria_whenBlank() {
        repositoryDataset.setAlbuminuria("");
        assertEquals("", repositoryDataset.getAlbuminuria());
    }

    @Test
    public void setDiabetesDuration(){
        repositoryDataset.setDiabetesDuration("1 years");
        assertEquals("1 years (dd)", repositoryDataset.getDiabetesDuration());
    }

    @Test
    public void setDiabetesDuration_whenBlank() {
        repositoryDataset.setDiabetesDuration("");
        assertEquals("", repositoryDataset.getDiabetesDuration());
    }

    @Test
    public void setDiabetesHistory() {
        repositoryDataset.setDiabetesHistory("no");
        assertEquals("no (dh)", repositoryDataset.getDiabetesHistory());
    }

    @Test
    public void setDiabetesHistory_whenBlank() {
        repositoryDataset.setDiabetesHistory("");
        assertEquals("", repositoryDataset.getDiabetesHistory());
    }

    @Test
    public void setHypertensionDuration() {
        repositoryDataset.setHypertensionDuration("1 years");
        assertEquals("1 years (hd)", repositoryDataset.getHypertensionDuration());
    }

    @Test
    public void setHypertensionDuration_whenBlank() {
        repositoryDataset.setHypertensionDuration("");
        assertEquals("", repositoryDataset.getHypertensionDuration());
    }

    @Test
    public void setHypertensionHistory() {
        repositoryDataset.setHypertensionHistory("no");
        assertEquals("no (hh)", repositoryDataset.getHypertensionHistory());
    }

    @Test
    public void setHypertensionHistory_whenBlank() {
        repositoryDataset.setHypertensionHistory("");
        assertEquals("", repositoryDataset.getHypertensionHistory());
    }

    @Test
    public void setOnRaasBlockade() {
        repositoryDataset.setOnRaasBlockade("no");
        assertEquals("no (rb)", repositoryDataset.getOnRaasBlockade());
    }

    @Test
    public void setOnRaasBlockade_whenBlank() {
        repositoryDataset.setOnRaasBlockade("");
        assertEquals("", repositoryDataset.getOnRaasBlockade());
    }
}