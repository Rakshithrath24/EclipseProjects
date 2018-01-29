package com.mindtree.eai.doa;
import com.mindtree.eai.model.CampusMinds;

public interface DAOInterface 
{
 public CampusMinds getDetailsById(String Mid);
 public void getDetailsByLead(String lmid);
}
