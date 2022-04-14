package com.example.demo.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.RegistrationForm;
import com.example.demo.service.StudentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/student")
@Slf4j
public class StudentResource {

	@Autowired	
	StudentService studentService;

	@PostMapping("/save")
	public String enrolYourself(@RequestBody RegistrationForm form) {
		String methodName = "enrolYourself()";
		log.info(methodName + " called");
		return studentService.enrollYourself(form);

	}
}
