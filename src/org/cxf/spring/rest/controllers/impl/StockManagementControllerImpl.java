package org.cxf.spring.rest.controllers.impl;

import org.cxf.spring.rest.controllers.StockManagementController;
import org.cxf.spring.rest.services.StockManagementService;
import org.cxf.spring.rest.stock.model.Stock;
import org.cxf.spring.rest.vo.StockRequest;
import org.cxf.spring.rest.vo.StockResponse;

public class StockManagementControllerImpl implements StockManagementController{
	
	StockManagementService stockManagementServiceImpl;
	

	public StockManagementService getStockManagementServiceImpl() {
		return stockManagementServiceImpl;
	}


	public void setStockManagementServiceImpl(
			StockManagementService stockManagementServiceImpl) {
		this.stockManagementServiceImpl = stockManagementServiceImpl;
	}


	@Override
	public StockResponse createStock(StockRequest stockRequest) {
		StockResponse stockResponse = new StockResponse();
		Stock stock = getStockManagementServiceImpl().createStock(stockRequest);
		stockResponse.setStock(stock);
		stockResponse.setErrorMessage(null);
		stockResponse.setSuccess(true);
		return stockResponse;
	}
	
	

}
