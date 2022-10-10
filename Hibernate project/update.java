package com.demo;
import com.entity.Hospitallog;
import com.utility.hibernateUtility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
public class Update {

	public static void main(String[] args) {
		SessionFactory sessionFactory = hibernateUtility.getSessionFactory();	
		  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  
		  Hospitallog hr = (Hospitallog)session.get(Hospitallog.class,49);
		  hr.setName("ananthi ");
		  hr.setAddress("bombay ");
		  hr.setRoom_No(200);
		  
		  
		  System.out.println("Updated Successfully");
		  session.getTransaction().commit();
		  sessionFactory.close();

	}

}