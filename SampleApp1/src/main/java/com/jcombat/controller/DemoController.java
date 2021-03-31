package com.jcombat.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class DemoController {

	@GetMapping("/")
	public String welcome() {
		return "welcomeRutu";
	}
}