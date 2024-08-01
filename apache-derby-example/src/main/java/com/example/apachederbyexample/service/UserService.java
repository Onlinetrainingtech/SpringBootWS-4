package com.example.apachederbyexample.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.apachederbyexample.model.UserRecord;
import com.example.apachederbyexample.repository.UserRepository;    
@Service    
public class UserService   
{    
@Autowired    
private UserRepository userRepository;    
public List<UserRecord> getAllUsers() {
    List<UserRecord> users = new ArrayList<>();
    userRepository.findAll().forEach(users::add);
    return users;
}  
public void addUser(UserRecord userRecord)  
{    
userRepository.save(userRecord);    
}    
}    