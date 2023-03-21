 package com.sri.tech;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.SeBootstrap;
import jakarta.ws.rs.core.Application;

	@ApplicationPath("")
	public class HelloWorldApplication extends Application {

	    public static void main(String[] args) throws InterruptedException {

	        Application app = new HelloWorldApplication();
	        SeBootstrap.Configuration config = SeBootstrap.Configuration.builder()
	                .rootPath("")
	                .host("0.0.0.0")
	                .port(80) // default port for app service
	                .protocol("HTTP")
	                .build();

	        SeBootstrap.start(app, config).thenAccept(instance -> {
	            instance.stopOnShutdown(stopResult -> stopResult.unwrap(Object.class));
	            System.out.printf("\nBooty Duke running at %s\n", instance.configuration().baseUri());
	            System.out.println("Send SIGKILL to shutdown.");
	        });

	        Thread.currentThread().join();
	    }

	}

