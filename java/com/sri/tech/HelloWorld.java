package com.sri.tech;

import java.util.Date;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Application;
import jakarta.ws.rs.core.MediaType;



@ApplicationPath("hello-world")
public class HelloWorld extends Application{
	
		    @Path("hello")
		    @GET
		    @Produces(MediaType.APPLICATION_JSON)
		    public String sayHello() {
		    	Date dt= new Date();
		        return "Hellow world  RESTful Web Services SE Bootstrap"+dt;
		    }
		    
		   
}
