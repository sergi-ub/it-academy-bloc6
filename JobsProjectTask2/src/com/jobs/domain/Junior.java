package com.jobs.domain;

public class Junior extends Employee{

	public Junior(String name, String address, String phone, double salaryPerMonth, IPaymentRate paymentRate)
			throws Exception {
		super(name, address, phone, salaryPerMonth, paymentRate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Junior [ id=  " + id + ", name= " + name + ", address= " + address + ", phone= " + phone 
				+ ", salaryPerMonth= " + salaryPerMonth   + ", totalPaid= " + totalPaid + "]";
	}
	
	
}
