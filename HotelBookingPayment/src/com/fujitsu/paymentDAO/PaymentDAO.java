package com.fujitsu.paymentDAO;

import java.util.List;
import com.fujitsu.payment.Payment;

public interface PaymentDAO {
	
	List<Payment> getAllPayments();
	Payment getPaymentById(int paymentId);
	public void insert(Payment name);
	
	public void update(Payment payment);
	public void delete(Payment payment);

}
