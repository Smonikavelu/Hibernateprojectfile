package com.demo;
import java.util.List;

import com.entity.Hospitallog;
import com.utility.hibernateUtility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
public class View {

	public static void main(String[] args) {
		SessionFactory sessionFactory = hibernateUtility.getSessionFactory();
		  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  
		  Query<Hospitallog> query1=session.createQuery("from Hospitallog");
	         
	        List<Hospitallog> result=query1.list();
	         
	         
	       for(Hospitallog hr:result)
	      {
	       	System.out.println(hr.getName()); 
	       	System.out.println(hr.getadmin());
	       	System.out.println(hr.getward_No());

	         }

		  
		  
		  session.getTransaction().commit();
		  session.close();
		  sessionFactory.close();	

	}

}