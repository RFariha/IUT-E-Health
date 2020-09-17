package com.iut.eHealth.dao;

import java.util.List;

import com.iut.eHealth.entity.PatientInfo;

public interface PatientInfoDAO {
	
	PatientInfo getPatient(int id);

	public void savePatient(PatientInfo thePatient);
	
	public int verifyPatient(String email,String password);
	
	public boolean checkPatient(String email);

}
