package com.fabio.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fabio.service.HelloService;

/***
 * 
 * RestController che espone l'accesso al servizio HelloService
 *
 */
@RestController
public class HelloRestController {
	@Autowired
	private HelloService helloService;
	
	public HelloRestController() {
		
	}
	/**
	 * Questo è il punto di accesso, tramite il servizio rest,al metodo del service
	 * */
	@RequestMapping(value="/Api/Hello/hello/{name}",method=RequestMethod.GET)
	public String sayHello(@PathVariable String name) {
		return helloService.sayHello(name);
	}
	
	public HelloService getHelloService() {
		return helloService;
	}
	public void setHelloService(HelloService helloService) {
		this.helloService = helloService;
	}
	
}
