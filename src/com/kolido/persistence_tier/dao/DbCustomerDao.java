package com.kolido.persistence_tier.dao;

import java.sql.Connection;
import java.util.Optional;
import java.util.stream.Stream;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DbCustomerDao implements CustomerDao {

	private final static Logger LOGGER = LoggerFactory.getLogger(DbCustomerDao.class);
	private DataSource dataSource;
	
	public DbCustomerDao(DataSource dataSource) {
		super();
		this.dataSource = dataSource;
	}

	@Override
	public Stream<Customer> getAll() throws Exception {
		// TODO Auto-generated method stub
		Connection connection;
		
		
		return null;
	}

	@Override
	public Optional<Customer> getById(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Customer customer) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Customer customer) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Customer customer) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

}
