package org.cxf.spring.rest.services.impl;

import org.cxf.spring.rest.services.StockManagementService;
import org.cxf.spring.rest.stock.bo.StockBo;
import org.cxf.spring.rest.stock.model.Stock;
import org.cxf.spring.rest.vo.StockRequest;

public class StockManagementServiceImpl implements StockManagementService {
	
	private StockBo stockBoImpl;

	public StockBo getStockBoImpl() {
		return stockBoImpl;
	}

	public void setStockBoImpl(StockBo stockBoImpl) {
		this.stockBoImpl = stockBoImpl;
	}

	@Override
	public Stock createStock(StockRequest stockRequest) {
		Stock stock = new Stock();
		stock.setStockCode(stockRequest.getStock_code());
		stock.setStockName(stockRequest.getStock_name());
		this.getStockBoImpl().save(stock);
		return stock;
	}

}
