package com.example.api.payroll.persistence.hibernate.cfg;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

class SesFactory{
public static Session getCurrentSessionFromConfig() {
  Configuration config = new Configuration();
          config.configure();
          // local SessionFactory bean created
          SessionFactory sessionFactory = config.buildSessionFactory();
          Session session = sessionFactory.getCurrentSession();
          return session;
          }
}
