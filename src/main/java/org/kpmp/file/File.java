package org.kpmp.file;

import jakarta.persistence.*;

@Entity
@Table(name = "file")
public class File {

    @Id
    @Column(name = "file_id")
    private int fileId;

    @Column(name = "dl_file_id")
    private String dlFileId;

    @Column(name = "file_name")
    private String fileName;

    @Column(name = "package_id")
    private String packageId;

    @Column(name = "file_size")
    private int fileSize;

    public int getFileId() {
        return fileId;
    }

    public void setFileId(int fileId) {
        this.fileId = fileId;
    }

    public String getDlFileId() {
        return dlFileId;
    }

    public void setDlFileId(String dlFileId) {
        this.dlFileId = dlFileId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }
}