package main.java.finedine.pojo.com;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotEmpty;

public class Billing implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7988394113856044045L;
	@NotEmpty
	private String item;
	@NotEmpty
	private String qty;
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getQty() {
		return qty;
	}
	public void setQty(String qty) {
		this.qty = qty;
	}
}
