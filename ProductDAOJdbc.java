package model.dao;

import java.util.List;

import model.ProductBean;

public class ProductDAOJdbc {
	private static final String URL = "";
	private static final String USERNAME = "sa";
	private static final String PASSWORD = "passw0rd";
	
	private static final String SELECT_BY_ID =
			"select * from product where id=?";
	public ProductBean select(int id) {
		ProductBean result = null;

		return result;
	}
	
	private static final String SELECT_ALL =
			"select * from product";
	public List<ProductBean> select() {
		List<ProductBean> result = null;

		return result;
	}
	
	private static final String INSERT =
			"insert into product (id, name, price, make, expire) values (?, ?, ?, ?, ?)";
	public ProductBean insert(ProductBean bean) {
		ProductBean result = null;

		return result;
	}
	
	private static final String UPDATE =
			"update product set name=?, price=?, make=?, expire=? where id=?";
	public ProductBean update(String name,
			double price, java.util.Date make, int expire, int id) {
		ProductBean result = null;

		return result;
	}
	
	private static final String DELETE =
			"delete from product where id=?";
	public boolean delete(int id) {
		return false;
	}
}
