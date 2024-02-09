package com.OnlineMedicalShop.service;

import org.springframework.stereotype.Service;

@Service
public interface AdminService {

	boolean verifyAdmin(String email, String password);

	boolean checkEntry(String email);
}
