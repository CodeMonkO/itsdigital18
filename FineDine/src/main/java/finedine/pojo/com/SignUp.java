package main.java.finedine.pojo.com;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotEmpty;


public class SignUp implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3870526690538161342L;
	@NotEmpty(message="Error")
	private String country;
	@NotEmpty
	private String state;
	@NotEmpty
	private String city;
	@NotEmpty
	private String address;
	@NotEmpty
	private String zipcode;
	@NotEmpty
	private String rname;
	@NotEmpty
	private String rmailid;
	@NotEmpty
	private String password;
	@NotEmpty
	private String cpassword;
	@NotEmpty
	private String rcontact;
	private String raltcontact;
	@NotEmpty
	private String rtype;
	@NotEmpty
	private String rsubtype;
	@NotEmpty
	private String rmaxseats;
	@NotEmpty
	private String opentime;
	@NotEmpty
	private String closetime;
	@NotEmpty
	private String rrating;
	@NotEmpty
	private String status;
	@NotEmpty
	private String menulocation;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public String getRmailid() {
		return rmailid;
	}

	public void setRmailid(String rmailid) {
		this.rmailid = rmailid;
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

	public String getRcontact() {
		return rcontact;
	}

	public void setRcontact(String rcontact) {
		this.rcontact = rcontact;
	}

	public String getRaltcontact() {
		return raltcontact;
	}

	public void setRaltcontact(String raltcontact) {
		this.raltcontact = raltcontact;
	}

	public String getRtype() {
		return rtype;
	}

	public void setRtype(String rtype) {
		this.rtype = rtype;
	}

	public String getRsubtype() {
		return rsubtype;
	}

	public void setRsubtype(String rsubtype) {
		this.rsubtype = rsubtype;
	}

	public String getRmaxseats() {
		return rmaxseats;
	}

	public void setRmaxseats(String rmaxseats) {
		this.rmaxseats = rmaxseats;
	}

	public String getOpentime() {
		return opentime;
	}

	public void setOpentime(String opentime) {
		this.opentime = opentime;
	}

	public String getClosetime() {
		return closetime;
	}

	public void setClosetime(String closetime) {
		this.closetime = closetime;
	}

	public String getRrating() {
		return rrating;
	}

	public void setRrating(String rrating) {
		this.rrating = rrating;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMenulocation() {
		return menulocation;
	}

	public void setMenulocation(String menulocation) {
		this.menulocation = menulocation;
	}
}
