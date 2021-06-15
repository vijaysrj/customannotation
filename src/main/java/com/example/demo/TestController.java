package com.example.demo;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@PostMapping("/test")
	@Traceable
	public String test(@RequestBody Map<String, String> input, HttpServletRequest servletRequest) {

		return "success";
	}
}
