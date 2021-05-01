package com.myfirst;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
	@RestController
	@RequestMapping("/")
	public class Hello {
		@RequestMapping("/{name}")
	    public String displayText(@PathVariable("name") String name) {
	            return "Hello, " + name;
	    }
		@RequestMapping("/{name}{last}")
	    public String displayText2(@PathVariable("name") String name, @PathVariable("last") String last) {
	            return "Hello, " + name + last;
	    }
	@RequestMapping("")
	public String hello() {
	       return "Hello, Human!";
	    }
	}