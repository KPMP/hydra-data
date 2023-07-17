package org.kpmp.arFileInfo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.lang.Nullable;

@Entity
@Table(name = "ar_file_info")
public class ArFileInfo implements Serializable {

  @Id
  @Column(name = "ar_file_info_id")
  private int fileInfoId;

  @Column(name = "file_id")
  private int fileId;

  @Column(name = "release_version")
  private float releaseVersion;

  @Nullable
  @Column(name = "release_sunset_version")
  private float releaseSunsetVersion;

  @Column(name = "metadata_type_id")
  private int metadataTypeId;

  public int getFileInfoId(){
    return fileInfoId;
  }

  public void setFileInfoId(int fileInfoId){
    this.fileInfoId = fileInfoId;
  }

  public int getFileId(){
    return fileId;
  }

  public void setFileId(int fileId){
    this.fileId = fileId;
  }

  public float getReleaseVersion(){
    return releaseVersion;
  }

  public void setReleaseVersion(float releaseVersion){
    this.releaseVersion = releaseVersion;
  }

  public float getReleaseSunsetVersion(){
    return releaseSunsetVersion;
  }

  public void setReleaseSunsetVersion(float releaseSunsetVersion){
    this.releaseSunsetVersion= releaseSunsetVersion;
  }

  public int getMetadataTypeId(){
    return metadataTypeId;
  }

  public void setMetadataTypeId(int metadataTypeId){
    this.metadataTypeId = metadataTypeId;
  }

}