package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.Address;
import com.entity.Person;
import com.entity.VoterCard;
import com.utility.Utility;

@SuppressWarnings("deprecation")
public class Dao {

	public void insertData(int adhar, String name, String v_id, String cons, int id, int pincode, String area,
			String city, String state) {
		Session session = Utility.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			String hql = "FROM VoterCard v WHERE v.voterid = :voterid";
			Query<VoterCard> query = session.createQuery(hql, VoterCard.class);
			query.setParameter("voterid", v_id);
			VoterCard existingVoterCard = query.uniqueResult();
			if (existingVoterCard != null) {
				System.out.println("Voter ID " + v_id + " already exists in the system.");
			} else {
				VoterCard v1 = new VoterCard(v_id, cons);
				Address ad = new Address(id, pincode, area, city, state);
				Person p = new Person(adhar, name, v1, ad);
				ad.setPerson(p);
				session.save(p);
				tx.commit();
				System.out.println("Person added successfully.");
			}
		} catch (Exception e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	@SuppressWarnings("unchecked")
	public List<Person> getAll() {
		Session session = Utility.openSession();
		Transaction tx = session.beginTransaction();
		List<Person> list = session.createQuery("from Person").list();
		tx.commit();
		return list;
	}
}
