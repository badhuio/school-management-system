package com.example.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class util {
	private static final Logger logger = LoggerFactory.getLogger(util.class);
	
	
	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		try {
			  
			Configuration cfg = new Configuration().configure();
			SessionFactory sf = cfg.buildSessionFactory();
			logger.info("Hibernate SessionFactory created");
			return sf;
		} catch (Throwable ex) {
			logger.error("Initial SessionFactory creation failed.", ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void shutdown() {
		try {
			if (sessionFactory != null) {
				sessionFactory.close();
				logger.info("Hibernate SessionFactory closed");
			}
		} catch (Exception e) {
			logger.warn("Error while closing SessionFactory", e);
		}
	}
}
