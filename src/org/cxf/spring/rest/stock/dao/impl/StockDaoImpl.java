package org.cxf.spring.rest.stock.dao.impl;

import java.util.List;

import org.cxf.spring.rest.stock.dao.StockDao;
import org.cxf.spring.rest.stock.model.Stock;
import org.cxf.spring.rest.util.CustomHibernateDaoSupport;
import org.springframework.stereotype.Repository;

@Repository("stockDao")
public class StockDaoImpl extends CustomHibernateDaoSupport implements StockDao{
	
	private static final String findByStockCode = "from Stock where stockCode=?";
	
	public void save(Stock stock){
		getHibernateTemplate().save(stock);
	}
	
	public void update(Stock stock){
		getHibernateTemplate().update(stock);
	}
	
	public void delete(Stock stock){
		getHibernateTemplate().delete(stock);
	}
	
	@SuppressWarnings("unchecked")
	public Stock findByStockCode(String stockCode){
		List<Stock> list = getHibernateTemplate().find(findByStockCode,stockCode);
		return list.get(0);
	}

}