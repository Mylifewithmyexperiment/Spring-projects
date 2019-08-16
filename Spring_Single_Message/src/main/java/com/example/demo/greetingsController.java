package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class greetingsController {

	 
	
	@GetMapping(path = "/abc")
	public String abc(  @RequestParam (name="names", required=false,defaultValue = "hello"  )String name ,Model m ) {
	 
		m.addAttribute("n", name);
		
				return "newJsp";	
	}
	
}
