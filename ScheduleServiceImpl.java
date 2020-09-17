/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iut.eHealth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iut.eHealth.dao.AppointmentInfoDAO;
import com.iut.eHealth.dao.DoctorInfoDAO;
import com.iut.eHealth.dao.PatientInfoDAO;
import com.iut.eHealth.dao.StatelessScheduleDAO;
import com.iut.eHealth.entity.AppointmentInfo;
import com.iut.eHealth.entity.DoctorInfo;
import com.iut.eHealth.entity.PatientInfo;
import com.iut.eHealth.entity.StatelessSchedule;

@Service
public class ScheduleServiceImpl implements ScheduleService {
	
	private static final String String = null;

	@Autowired
	private DoctorInfoDAO doctorDAO;
	
	@Autowired
	private StatelessScheduleDAO scheduleDAO;
	
	@Autowired
	private AppointmentInfoDAO appointmentDAO;
	
	@Autowired
	private PatientInfoDAO patientDAO;
	
	@Override
	@Transactional
	public List<DoctorInfo> getDoctors() {
		
		return doctorDAO.getDoctors();
	}

	@Override
	@Transactional
	public List<StatelessSchedule> getSchedule() {
		
		return scheduleDAO.getSchedule();
	}
	
	@Override
	@Transactional
	public List<AppointmentInfo> getAppointmentInfo(int id) {
		
		return appointmentDAO.getAppointmentInfo(id);
	}

	@Override
	@Transactional
	public PatientInfo getPatient(int id) {
		
		return patientDAO.getPatient(id);
	}

	@Override
	@Transactional
	public void setAppointmentInfo(AppointmentInfo appointments) {
		appointmentDAO.setAppointmentInfo(appointments);
		
	}

	@Override
	@Transactional
	public DoctorInfo getDoctor(String id) {
		
		return doctorDAO.getDoctor(id);
	}

	@Override
	@Transactional
	public void savePatient(PatientInfo thePatient) {
		
		patientDAO.savePatient(thePatient);
	}

	@Override
	@Transactional
	public int verifyPatient(java.lang.String email, java.lang.String password) {
		
		int patientId = patientDAO.verifyPatient(email, password);
		
		return patientId;
	}

	@Override
	@Transactional
	public boolean checkPatient(String email) {
		
		boolean flag = patientDAO.checkPatient(email);
		
		return flag;
	}


	

}
