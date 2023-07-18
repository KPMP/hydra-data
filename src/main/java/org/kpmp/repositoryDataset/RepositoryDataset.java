package org.kpmp.repositoryDataset;

public interface RepositoryDataset {
  
  String getDlFileId();

  String getRedcapId();

  String getSampleType();

  String getTissueType();

  String getAgeBinned();

  String getSex();

  String getDoi();

  String getAccess();

  String getPlatform();

  String getExperimentalStrategy();

  String getDataCategory();

  String getWorkflowType();

  String getDataFormat();

  String getDataType();

  String getFileName();

  Long getFileSize();

  String getProtocol();

  String getPackageId();

  String getTissueSource();

  String getReleaseVersion();

  public void setReleaseVersion(String releaseVersion);

  String getPlatformIdSort();

  String getParticipantIdSort();

  String getFileNameSort();
}
