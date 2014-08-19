package org.cxf.spring.rest.vo;

import org.cxf.spring.rest.stock.model.Stock;

public class StockResponse {
	
	private Stock stock;
	private String errorMessage;
	private Boolean success = true;
	public Stock getStock() {
		return stock;
	}
	public void setStock(Stock stock) {
		this.stock = stock;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public Boolean getSuccess() {
		return success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}

}
