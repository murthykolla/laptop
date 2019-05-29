package com.laptopdao;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.laptopinfo.Laptop;

@Repository
public class LaptopdaoImpl implements Laptopdao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public List<Laptop> getlaptop() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Laptop> theQuery = currentSession.createQuery("from Laptop order by lap_id", Laptop.class);		
		List<Laptop> laptop = theQuery.getResultList();	
		return laptop;
	}/*

	// need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;

	public List<Laptop> getlaptop() {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// create a query ... sort by last name
		Query<Laptop> theQuery = currentSession.createQuery("from laptop order by lap_id", Laptop.class);

		// execute query and get result list
		List<Laptop> laptop = theQuery.getResultList();

		// return the results
		return laptop;
	}

*/}
