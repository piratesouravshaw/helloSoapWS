package com.soshaw.javasoaphellowebservice;


import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public class HelloWs {
    @WebMethod
    public String sayHello(){
        return "Hello from Webservice";
    }
}
