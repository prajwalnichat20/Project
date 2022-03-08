package com.app.criatsoft.main.adminModel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BankDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bankId;
	private String bankName;
	private String bankBranchname;
	private String bankAccountno;
	private String bankIfsccode;
	private String bankAddress;
	public int getBankId() {
		return bankId;
	}
	public void setBankId(int bankId) {
		this.bankId = bankId;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankBranchname() {
		return bankBranchname;
	}
	public void setBankBranchname(String bankBranchname) {
		this.bankBranchname = bankBranchname;
	}
	public String getBankAccountno() {
		return bankAccountno;
	}
	public void setBankAccountno(String bankAccountno) {
		this.bankAccountno = bankAccountno;
	}
	public String getBankIfsccode() {
		return bankIfsccode;
	}
	public void setBankIfsccode(String bankIfsccode) {
		this.bankIfsccode = bankIfsccode;
	}
	public String getBankAddress() {
		return bankAddress;
	}
	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}
	public BankDetails(int bankId, String bankName, String bankBranchname, String bankAccountno, String bankIfsccode,
			String bankAddress) {
		super();
		this.bankId = bankId;
		this.bankName = bankName;
		this.bankBranchname = bankBranchname;
		this.bankAccountno = bankAccountno;
		this.bankIfsccode = bankIfsccode;
		this.bankAddress = bankAddress;
	}
	public BankDetails() {
		
	}
	@Override
	public String toString() {
		return "BankDetails [bankId=" + bankId + ", bankName=" + bankName + ", bankBranchname=" + bankBranchname
				+ ", bankAccountno=" + bankAccountno + ", bankIfsccode=" + bankIfsccode + ", bankAddress=" + bankAddress
				+ "]";
	}

}
