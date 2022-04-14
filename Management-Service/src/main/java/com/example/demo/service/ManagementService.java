package com.example.demo.service;

import java.util.List;

import com.example.demo.model.RegistrationForm;

public interface ManagementService {

	List<RegistrationForm> fetchAllNewStudentRecords();

	public String enrolYourself(RegistrationForm form);
}
