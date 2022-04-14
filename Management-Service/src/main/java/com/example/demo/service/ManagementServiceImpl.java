package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ManagementDao;
import com.example.demo.model.RegistrationForm;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ManagementServiceImpl implements ManagementService {

	@Autowired
	ManagementDao managementDao;

	@Autowired
	StudentServiceProxy serviceProxy;

	@Override
	public List<RegistrationForm> fetchAllNewStudentRecords() {
		String methodName = "fetchAllNewStudentRecords()";
		log.info(methodName + " called");
		return managementDao.findAll();
	}

	@Override
	public String enrolYourself(RegistrationForm form) {

		return serviceProxy.enrolYourself(form);
	}

}
