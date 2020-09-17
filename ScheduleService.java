/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iut.eHealth.service;

import java.util.List;

import com.iut.eHealth.entity.AppointmentInfo;
import com.iut.eHealth.entity.DoctorInfo;
import com.iut.eHealth.entity.PatientInfo;
import com.iut.eHealth.entity.StatelessSchedule;

public interface ScheduleService {
	
	public List<DoctorInfo> getDoctors();
	
	public DoctorInfo getDoctor(String id);
	
	public List<StatelessSchedule> getSchedule();
	
	public List<AppointmentInfo> getAppointmentInfo(int id);
	
	public PatientInfo getPatient(int id);

	public void setAppointmentInfo(AppointmentInfo appointments);

	public void savePatient(PatientInfo thePatient);

	public int verifyPatient(String email, String password);

	public boolean checkPatient(String email);
	

}
