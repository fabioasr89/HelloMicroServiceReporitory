package com.fabio.client;

import java.net.URI;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientException;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import reactor.core.publisher.Mono;
@Service
public class HelloServiceAdapterImpl implements HelloServiceAdapter{
	
	private String helloServiceUri;
	
	private WebClient webClient;
	
	public HelloServiceAdapterImpl(WebClient.Builder webClientBuilder,@Value("${service.hello.uri}")String helloServiceUri) {
		//creiamo una istanza di webClient richiamando il Builder
		//settiamo la uri dove risiede il servizio, nel nostro caso in localhost e generiamo
		this.helloServiceUri=helloServiceUri;
		this.webClient=webClientBuilder.baseUrl(helloServiceUri).build();
	}
	
	public String sayHello(String name) {
		String risposta=null;
		//UriComponents uriComp=UriComponentsBuilder.fromUriString("/Api/Hello/hello").queryParam("name",name).encode().build();
		//String uri=helloServiceUri+uriComp.toUriString();
		try {
			Mono<String> response=webClient.get().uri(helloServiceUri+"/Api/Hello/hello/{name}",name).retrieve().bodyToMono(String.class);
			risposta=response.block();
		}catch(WebClientException e) {
			e.printStackTrace();
		}
		return risposta;
	}


	
	
}
