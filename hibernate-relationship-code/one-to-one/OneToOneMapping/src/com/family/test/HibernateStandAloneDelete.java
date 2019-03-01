package com.family.test;

import org.hibernate.Session;

import com.family.pojo.Father;

public class HibernateStandAloneDelete {
	public static void main(String[] args) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		System.out.println("<------------------->");
		Father f = (Father) session.get(Father.class, 9l);

		session.getTransaction().begin();
		session.delete(f);
		session.getTransaction().commit();
		System.out.println("deleted successfully");
		session.close();

	}
}
