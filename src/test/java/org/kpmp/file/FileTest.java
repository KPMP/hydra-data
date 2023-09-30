package org.kpmp.file;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileTest {

    private File file;

    @BeforeEach
    void setUp() {
        file = new File();
    }

    @AfterEach
    void tearDown() {
        file = null;
    }

    @Test
    void setFileId() {
        file.setFileId(123);
        assertEquals(123, file.getFileId());
    }

    @Test
    void setDlFileId() {
        file.setDlFileId("fileid");
        assertEquals("fileid", file.getDlFileId());
    }

    @Test
    void setFileName() {
        file.setFileName("filename");
        assertEquals("filename", file.getFileName());
    }

    @Test
    void setPackageId() {
        file.setPackageId("pkgid");
        assertEquals("pkgid", file.getPackageId());
    }

    @Test
    void setFileSize() {
        file.setFileSize(12345);
        assertEquals(12345, file.getFileSize());
    }
}