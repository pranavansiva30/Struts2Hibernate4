package com.struts.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.struts.domain.EmpDetails;
import com.struts.utility.HibernateUtil;

public class EmpDetailsDAOImpl implements EmpRegisterDAO {

	public void saveEmpDet(EmpDetails empDet) {
		// TODO Auto-generated method stub
		
		
		SessionFactory session = HibernateUtil.createSessionFactory();
		Session  sess = session.getCurrentSession();
		
		Transaction  tx = sess.beginTransaction();
		
		sess.save(empDet);
		
		tx.commit();
		session.close();
		
	}

	public List<EmpDetails> getDetails() {
		// TODO Auto-generated method stub
		List<EmpDetails> getList=new ArrayList<EmpDetails>();
		SessionFactory session = HibernateUtil.createSessionFactory();
		Session sess=session.getCurrentSession();
		Transaction  tx = sess.beginTransaction();
		getList=sess.createQuery("from EmpDetails").list();
		tx.commit();
		session.close();
		return getList;
	}

	
}
