package com.family.test;

import org.hibernate.Session;

import com.family.pojo.Father;
import com.family.pojo.Mother;

public class HibernateStandAloneGet {
	public static void main(String[] args) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		Father f = (Father) session.get(Father.class, 5l);
		System.out.println("<--------------getting_value------------------>");
		System.out.println("fatherName ::" + f.getfName());
		System.out.println("motherName ::" + f.getMother().getmName());

		session.close();
	}
}
