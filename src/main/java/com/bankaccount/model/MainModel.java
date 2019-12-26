package com.bankaccount.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

@Document(collection = "bank_account")
public class MainModel {
	
	@Id
	private String id;
	private double amount;
	private String accountNumber;
	private String creditCardNumber;
	private double creditLimit;
	private double avalibleAmount;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd@HH:mm:ss")
	private Date createdAt;
	private String type;
	private double startingAmount;
	private double currentAmount;
	private double finalMonthAmount;
	private double chargeAmount;
	private int maxOfMovement;
	private int numberOfMovement;
	private String status;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getCreditCardNumber() {
		return creditCardNumber;
	}
	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
	public double getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}
	public double getAvalibleAmount() {
		return avalibleAmount;
	}
	public void setAvalibleAmount(double avalibleAmount) {
		this.avalibleAmount = avalibleAmount;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getStartingAmount() {
		return startingAmount;
	}
	public void setStartingAmount(double startingAmount) {
		this.startingAmount = startingAmount;
	}
	public double getCurrentAmount() {
		return currentAmount;
	}
	public void setCurrentAmount(double currentAmount) {
		this.currentAmount = currentAmount;
	}
	public double getFinalMonthAmount() {
		return finalMonthAmount;
	}
	public void setFinalMonthAmount(double finalMonthAmount) {
		this.finalMonthAmount = finalMonthAmount;
	}
	public double getChargeAmount() {
		return chargeAmount;
	}
	public void setChargeAmount(double chargeAmount) {
		this.chargeAmount = chargeAmount;
	}
	public int getMaxOfMovement() {
		return maxOfMovement;
	}
	public void setMaxOfMovement(int maxOfMovement) {
		this.maxOfMovement = maxOfMovement;
	}
	public int getNumberOfMovement() {
		return numberOfMovement;
	}
	public void setNumberOfMovement(int numberOfMovement) {
		this.numberOfMovement = numberOfMovement;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
