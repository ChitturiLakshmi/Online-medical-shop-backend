package com.OnlineMedicalShop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.OnlineMedicalShop.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Integer> {
   
}
