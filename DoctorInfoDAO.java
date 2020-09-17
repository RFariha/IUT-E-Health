package com.iut.eHealth.dao;

import java.util.List;

import com.iut.eHealth.entity.DoctorInfo;

public interface DoctorInfoDAO {
	
	public List<DoctorInfo> getDoctors();
	
	public DoctorInfo getDoctor(String id);

}
