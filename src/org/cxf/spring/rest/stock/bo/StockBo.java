package org.cxf.spring.rest.stock.bo;

import org.cxf.spring.rest.stock.model.Stock;

public interface StockBo {
	
	void save(Stock stock);
	
	void update(Stock stock);
	
	void delete(Stock stock);
	
	Stock findByStockCode(String stockCode);

}
