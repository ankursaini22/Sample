package com.EKart.Company.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EKart.Company.Entities.User;


public interface UserDao extends JpaRepository<User, Long>{
//JPA
}
