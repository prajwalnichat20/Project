package com.app.criatsoft.main.adminModel;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Applicant {
	@Id
	private String applicantId;
	private String applicantFname;
	private String applicantLname;
	private String applicantMobileno;
	private String applicantEmailid;
	private String applicantDob;
	private String applicantOccupation;
	private String applicantAadharno;
	private String applicantPanno;
	private long applicantLoanamt;
	private int cibilScore;
	private String status;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Document document;
	
	@OneToOne(cascade = CascadeType.ALL)
	private BankDetails bankdetails;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Nominee nominee;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Guarantor guarantor;

	public String getApplicantId() {
		return applicantId;
	}

	public void setApplicantId(String applicantId) {
		this.applicantId = applicantId;
	}

	public String getApplicantFname() {
		return applicantFname;
	}

	public void setApplicantFname(String applicantFname) {
		this.applicantFname = applicantFname;
	}

	public String getApplicantLname() {
		return applicantLname;
	}

	public void setApplicantLname(String applicantLname) {
		this.applicantLname = applicantLname;
	}

	public String getApplicantMobileno() {
		return applicantMobileno;
	}

	public void setApplicantMobileno(String applicantMobileno) {
		this.applicantMobileno = applicantMobileno;
	}

	public String getApplicantEmailid() {
		return applicantEmailid;
	}

	public void setApplicantEmailid(String applicantEmailid) {
		this.applicantEmailid = applicantEmailid;
	}

	public String getApplicantDob() {
		return applicantDob;
	}

	public void setApplicantDob(String applicantDob) {
		this.applicantDob = applicantDob;
	}

	public String getApplicantOccupation() {
		return applicantOccupation;
	}

	public void setApplicantOccupation(String applicantOccupation) {
		this.applicantOccupation = applicantOccupation;
	}

	public String getApplicantAadharno() {
		return applicantAadharno;
	}

	public void setApplicantAadharno(String applicantAadharno) {
		this.applicantAadharno = applicantAadharno;
	}

	public String getApplicantPanno() {
		return applicantPanno;
	}

	public void setApplicantPanno(String applicantPanno) {
		this.applicantPanno = applicantPanno;
	}

	public long getApplicantLoanamt() {
		return applicantLoanamt;
	}

	public void setApplicantLoanamt(long applicantLoanamt) {
		this.applicantLoanamt = applicantLoanamt;
	}

	public int getCibilScore() {
		return cibilScore;
	}

	public void setCibilScore(int cibilScore) {
		this.cibilScore = cibilScore;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

//	public Document getDocument() {
//		return document;
//	}
//
//	public void setDocument(Document document) {
//		this.document = document;
//	}

	public BankDetails getBankdetails() {
		return bankdetails;
	}

	public void setBankdetails(BankDetails bankdetails) {
		this.bankdetails = bankdetails;
	}

	public Nominee getNominee() {
		return nominee;
	}

	public void setNominee(Nominee nominee) {
		this.nominee = nominee;
	}

	public Guarantor getGuarantor() {
		return guarantor;
	}

	public void setGuarantor(Guarantor guarantor) {
		this.guarantor = guarantor;
	}

	
	
}
