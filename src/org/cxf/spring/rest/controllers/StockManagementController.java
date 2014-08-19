package org.cxf.spring.rest.controllers;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.cxf.spring.rest.vo.StockRequest;
import org.cxf.spring.rest.vo.StockResponse;

@Consumes("application/json")
@Produces("application/json")
public interface StockManagementController {
	
	@POST
	@Path("/createStock/")
	public StockResponse createStock(StockRequest stockRequest);

}
