package main.java.finedine.pojo.com;

import java.io.Serializable;
import java.util.List;

import org.hibernate.validator.constraints.NotEmpty;

public class Billing implements Serializable {
	
	private static final long serialVersionUID = -7988394113856044045L;
	@NotEmpty
	private String emailid;
	@NotEmpty
	private List<String> list;

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

}
