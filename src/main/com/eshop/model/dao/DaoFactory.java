package com.eshop.model.dao;

import com.eshop.model.dao.impl.JDBCDaoFactory;

public abstract class DaoFactory {

	private static DaoFactory instance;

	public static synchronized DaoFactory getInstance () {
		if (instance == null) instance = new JDBCDaoFactory ();
		return instance;
	}

	
	public abstract ProductsDao createProductsDao () throws DBException;
	public abstract UsersDao createUsersDao () throws DBException;
	public abstract OrdersDao createOrdersDao () throws DBException;
}
