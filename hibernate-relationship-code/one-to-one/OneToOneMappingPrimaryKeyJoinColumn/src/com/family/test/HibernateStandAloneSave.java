package com.family.test;

import org.hibernate.Session;

import com.family.pojo.Father;
import com.family.pojo.Mother;

public class HibernateStandAloneSave {
	public static void main(String[] args) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		System.out.println("<--------------inserted_successfully------------------>");
		
		Father f = new Father();
		f.setfName("sampath");

		Mother m = new Mother();
		m.setmName("bhuvi");
		
		f.setMother(m);
		m.setFather(f);

		session.save(f);
		
		session.getTransaction().commit();
		System.out.println("<--------------inserted_successfully------------------>");
		session.close();
	}
}
