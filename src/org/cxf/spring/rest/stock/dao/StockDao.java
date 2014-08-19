package org.cxf.spring.rest.stock.dao;

import org.cxf.spring.rest.stock.model.Stock;

public interface StockDao {
	
	void save(Stock stock);
	
	void update(Stock stock);
	
	void delete(Stock stock);
	
	Stock findByStockCode(String stockCode);

}
