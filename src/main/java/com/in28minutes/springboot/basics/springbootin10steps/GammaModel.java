package com.in28minutes.springboot.basics.springbootin10steps;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GammaModel {
	
	@JsonProperty("Legal Entity Identifier")
	private String legalEntityIden;
	
	@JsonProperty("CUSIP")
	private String cusip;
	@JsonProperty("ISIN")
	private String isin;
	@JsonProperty("Business Registry code")
	private String businessRegCode;
	public GammaModel() {
		super();
	}
	public GammaModel(String legalEntityIden, String cusip, String isin,
			String businessRegCode) {
		super();
		this.legalEntityIden = legalEntityIden;
		this.cusip = cusip;
		this.isin = isin;
		this.businessRegCode = businessRegCode;
	}
	public String getLegalEntityIden() {
		return legalEntityIden;
	}
	public void setLegalEntityIden(String legalEntityIden) {
		this.legalEntityIden = legalEntityIden;
	}
	public String getCusip() {
		return cusip;
	}
	public void setCusip(String cusip) {
		this.cusip = cusip;
	}
	public String getIsin() {
		return isin;
	}
	public void setIsin(String isin) {
		this.isin = isin;
	}
	public String getBusinessRegCode() {
		return businessRegCode;
	}
	public void setBusinessRegCode(String businessRegCode) {
		this.businessRegCode = businessRegCode;
	}
	@Override
	public String toString() {
		return "GammaModel [legalEntityIden=" + legalEntityIden + ", cusip="
				+ cusip + ", isin=" + isin + ", businessRegCode="
				+ businessRegCode + "]";
	}

	

}
