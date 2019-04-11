package com.fujitsu.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import com.fujitsu.exception.ServiceException;
import com.fujitsu.payment.Payment;
import com.fujitsu.services.PaymentService;

@Controller
public class PaymentController {
	@Autowired

	private PaymentService paymentService;
	
	
	@GetMapping("/payments")
	public String viewAllPayments(HttpSession session)
	{
		try {
			List<Payment> payments=paymentService.findAllPayments();
			session.setAttribute("paymentList", payments);
		} catch (ServiceException e) {
			
			e.printStackTrace();
		}
		return "paymentview";
	}
	
	@GetMapping("/add")
	public String addPaymentForm()
	{
		return "paymentmode";
	}

	@PostMapping("/addpayment")
	public String addPayment(Payment payment,ModelMap map)
	{
		try {
			paymentService.add(payment);
			map.addAttribute("payment",payment);
			return "success";
		} catch (ServiceException e) {
			
			e.printStackTrace();
			map.addAttribute("paymentadderror","Sorry!!!!! Payment could not be save.....");
			return "paymentmode";
		}
		
	
	}

}
