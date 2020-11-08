package com.fabio.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * 	Appena l'applicazione spring boot viene avviata, facciamo partire il metodo run che richiama i metodi che chiamreanno
 * poi il servizio richiesto 
 * **/
@Component
public class HelloServiceRunning implements CommandLineRunner{
	@Autowired
	private HelloServiceAdapter helloServiceAdapter;
	/***/

	public HelloServiceAdapter getHelloServiceAdapter() {
		return helloServiceAdapter;
	}
	public void setHelloServiceAdapter(HelloServiceAdapter helloServiceAdapter) {
		this.helloServiceAdapter = helloServiceAdapter;
	}
	public void run(String... args) throws Exception {
		System.out.println(helloServiceAdapter.sayHello("Fabio"));
		System.out.println(helloServiceAdapter.sayHello("Marco"));
		
	}

	
	
}
