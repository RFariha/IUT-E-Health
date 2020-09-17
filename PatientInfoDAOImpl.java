package com.iut.eHealth.dao;

import java.util.List;

import javax.persistence.NoResultException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iut.eHealth.entity.PatientInfo;

@Repository
public class PatientInfoDAOImpl implements PatientInfoDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public PatientInfo getPatient(int id) {
		
//		Session currentSession = sessionFactory.getCurrentSession();
//		
//		String hql = "from PatientInfo where id=:id";
//		
//		
//		Query theQuery =currentSession.createQuery(hql,PatientInfo.class);
//		
//		theQuery.setParameter("id",id);
//		
//		
//		PatientInfo patient = (PatientInfo) theQuery.getSingleResult();
//		
//		return patient;
            return null;
	}

	@Override
	public void savePatient(PatientInfo thePatient) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		currentSession.save(thePatient);
	}

	@Override
	public int verifyPatient(String email, String password) {
		
//		int res = -1;
//		try {
////			Session currentSession = sessionFactory.getCurrentSession();
////			String hql = "from PatientInfo where email=:email and password=:password";
////			Query theQuery = currentSession.createQuery(hql,PatientInfo.class);
////			theQuery.setParameter("email", email);
////			theQuery.setParameter("password", password);
//			PatientInfo thePatient = (PatientInfo) theQuery.getSingleResult();
//			if(thePatient==null)
//				res = -1;
//			else
//				res = thePatient.getId();
//		}catch(NoResultException e) {
//			
//		}
//		
//		return res;
//	}
//
//	@Override
//	public boolean checkPatient(String email) {
//		boolean flag = false;
//		
//		try {
//			Session currentSession = sessionFactory.getCurrentSession();
//			String hql = "from PatientInfo where email=:email";
//			Query theQuery = currentSession.createQuery(hql,PatientInfo.class);
//			theQuery.setParameter("email", email);
//			PatientInfo thePatient = (PatientInfo) theQuery.getSingleResult();
//			if(thePatient==null)
//				flag=false;
//			else
//				flag=true;
//		}catch(NoResultException e) {
//			
//		}
//		return flag;
            return 0;
	}

    @Override
    public boolean checkPatient(String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
