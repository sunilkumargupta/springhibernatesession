package com.sunRays;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Transient;

import org.hibernate.annotations.Parameter;  
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Address {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)  
private int addressId;
private String address;


public int getAddressId() {
	return addressId;
}
public void setAddressId(int addressId) {
	this.addressId = addressId;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

@Override
	public String toString() {
		// TODO Auto-generated method stub
		return addressId+"  "+address;
	}


}
