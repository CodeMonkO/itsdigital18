package main.java.finedine.pojo.com;

import java.io.Serializable;
import java.util.List;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class Billing implements Serializable {

	private static final long serialVersionUID = -7988394113856044045L;
	private String fnumber;
	@NotEmpty(message = "No Billing items found")
	private List<String> list;
	private List<String> item;

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public List<String> getItem() {
		return item;
	}

	public void setItem(List<String> item) {
		this.item = item;
	}

	public String getFnumber() {
		return fnumber;
	}

	public void setFnumber(String fnumber) {
		this.fnumber = fnumber;
	}

}
