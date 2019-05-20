package com.in28minutes.springboot.basics.springbootin10steps;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AlphaModel {

	@JsonProperty("Legal Entity Identifier")
	private String legalEntityIden;
	@JsonProperty("Legal Org Name")
	private String legalOrgName;
	@JsonProperty("Country")
	private String country;
	@JsonProperty("Legal Form")
	private String legalForm;
	@JsonProperty("Registered Address")
	private String regAddress;
	public AlphaModel() {
		super();
	}
	public AlphaModel(String legalEntityIden, String legalOrgName,
			String country, String legalForm, String regAddress) {
		super();
		this.legalEntityIden = legalEntityIden;
		this.legalOrgName = legalOrgName;
		this.country = country;
		this.legalForm = legalForm;
		this.regAddress = regAddress;
	}
	public String getLegalEntityIden() {
		return legalEntityIden;
	}
	public void setLegalEntityIden(String legalEntityIden) {
		this.legalEntityIden = legalEntityIden;
	}
	public String getLegalOrgName() {
		return legalOrgName;
	}
	public void setLegalOrgName(String legalOrgName) {
		this.legalOrgName = legalOrgName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getLegalForm() {
		return legalForm;
	}
	public void setLegalForm(String legalForm) {
		this.legalForm = legalForm;
	}
	public String getRegAddress() {
		return regAddress;
	}
	public void setRegAddress(String regAddress) {
		this.regAddress = regAddress;
	}
	@Override
	public String toString() {
		return "AlphaModel [legalEntityIden=" + legalEntityIden
				+ ", legalOrgName=" + legalOrgName + ", country=" + country
				+ ", legalForm=" + legalForm + ", regAddress=" + regAddress
				+ "]";
	}
	
	
}
