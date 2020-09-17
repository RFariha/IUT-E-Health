package com.iut.eHealth.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.NoResultException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iut.eHealth.entity.DoctorInfo;

@Repository
public class DoctorInfoDAOImpl implements DoctorInfoDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<DoctorInfo> getDoctors() {
		
		List<DoctorInfo> doctors = new ArrayList<DoctorInfo>();
		try {
//			Session currentSession= sessionFactory.getCurrentSession();
//			String hql = "from DoctorInfo";
//			Query theQuery = currentSession.createQuery(hql,DoctorInfo.class);
//			doctors = theQuery.getResultList();
		}
		catch(NoResultException e) {
			
		}
		
		if(doctors==null) {
			return null;
		}
		else
			return doctors;
	}

	@Override
	public DoctorInfo getDoctor(String id) {
		
//		Session currentSession= sessionFactory.getCurrentSession();
//		
//		String hql = "from DoctorInfo D where D.id =:id";
//		
//		Query theQuery = currentSession.createQuery(hql,DoctorInfo.class);
//		
//		theQuery.setParameter("id", id);
//		
//		DoctorInfo doctor = (DoctorInfo) theQuery.getSingleResult();
//		
//		return doctor;
            
            return null;
	}

}
