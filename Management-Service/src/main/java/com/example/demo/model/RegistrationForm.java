package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "registration_form")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegistrationForm {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "form_id")
	private int formId;

	@Column(name = "student_name")
	private String studentName;

	private String gender;

	@Column(name = "mob_no")
	private long mobNo;

	private double marks;

}
