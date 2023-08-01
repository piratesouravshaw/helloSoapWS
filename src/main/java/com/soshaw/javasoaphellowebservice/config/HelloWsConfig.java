package com.soshaw.javasoaphellowebservice.config;

import com.soshaw.javasoaphellowebservice.HelloWs;
import jakarta.xml.ws.Endpoint;
import org.apache.cxf.Bus;

import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWsConfig {
    @Autowired
    Bus bus;
    @Bean
    public Endpoint endpoint(){
        Endpoint endpoint=new EndpointImpl(bus,new HelloWs());
        endpoint.publish("/hello");
        return endpoint;
    }
}
