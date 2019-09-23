package com.bhatnagar.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
public class UserDetails {
	// private Address address;
	private String description;
	private Date joinedDate;

	@ElementCollection(fetch=FetchType.EAGER)
	@JoinTable(name = "USER_ADDRESS", joinColumns = @JoinColumn(name = "USER_ID"))
	private Collection<Address> listOfAddress = new ArrayList<Address>();
	// private Set<Address> listOfAddress;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;

	private String userName;

	public String getDescription() {
		return description;
	}

	public Date getJoinedDate() {
		return joinedDate;
	}

	public Collection<Address> getListOfAddress() {
		return listOfAddress;
	}

	public int getUserId() {
		return userId;
	}

//	public Set<Address> getListOfAddress() {
//		return listOfAddress;
//	}

	public String getUserName() {
		return userName;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}

	public void setListOfAddress(Collection<Address> listOfAddress) {
		this.listOfAddress = listOfAddress;
	}

//	public void setListOfAddress(Set<Address> listOfAddress) {
//		this.listOfAddress = listOfAddress;
//	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

//	public Address getAddress() {
//		return address;
//	}
//
//	public void setAddress(Address address) {
//		this.address = address;
//	}

}
