package com.abcode.hrpayroll.service;

import org.springframework.stereotype.Service;

import com.abcode.hrpayroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(Long workerId, int days) {
		return new Payment("Bob", 200.0, days);
	}

}
