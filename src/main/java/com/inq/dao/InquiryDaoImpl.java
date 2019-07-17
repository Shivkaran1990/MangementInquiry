package com.inq.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.inq.controller.Inquiry;
	

@Repository("InquiryDao")	
public class InquiryDaoImpl implements InquiryDao {

@Autowired	
private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}	
	@Override
	public void save(Inquiry inq) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(inq);	
       System.out.println("data saved");
	}
	@Override
	public Inquiry getDataBasedOnID(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Inquiry> getInqData(String id) {
		Session session = this.sessionFactory.getCurrentSession();
		String sql="from Inquiry where inq_ids='"+id+"'";
		  Query query = session.createQuery(sql);
		  List<Inquiry> Inquiry = query.list();
		return Inquiry;
	}
	@Override
	public void updateInquiry(Inquiry inquiry) {
		Session session = this.sessionFactory.getCurrentSession();
	     session.update(inquiry);
		
	}

}
