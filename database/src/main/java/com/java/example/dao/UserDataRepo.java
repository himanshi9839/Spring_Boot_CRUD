package com.java.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.example.model.userData;

public interface UserDataRepo extends JpaRepository<userData, Integer>{
    //To read data from database for deletion
	userData findByName(String name);
}
