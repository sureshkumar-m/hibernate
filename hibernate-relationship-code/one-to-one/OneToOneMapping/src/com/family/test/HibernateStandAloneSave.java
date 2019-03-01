package com.family.test;

import org.hibernate.Session;

import com.family.pojo.Father;
import com.family.pojo.Mother;

public class HibernateStandAloneSave {
	public static void main(String[] args) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		Father f = new Father();
		f.setfName("mahalingam");

		Mother m = new Mother();
		m.setmName("babydhanam");
		
		f.setMother(m);

		session.save(f);
		
		session.getTransaction().commit();
		System.out.println("<--------------inserted_successfully------------------>");
		session.close();
	}
}
