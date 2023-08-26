package com.example.Springbooth2Example1.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.Springbooth2Example1.model.Student;

public interface StudentRepository extends CrudRepository<Student,Integer>
{

}
