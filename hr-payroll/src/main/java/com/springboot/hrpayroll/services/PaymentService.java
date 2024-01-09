package com.springboot.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.springboot.hrpayroll.entities.Payment;

@Service
public class PaymentService {
	

	public Payment getPayment(long workerID, int days) {
		
		// FIXME adjust
		return new Payment("Bob",200.0, days); 
	}
}
