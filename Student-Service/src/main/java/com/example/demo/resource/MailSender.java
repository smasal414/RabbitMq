package com.example.demo.resource;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailSender {

	@Autowired
	RabbitTemplate rabbitTemplate;

	@Bean
	public Queue firstQueue() {      // creating a message 
		return new Queue("newAdmissionQ", false);
	}

	public void getDetails(String msg) {                // send the message to queq
		rabbitTemplate.convertAndSend("newAdmissionQ", msg);
	}
}
