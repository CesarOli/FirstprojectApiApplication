package com.example.crm.firstprojectapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crm.firstprojectapi.model.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, String> {
}