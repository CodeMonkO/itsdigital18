package main.java.finedine.pojo.com;

import java.io.Serializable;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class Booking implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@NotEmpty(message = "Enter seats to be booked")
	private String name;
	@NotEmpty(message = "Enter seats to be booked")
	private String booking;
	@NotEmpty(message = "Field cannot be left blank")
	@Email(message = "Enter valid email ID")
	private String emailid;
	@NotEmpty(message = "Enter contact no")
	private String contactno;
	private String event;

	public String getBooking() {
		return booking;
	}

	public void setBooking(String booking) {
		this.booking = booking;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
