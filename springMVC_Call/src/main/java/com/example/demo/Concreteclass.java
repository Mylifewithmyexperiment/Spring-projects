package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Concreteclass {
	@Autowired
	Iservice i;

	@GetMapping("/a")
	public String greet(@RequestParam(name = "name1", defaultValue = "helloWorld", required = true) String name1,

			@RequestParam(name = "name2", defaultValue = "care", required = true) String name2, Model m) {

		String c = i.addString(name1, name2);

		m.addAttribute("s", c);

		return "ss";

	}

	//for checking 
	@GetMapping("/abc")
	public String greetings(@RequestParam(name = "name", defaultValue = "sdcs", required = true) String s, Model m) {
		m.addAttribute("s", s);
		return "ss";
	}

	// for default case 
@GetMapping("/")
public String greeting(@RequestParam(name= "name1" , defaultValue="chal raha h" ,required = true )String name, Model m )
{
	m.addAttribute("s", name);
	return "ss";
}
	

}
