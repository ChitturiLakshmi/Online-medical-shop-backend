package com.OnlineMedicalShop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.OnlineMedicalShop.model.Cart;


public interface CartRepository extends JpaRepository<Cart,Long>{


}