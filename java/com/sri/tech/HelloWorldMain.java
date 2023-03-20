package com.sri.tech;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

@ApplicationPath("")
public class HelloWorldMain extends Application {

	public static void main(String[] args) {
		HelloWorld hw= new HelloWorld();
		hw.helloWorld();

	}

}
