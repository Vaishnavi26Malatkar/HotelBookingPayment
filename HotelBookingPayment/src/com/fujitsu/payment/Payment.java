package com.fujitsu.payment;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


import org.springframework.stereotype.Component;


@Component
@Entity
@Table(name="PAYMENT")
public class Payment implements Serializable{
	
	@Id
	@GeneratedValue(generator="increment")
	private long paymentId;
	
	@Column(length=30,nullable=false)
	private String paymentMode;
	
	
	private float amount;
	
	@Column(length=30,nullable=false)
	private String cardholderName;
	
	private long cardNumber;
	private Date expieryDate;
	
	@Column(length=100,nullable=false)
	private String paymentDate;
	
	/*public Payment() {
		// TODO Auto-generated constructor stub
	}
	*/
	/*public Payment(long paymentId, String paymentMode, long amount, String cardholderName, long cardNumber,
			LocalDate expieryDate, LocalDateTime paymentDate) {
		super();
		this.paymentId = paymentId;
		this.paymentMode = paymentMode;
		this.amount = amount;
		this.cardholderName = cardholderName;
		this.cardNumber = cardNumber;
		this.expieryDate = expieryDate;
		this.paymentDate=paymentDate;
	}*/
	public long getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(long paymentId) {
		this.paymentId = paymentId;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public String getCardholderName() {
		return cardholderName;
	}
	public void setCardholderName(String cardholderName) {
		this.cardholderName = cardholderName;
	}
	public long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public Date getExpieryDate() {
		return expieryDate;
	}
	public void setExpieryDate(Date expieryDate) {
		this.expieryDate = expieryDate;
	}
	public String getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}
	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", paymentMode=" + paymentMode + ", amount=" + amount
				+ ", cardholderName=" + cardholderName + ", cardNumber=" + cardNumber + ", expieryDate=" + expieryDate
				+ ", paymentDate=" + paymentDate + "]";
	}
	
	
	
	

}
