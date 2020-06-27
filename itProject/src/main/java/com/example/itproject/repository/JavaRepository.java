package com.example.itproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.itproject.entity.Java;

@Repository
public interface JavaRepository extends JpaRepository<Java , Long>{

}
