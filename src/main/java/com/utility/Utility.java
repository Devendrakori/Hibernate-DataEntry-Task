package com.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Address;
import com.entity.Person;
import com.entity.VoterCard;

public class Utility {

	private Utility() {}
	
	public static SessionFactory buildSessionFactory(String conf) {
		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(Person.class);
		cfg.addAnnotatedClass(Address.class);
		cfg.addAnnotatedClass(VoterCard.class);
		return cfg.configure(conf).buildSessionFactory();
	}
}
