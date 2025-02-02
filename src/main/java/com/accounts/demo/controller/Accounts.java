package com.accounts.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Accounts {
	
	@Value("${build.version}")
	private String build;
	
	@GetMapping("/getbuildversion")
	public String getBuildVersion() {
		return build;
	}
}
