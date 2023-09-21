package com.example.springbooth2example10.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.springbooth2example10.model.Student;

public interface StudentRepository extends CrudRepository<Student,Integer>
{

}
