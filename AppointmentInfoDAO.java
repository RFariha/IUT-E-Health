package com.iut.eHealth.dao;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.iut.eHealth.entity.AppointmentInfo;

public interface AppointmentInfoDAO {
	
	public List<AppointmentInfo> getAppointmentInfo(int id);

	public void setAppointmentInfo(AppointmentInfo appointments);

}
