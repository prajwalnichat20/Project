package com.app.criatsoft.main.adminModel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Guarantor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int guarantorId;
	private String guarantorName;
	private String guarantorMobileno;
	private String guarantorOccupation;
	public int getGuarantorId() {
		return guarantorId;
	}
	public void setGuarantorId(int guarantorId) {
		this.guarantorId = guarantorId;
	}
	public String getGuarantorName() {
		return guarantorName;
	}
	public void setGuarantorName(String guarantorName) {
		this.guarantorName = guarantorName;
	}
	public String getGuarantorMobileno() {
		return guarantorMobileno;
	}
	public void setGuarantorMobileno(String guarantorMobileno) {
		this.guarantorMobileno = guarantorMobileno;
	}
	public String getGuarantorOccupation() {
		return guarantorOccupation;
	}
	public void setGuarantorOccupation(String guarantorOccupation) {
		this.guarantorOccupation = guarantorOccupation;
	}
	public Guarantor(int guarantorId, String guarantorName, String guarantorMobileno, String guarantorOccupation) {
		super();
		this.guarantorId = guarantorId;
		this.guarantorName = guarantorName;
		this.guarantorMobileno = guarantorMobileno;
		this.guarantorOccupation = guarantorOccupation;
	}
	public Guarantor() {
		//Guaranter is hear
	}
	@Override
	public String toString() {
		return "Guarantor [guarantorId=" + guarantorId + ", guarantorName=" + guarantorName + ", guarantorMobileno="
				+ guarantorMobileno + ", guarantorOccupation=" + guarantorOccupation + "]";
	}


}
