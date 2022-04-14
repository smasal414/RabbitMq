package com.example.demo.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.RegistrationForm;
import com.example.demo.service.ManagementService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/management")
@Slf4j
public class ManagementResource {

	@Autowired
	ManagementService managementService;

	@GetMapping("/findAll")
	public List<RegistrationForm> fetchAll() {
		String methodName = "fetchAll()";
		log.info(methodName + " called");
		return managementService.fetchAllNewStudentRecords();

	}


@PostMapping("/save")
	public String enrolYourself(@RequestBody RegistrationForm form)
{
	return managementService.enrolYourself(form);
}

}
