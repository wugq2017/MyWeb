package com.app.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface WebServiceI {
	
	@WebMethod
	String sayHello(String username);
}
