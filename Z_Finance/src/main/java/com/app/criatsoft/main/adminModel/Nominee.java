package com.app.criatsoft.main.adminModel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Nominee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int nomId;
	private String nomName;
	private String nomRelation;
	private String nomDob;
	private String nomAge;
	public int getNomId() {
		return nomId;
	}
	public void setNomId(int nomId) {
		this.nomId = nomId;
	}
	public String getNomName() {
		return nomName;
	}
	public void setNomName(String nomName) {
		this.nomName = nomName;
	}
	public String getNomRelation() {
		return nomRelation;
	}
	public void setNomRelation(String nomRelation) {
		this.nomRelation = nomRelation;
	}
	public String getNomDob() {
		return nomDob;
	}
	public void setNomDob(String nomDob) {
		this.nomDob = nomDob;
	}
	public String getNomAge() {
		return nomAge;
	}
	public void setNomAge(String nomAge) {
		this.nomAge = nomAge;
	}
	public Nominee(int nomId, String nomName, String nomRelation, String nomDob, String nomAge) {
		super();
		this.nomId = nomId;
		this.nomName = nomName;
		this.nomRelation = nomRelation;
		this.nomDob = nomDob;
		this.nomAge = nomAge;
	}
	public Nominee() {
		
	}
	@Override
	public String toString() {
		return "Nominee [nomId=" + nomId + ", nomName=" + nomName + ", nomRelation=" + nomRelation + ", nomDob="
				+ nomDob + ", nomAge=" + nomAge + "]";
	}
	

}
