package com.struts.service;

import java.util.List;

import com.struts.domain.EmpDetails;

public interface EmpRegisterDAO {
	
	public void saveEmpDet(EmpDetails  empDet);
	public List<EmpDetails> getDetails();

}
