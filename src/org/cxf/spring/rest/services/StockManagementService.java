package org.cxf.spring.rest.services;

import org.cxf.spring.rest.stock.model.Stock;
import org.cxf.spring.rest.vo.StockRequest;

public interface StockManagementService {

	public Stock createStock(StockRequest stockRequest);
}
