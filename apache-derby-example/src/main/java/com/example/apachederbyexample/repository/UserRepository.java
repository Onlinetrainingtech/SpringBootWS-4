package com.example.apachederbyexample.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.apachederbyexample.model.UserRecord;    
public interface UserRepository extends CrudRepository<UserRecord, String>   
{    
}    