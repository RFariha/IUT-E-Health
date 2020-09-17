package com.iut.eHealth.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.NoResultException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iut.eHealth.entity.StatelessSchedule;

@Repository
public class StatelessScheduleDAOImpl implements StatelessScheduleDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<StatelessSchedule> getSchedule() {
		
//		List<StatelessSchedule> schedule = new ArrayList<StatelessSchedule>();
//		try {
//			Session currentSession = sessionFactory.getCurrentSession();
//			String hql = "from StatelessSchedule";
//			Query theQuery = currentSession.createQuery(hql,StatelessSchedule.class);
//			
//			schedule = theQuery.getResultList();
//		}
//		catch(NoResultException e) {
//			
//		}
//		
//		if(schedule==null)
//			return null;
//		else
//			return schedule;
            return null;
	}

}
