package com.abcode.hrpayroll.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abcode.hrpayroll.entities.Payment;
import com.abcode.hrpayroll.entities.Worker;
import com.abcode.hrpayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {
	
	
	@Autowired
	private WorkerFeignClient  workerFeignClient;

	public Payment getPayment(Long workerId, int days) {
		
		Worker worker = workerFeignClient.findById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}

}
