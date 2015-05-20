package main.java.finedine.entitypojo.com;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class UpdateProfileFormEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	@GeneratedValue
	private Integer id;
	@Column(name = "rname")
	private String rname;
	@Column(name = "rmail")
	private String rmail;
	@Column(name = "password")
	private String password;
	@Column(name = "rcontact")
	private String rcontact;
	@Column(name = "altcontact")
	private String altcontact;
	@Column(name = "rtype")
	private String rtype;
	@Column(name = "subtype")
	private String subtype;
	@Column(name = "maxseat")
	private String maxseat;
	@Column(name = "otime")
	private String otime;
	@Column(name = "ctime")
	private String ctime;
	@Column(name = "rating")
	private String rating;
	@Column(name = "status")
	private String status;
	@Column(name = "menufilelocation")
	private String menufilelocation;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public String getRmail() {
		return rmail;
	}

	public void setRmail(String rmail) {
		this.rmail = rmail;
	}

	public String getRcontact() {
		return rcontact;
	}

	public void setRcontact(String rcontact) {
		this.rcontact = rcontact;
	}

	public String getAltcontact() {
		return altcontact;
	}

	public void setAltcontact(String altcontact) {
		this.altcontact = altcontact;
	}

	public String getRtype() {
		return rtype;
	}

	public void setRtype(String rtype) {
		this.rtype = rtype;
	}

	public String getSubtype() {
		return subtype;
	}

	public void setSubtype(String subtype) {
		this.subtype = subtype;
	}

	public String getMaxseat() {
		return maxseat;
	}

	public void setMaxseat(String maxseat) {
		this.maxseat = maxseat;
	}

	public String getOtime() {
		return otime;
	}

	public void setOtime(String otime) {
		this.otime = otime;
	}

	public String getCtime() {
		return ctime;
	}

	public void setCtime(String ctime) {
		this.ctime = ctime;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMenufilelocation() {
		return menufilelocation;
	}

	public void setMenufilelocation(String menufilelocation) {
		this.menufilelocation = menufilelocation;
	}
}
