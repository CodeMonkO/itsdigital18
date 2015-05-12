package main.java.finedine.pojo.com;

import java.io.Serializable;

public class ResetPassword implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String vcode;
	private String password;
	private String cpassword;

	public String getVcode() {
		return vcode;
	}

	public void setVcode(String vcode) {
		this.vcode = vcode;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCpassword() {
		return cpassword;
	}

	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}
}
