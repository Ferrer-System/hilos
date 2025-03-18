package com.ferrer.springboot.calendar.controllers;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class AppController {

	@GetMapping("/foo")
	public ResponseEntity<?> foo(HttpServletRequest request){
		Map<String, Object> dataMap = new HashMap<>();
				dataMap.put("title", "Bienvenidos al sistema de atencion!");
				dataMap.put("time", new Date());
				dataMap.put("message", request.getAttribute("message"));
		return ResponseEntity.ok(dataMap);
	}
	
}
