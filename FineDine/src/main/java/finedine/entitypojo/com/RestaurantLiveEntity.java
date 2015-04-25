package main.java.finedine.entitypojo.com;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "restaurantlive")
public class RestaurantLiveEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1684787097059664515L;
	@Id
	@Column(name = "id")
	@GeneratedValue
	private Integer id;
	@Column(name = "uuid")
	private String uuid;
	@Column(name = "maxseat")
	private String maxseat;
	@Column(name = "bookedseat")
	private String bookedseat;
	@Column(name = "statusflag")
	private boolean statusflag;

	public boolean isStatusflag() {
		return statusflag;
	}

	public void setStatusflag(boolean statusflag) {
		this.statusflag = statusflag;
	}

	public String getBookedseat() {
		return bookedseat;
	}

	public void setBookedseat(String bookedseat) {
		this.bookedseat = bookedseat;
	}

	public String getMaxseat() {
		return maxseat;
	}

	public void setMaxseat(String maxseat) {
		this.maxseat = maxseat;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	@Override
	public String toString() {
		return "ClassPojo [bookedseat = " + bookedseat + ", maxseat = "
				+ maxseat + ", uuid = " + uuid + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
