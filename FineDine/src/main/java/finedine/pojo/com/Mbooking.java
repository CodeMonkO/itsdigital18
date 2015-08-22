package main.java.finedine.pojo.com;

import java.io.Serializable;

public class Mbooking implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String bookingId;

	private String fnumber;

	public String getBookingId() {
		return bookingId;
	}

	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}

	public String getFnumber() {
		return fnumber;
	}

	public void setFnumber(String fnumber) {
		this.fnumber = fnumber;
	}
}
