package main.java.finedine.entitypojo.com;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class UsersEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7089645434761526654L;
	@Id
	@Column(name = "id")
	@GeneratedValue
	private Integer id;
	@Column(name = "name")
	private String name;
	@Column(name = "emailid")
	private String emailid;
	@Column(name = "contactnum")
	private String contactnum;
	@Column(name = "uuid")
	private String uuid;
	@Column(name = "occasion")
	private String occasion;
	@Column(name = "timezone")
	private String timezone;
	@Column(name = "bdtime")
	private String bdtime;
	@Column(name = "vdtime")
	private String vdtime;
	@Column(name = "visited")
	private String visited;
	@Column(name = "tablenum")
	private String tablenum;
	@Column(name = "seatsbooked")
	private String seatsbooked;
	@Column(name = "billamt")
	private String billamt;
	@Column(name = "billpayed")
	private String billpayed;
	@Column(name = "rcount")
	private String rcount;
	@Column(name = "fnumber")
	private String fnumber;

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getContactnum() {
		return contactnum;
	}

	public void setContactnum(String contactnum) {
		this.contactnum = contactnum;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getOccasion() {
		return occasion;
	}

	public void setOccasion(String occasion) {
		this.occasion = occasion;
	}

	public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public String getBdtime() {
		return bdtime;
	}

	public void setBdtime(String bdtime) {
		this.bdtime = bdtime;
	}

	public String getVdtime() {
		return vdtime;
	}

	public void setVdtime(String vdtime) {
		this.vdtime = vdtime;
	}

	public String getVisited() {
		return visited;
	}

	public void setVisited(String visited) {
		this.visited = visited;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTablenum() {
		return tablenum;
	}

	public void setTablenum(String tablenum) {
		this.tablenum = tablenum;
	}

	public String getSeatsbooked() {
		return seatsbooked;
	}

	public void setSeatsbooked(String seatsbooked) {
		this.seatsbooked = seatsbooked;
	}

	public String getBillamt() {
		return billamt;
	}

	public void setBillamt(String billamt) {
		this.billamt = billamt;
	}

	public String getBillpayed() {
		return billpayed;
	}

	public void setBillpayed(String billpayed) {
		this.billpayed = billpayed;
	}

	public String getRcount() {
		return rcount;
	}

	public void setRcount(String rcount) {
		this.rcount = rcount;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFnumber() {
		return fnumber;
	}

	public void setFnumber(String fnumber) {
		this.fnumber = fnumber;
	}
}
