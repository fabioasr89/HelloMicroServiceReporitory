package com.fabio.client;

import org.springframework.stereotype.Component;

/*
 * Questa interfaccia espone un metodo per il client che richiama quello implementato nel service 
 * ed esposto tramite rest 
 * **/
@Component
public interface HelloServiceAdapter {
	public String sayHello(String name);
}
