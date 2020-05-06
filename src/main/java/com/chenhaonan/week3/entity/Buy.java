package com.chenhaonan.week3.entity;

import java.io.Serializable;
import java.util.Date;

public class Buy implements Serializable{//预定实体类
	private Integer id;
	private String buydate;
	private String name;
	private String phone;
	private Integer rid;
	private String beizhu;
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the buydate
	 */
	public String getBuydate() {
		return buydate;
	}
	/**
	 * @param string the buydate to set
	 */
	public void setBuydate(String string) {
		this.buydate = string;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @return the rid
	 */
	public Integer getRid() {
		return rid;
	}
	/**
	 * @param rid the rid to set
	 */
	public void setRid(Integer rid) {
		this.rid = rid;
	}
	/**
	 * @return the beizhu
	 */
	public String getBeizhu() {
		return beizhu;
	}
	/**
	 * @param beizhu the beizhu to set
	 */
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	/* (non Javadoc) 
	 * @Title: toString
	 * @Description: TODO
	 * @return 
	 * @see java.lang.Object#toString() 
	 */
	@Override
	public String toString() {
		return "Buy [id=" + id + ", buydate=" + buydate + ", name=" + name
				+ ", phone=" + phone + ", rid=" + rid + ", beizhu=" + beizhu
				+ "]";
	}
	/* (non Javadoc) 
	 * @Title: hashCode
	 * @Description: TODO
	 * @return 
	 * @see java.lang.Object#hashCode() 
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((beizhu == null) ? 0 : beizhu.hashCode());
		result = prime * result + ((buydate == null) ? 0 : buydate.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((rid == null) ? 0 : rid.hashCode());
		return result;
	}
	/* (non Javadoc) 
	 * @Title: equals
	 * @Description: TODO
	 * @param obj
	 * @return 
	 * @see java.lang.Object#equals(java.lang.Object) 
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Buy other = (Buy) obj;
		if (beizhu == null) {
			if (other.beizhu != null)
				return false;
		} else if (!beizhu.equals(other.beizhu))
			return false;
		if (buydate == null) {
			if (other.buydate != null)
				return false;
		} else if (!buydate.equals(other.buydate))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (rid == null) {
			if (other.rid != null)
				return false;
		} else if (!rid.equals(other.rid))
			return false;
		return true;
	}
	public Buy(Integer id, String buydate, String name, String phone,
			Integer rid, String beizhu) {
		super();
		this.id = id;
		this.buydate = buydate;
		this.name = name;
		this.phone = phone;
		this.rid = rid;
		this.beizhu = beizhu;
	}
	public Buy() {
		super();
	}
	
}
