package com.springsecurity.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {
	
	@GetMapping
	public String getDemo() {
		return "<h1>Spring Security Demo Controller</h1>";
	}
	
	@GetMapping("/one")
	public String getDemoOne() {
		return "<h1>Spring Security Demo One Controller</h1>";
	}
	
	@GetMapping("/two")
	public String getDemoTwo() {
		return "<h1>Spring Security Demo Two Controller</h1>";
	}
	@GetMapping("/three")
	public String getDemoThree() {
		return "<h1>Spring Security Demo Three Controller</h1>";
	}

}
