package com.matrimony.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.AnnotationConfiguration;
//import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sessionfactory;
	
	static{
		Configuration configuration=new AnnotationConfiguration().configure("hibernate.cfg.xml");
		sessionfactory=configuration.buildSessionFactory();
	}
	
	private HibernateUtil(){
		super();
	}
	
	public static SessionFactory getSessionfactory(){
		return sessionfactory;
	}
	
}
