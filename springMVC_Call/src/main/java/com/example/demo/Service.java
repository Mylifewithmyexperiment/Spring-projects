package com.example.demo;


@org.springframework.stereotype.Service
public class Service implements Iservice {

	@Override
	public String addString(String a, String b) {
		String c= a+"is "+b;
	return  c ;
	}

}
