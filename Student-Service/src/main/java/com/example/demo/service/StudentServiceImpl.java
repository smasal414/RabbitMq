package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentDao;
import com.example.demo.model.RegistrationForm;
import com.example.demo.resource.MailSender;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class StudentServiceImpl implements StudentService {

	@Autowired
	MailSender sender;
	
	@Autowired
	StudentDao studentDao;

	@Override
	public String enrollYourself(RegistrationForm form) {
		studentDao.save(form);
		String msg = "You have Succefully filled the admission Form";
		String methodName = "enrollYourself()";
		log.info(methodName + " called");
		sender.getDetails(msg);
		return msg;
	}

}
