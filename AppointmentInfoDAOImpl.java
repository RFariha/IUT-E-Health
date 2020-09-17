package com.iut.eHealth.dao;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iut.eHealth.entity.AppointmentInfo;

@Repository
public class AppointmentInfoDAOImpl implements AppointmentInfoDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<AppointmentInfo> getAppointmentInfo(int id) {
		
//		Session currentSession = sessionFactory.getCurrentSession();
//		String hql = "from AppointmentInfo where doctorId=:id";
//		Query theQuery = currentSession.createQuery(hql,AppointmentInfo.class);
//		theQuery.setParameter("id", id);
//		List<AppointmentInfo> appointments = theQuery.getResultList();
//		
//		System.out.println(appointments.size());
//		
//		return appointments;
            return null;
	}

	@Override
	public void setAppointmentInfo(AppointmentInfo appointments) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		currentSession.save(appointments);
		
	}

	

}
