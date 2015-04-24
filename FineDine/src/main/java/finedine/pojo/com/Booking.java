package main.java.finedine.pojo.com;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class Booking {
	@NotEmpty(message = "Enter seats to be booked")
	private String booking;
	@NotEmpty(message = "Field cannot be left blank")
	@Email(message = "Enter valid email ID")
	private String emailid;
	@NotEmpty(message = "Enter contact no")
	private String contactno;
	@NotEmpty(message = "Enter event")
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
}
