package com.womenempowerment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.womenempowerment.model.TrainingCourse;
import com.womenempowerment.service.ITrainingCourseService;

@RestController
@RequestMapping("/trainingCourse")
public class TrainingCourseController {
	@Autowired
	ITrainingCourseService service;
	
	@PostMapping("/add")
	public ResponseEntity<String> addCourse(@RequestBody TrainingCourse course) {
		service.addTrainingCourse(course);
		return new ResponseEntity<String>("Course added",HttpStatus.OK);
	}
}
