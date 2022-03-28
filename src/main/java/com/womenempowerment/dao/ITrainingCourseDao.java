package com.womenempowerment.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.womenempowerment.model.TrainingCourse;

@Repository
public interface ITrainingCourseDao extends JpaRepository<TrainingCourse, Integer>{
//	TrainingCourse addTrainingCourse(TrainingCourse course);
//	TrainingCourse updateTrainingCourse(TrainingCourse course);
//	TrainingCourse viewTrainingCourse(int courseId);
//	List<TrainingCourse> viewAllTrainingCourse();
//	void deleteTrainingCourse(int courseId);
//	void viewByTrainingCourseName(String courseName);

}
