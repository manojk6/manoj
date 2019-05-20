package com.in28minutes.springboot.basics.springbootin10steps;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DirectMatchModelData {
	
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
	@JsonProperty("Exchange Name")
	private String exchangeName;
	@JsonProperty("Trades As")
	private String tradeAs;
	@JsonProperty("Ticker Code")
	private String tickerCode;
	@JsonProperty("Industry")
	private String industry;
	@JsonProperty("CUSIP")
	private String cusip;
	@JsonProperty("ISIN")
	private String isin;
	@JsonProperty("Business Registry code")
	private String businessRegCode;
	
	
	
	
	public DirectMatchModelData() {
		super();
	}
	
	
	public DirectMatchModelData(String legalEntityIden, String legalOrgName,
			String country, String legalForm, String regAddress,
			String exchangeName, String tradeAs, String tickerCode,
			String industry, String cusip, String isin, String businessRegCode) {
		super();
		this.legalEntityIden = legalEntityIden;
		this.legalOrgName = legalOrgName;
		this.country = country;
		this.legalForm = legalForm;
		this.regAddress = regAddress;
		this.exchangeName = exchangeName;
		this.tradeAs = tradeAs;
		this.tickerCode = tickerCode;
		this.industry = industry;
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
	public String getExchangeName() {
		return exchangeName;
	}
	public void setExchangeName(String exchangeName) {
		this.exchangeName = exchangeName;
	}
	public String getTradeAs() {
		return tradeAs;
	}
	public void setTradeAs(String tradeAs) {
		this.tradeAs = tradeAs;
	}
	public String getTickerCode() {
		return tickerCode;
	}
	public void setTickerCode(String tickerCode) {
		this.tickerCode = tickerCode;
	}
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
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
		return "DirectMatchModelData [legalEntityIden=" + legalEntityIden
				+ ", legalOrgName=" + legalOrgName + ", country=" + country
				+ ", legalForm=" + legalForm + ", regAddress=" + regAddress
				+ ", exchangeName=" + exchangeName + ", tradeAs=" + tradeAs
				+ ", tickerCode=" + tickerCode + ", industry=" + industry
				+ ", cusip=" + cusip + ", isin=" + isin + ", businessRegCode="
				+ businessRegCode + "]";
	}
	
	
	
	

}
