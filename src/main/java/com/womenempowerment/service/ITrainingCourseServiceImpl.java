package com.womenempowerment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.womenempowerment.dao.ITrainingCourseDao;
import com.womenempowerment.model.TrainingCourse;
@Service
public class ITrainingCourseServiceImpl implements ITrainingCourseService{
	
	@Autowired
	ITrainingCourseDao dao;
	
	@Override
	public void addTrainingCourse(TrainingCourse course) {
		dao.save(course);
	}

//	@Override
//	public TrainingCourse updateTrainingCourse(TrainingCourse course) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public TrainingCourse viewTrainingCourse(int courseId) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<TrainingCourse> viewAllTrainingCourse() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public void deleteTrainingCourse(int courseId) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void viewByTrainingCourseName(String courseName) {
//		// TODO Auto-generated method stub
//		
//	}

}
