package com.example.itproject.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.itproject.entity.Java;
import com.example.itproject.repository.JavaRepository;

@Service
public class JavaServiceImp implements JavaService {
	
	@Autowired
	private JavaRepository javaRepository;

	
	
	@Override
	public void createJava(Java java) {

		
		javaRepository.save(java);
		//Course course = new Course();
//		Java j=new Java();
//		BeanUtils.copyProperties(courseDto, course);
//
//		Course savedCourse = courseRepository.save(course);
//		CourseDto savedCourseDto = new CourseDto();
//		BeanUtils.copyProperties(savedCourse, savedCourseDto);

		
	}



	@Override
	public List<Java> GetJavas() {
		List<Java> jList=javaRepository.findAll();
		return jList;
	}



	@Override
	public void deleteJava(Long id) {
		javaRepository.deleteById(id);
		
	}

}
