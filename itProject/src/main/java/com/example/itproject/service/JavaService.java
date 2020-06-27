package com.example.itproject.service;

import java.util.List;

import com.example.itproject.entity.Java;

public interface JavaService  {

	
	public void createJava(Java java);
	public List<Java> GetJavas();
	public void deleteJava(Long id);
}
