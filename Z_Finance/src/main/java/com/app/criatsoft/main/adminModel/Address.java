package com.app.criatsoft.main.adminModel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int addrId;
	private String areaName;
	private String cityName;
	private String stateName;
	private String pinCode;
	public int getAddrId() {
		return addrId;
	}
	public void setAddrId(int addrId) {
		this.addrId = addrId;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public Address(int addrId, String areaName, String cityName, String stateName, String pinCode) {
		super();
		this.addrId = addrId;
		this.areaName = areaName;
		this.cityName = cityName;
		this.stateName = stateName;
		this.pinCode = pinCode;
	}
	public Address() {
		
	}
	@Override
	public String toString() {
		return "Address [addrId=" + addrId + ", areaName=" + areaName + ", cityName=" + cityName + ", stateName="
				+ stateName + ", pinCode=" + pinCode + "]";
	}

}
