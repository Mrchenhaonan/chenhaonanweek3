package com.chenhaonan.week3.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Room implements Serializable{//房屋类型实体类
	private BigInteger id;
	private String roomtype;
	private BigDecimal roomprice;
	/**
	 * @return the id
	 */
	public BigInteger getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(BigInteger id) {
		this.id = id;
	}
	/**
	 * @return the roomtype
	 */
	public String getRoomtype() {
		return roomtype;
	}
	/**
	 * @param roomtype the roomtype to set
	 */
	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}
	/**
	 * @return the roomprice
	 */
	public BigDecimal getRoomprice() {
		return roomprice;
	}
	/**
	 * @param roomprice the roomprice to set
	 */
	public void setRoomprice(BigDecimal roomprice) {
		this.roomprice = roomprice;
	}
	/* (non Javadoc) 
	 * @Title: toString
	 * @Description: TODO
	 * @return 
	 * @see java.lang.Object#toString() 
	 */
	@Override
	public String toString() {
		return "Room [id=" + id + ", roomtype=" + roomtype + ", roomprice="
				+ roomprice + "]";
	}
	public Room(BigInteger id, String roomtype, BigDecimal roomprice) {
		super();
		this.id = id;
		this.roomtype = roomtype;
		this.roomprice = roomprice;
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
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((roomprice == null) ? 0 : roomprice.hashCode());
		result = prime * result
				+ ((roomtype == null) ? 0 : roomtype.hashCode());
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
		Room other = (Room) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (roomprice == null) {
			if (other.roomprice != null)
				return false;
		} else if (!roomprice.equals(other.roomprice))
			return false;
		if (roomtype == null) {
			if (other.roomtype != null)
				return false;
		} else if (!roomtype.equals(other.roomtype))
			return false;
		return true;
	}
	public Room() {
		super();
	}
	
}
