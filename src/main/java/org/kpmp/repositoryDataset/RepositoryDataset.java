package org.kpmp.repositoryDataset;
import org.kpmp.file.File;
import java.util.List;

public interface RepositoryDataset {

  List<File> getRelatedFiles();
  
  String getLevel();
  
  String getSpectrackSampleId();
  
  String getTissueType();
    
  String getTissueSource();
  
  String getSex();
  
  String getSampleType();
  
  String getAge();
  
  String getRedcapId();
  
  int getParticipantId();
  
  String getDataType();
  
  String getImageType();
  
  String getConfigType();
  
  String getProtocol();
  
  Long getFileSize();
  
  String getPackageId();
  
  String getFileName();
  
  String getDlFileId();
  
  int getFileId();  
  
  String getExternalLink();

}
