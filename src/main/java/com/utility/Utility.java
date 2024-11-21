package com.utility;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import com.entity.Address;
import com.entity.Person;
import com.entity.VoterCard;

public class Utility {

	private Utility() {}
	
	public static Session openSession() {
		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(Person.class);
		cfg.addAnnotatedClass(Address.class);
		cfg.addAnnotatedClass(VoterCard.class);
		return cfg.configure().buildSessionFactory().openSession();
	}
}
