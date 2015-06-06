package main.java.finedine.pojo.com;

import java.io.Serializable;
import java.util.List;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

public class UpdateProfile implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3870526690538161342L;
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
	@NotEmpty
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

	private List<MultipartFile> files;

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

	public List<MultipartFile> getFiles() {
		return files;
	}

	public void setFiles(List<MultipartFile> files) {
		this.files = files;
	}

}