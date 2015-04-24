package main.java.finedine.pojo.com;

import java.io.Serializable;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class SignIn implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6033985014383858939L;

	@Email(message = "Email Not Valid")
	@NotEmpty(message = "Email cannot be empty")
	private String email;
	@NotEmpty(message = "Password cannot be empty")
	@NotNull(message = "Password cannot be null")
	private String password;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
