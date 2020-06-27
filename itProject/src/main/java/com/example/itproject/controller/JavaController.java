package com.example.itproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.itproject.entity.Java;
import com.example.itproject.service.JavaService;

@RestController
@RequestMapping("/java")
public class JavaController {
	
	@Autowired
	private JavaService javaService;
	
	
	@PostMapping
	public void createJava(@RequestBody Java java) {
		
		javaService.createJava(java);

//		CourseDto courseDto = new CourseDto();
//		BeanUtils.copyProperties(courseRequest, courseDto);
//
//		CourseDto savedCourseDto = courseService.saveCourse(courseDto);
//		CourseResponse courseResponse = new CourseResponse();
	//	BeanUtils.copyProperties(savedCourseDto, courseResponse);

		
	}
	
	
	@GetMapping
	public List<Java> getJavas(){
		
		List<Java> jList = javaService.GetJavas();

		
		return jList;
	}
	
	
	@DeleteMapping("/{id}")
	public String deleteJava(@PathVariable("id")Long id) {
		javaService.deleteJava(id);
		return "Deleted";
	}
	
	
	

}
