package com.jobs.domain;

public class Volunteer extends AbsStaffMember {
	

	public Volunteer(String name, String address, String phone) throws Exception {
		super(name, address, phone);
		
		//TODO
	}

	

	@Override
	public void pay() {
		//TODO
	}
	
	@Override
	public String toString() {
		return "\n" + "Employee [ id=" + id + ", name=" + name	+ ", address=" + address + ", phone=" + phone + ", totalPaid=" + totalPaid + "]";
	}
}
