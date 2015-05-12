package main.java.finedine.entitypojo.com;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "restaurantdetails")
public class RestaurantSignUpFormEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	@GeneratedValue
	private Integer id;
	@Column(name = "uuid")
	private String uuid;
	@Column(name = "country")
	private String country;
	@Column(name = "countrycode")
	private String countrycode;
	@Column(name = "state")
	private String state;
	@Column(name = "statecode")
	private String statecode;
	@Column(name = "city")
	private String city;
	@Column(name = "citycode")
	private String citycode;
	@Column(name = "zipcode")
	private String zipcode;
	@Column(name = "address")
	private String address;
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

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountrycode() {
		return countrycode;
	}

	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStatecode() {
		return statecode;
	}

	public void setStatecode(String statecode) {
		this.statecode = statecode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCitycode() {
		return citycode;
	}

	public void setCitycode(String citycode) {
		this.citycode = citycode;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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
