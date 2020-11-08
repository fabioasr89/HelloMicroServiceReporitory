package com.fabio.service;

import org.springframework.stereotype.Service;
/***
 * 
 * 
 * Classe che definisce la logica del metodo sayHello da esporre attraverso un servizio rest che chiameremo HelloRestController
 *
 */
@Service
public class HelloService {

	public HelloService() {
		
	}
	
	public String sayHello(String name) {
		return String.format("Hello %s", name);
	}
}
