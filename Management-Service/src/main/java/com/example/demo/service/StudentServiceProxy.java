package com.example.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.RegistrationForm;

@FeignClient(name = "student-service")
public interface StudentServiceProxy {

	@PostMapping("/api/student/save")
	public String enrolYourself(@RequestBody RegistrationForm form);
}
