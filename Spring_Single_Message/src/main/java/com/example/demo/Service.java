package com.example.demo;



 
@org.springframework.stereotype.Service
public class Service implements ServiceInterface {

	@Override
	public String getValue(String v1, String v2) {
     String c= v1+v2;
		return c;
	}

}
