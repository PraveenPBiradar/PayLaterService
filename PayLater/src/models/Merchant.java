package models;

import java.io.Serializable;

public class Merchant implements Serializable {
	private String name;
	private String email;
	private float discount;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return name+"("+discount+"%)";
	}
}
