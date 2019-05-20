package com.in28minutes.springboot.basics.springbootin10steps;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BetaModel {
	
	@JsonProperty("Legal Entity Identifier")
	private String legalEntityIden;

	@JsonProperty("Exchange Name")
	private String exchangeName;
	@JsonProperty("Trades As")
	private String tradeAs;
	@JsonProperty("Ticker Code")
	private String tickerCode;
	@JsonProperty("Industry")
	private String industry;
	public BetaModel() {
		super();
	}
	public BetaModel(String legalEntityIden, String exchangeName,
			String tradeAs, String tickerCode, String industry) {
		super();
		this.legalEntityIden = legalEntityIden;
		this.exchangeName = exchangeName;
		this.tradeAs = tradeAs;
		this.tickerCode = tickerCode;
		this.industry = industry;
	}
	public String getLegalEntityIden() {
		return legalEntityIden;
	}
	public void setLegalEntityIden(String legalEntityIden) {
		this.legalEntityIden = legalEntityIden;
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
	@Override
	public String toString() {
		return "BetaModel [legalEntityIden=" + legalEntityIden
				+ ", exchangeName=" + exchangeName + ", tradeAs=" + tradeAs
				+ ", tickerCode=" + tickerCode + ", industry=" + industry + "]";
	}
	
	
	
	

}
