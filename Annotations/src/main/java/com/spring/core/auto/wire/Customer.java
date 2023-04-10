package com.spring.core.auto.wire;

import org.springframework.stereotype.Component;

@Component
public class Customer {
	private address address;

	public address getAddress() {
		return address;
	}

	public void setAddress(address address) {
		this.address = address;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Customer(address address) {
		super();
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [address=" + address + "]";
	}

	
}
 