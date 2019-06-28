package com.ryandemo.microservicies.currencyexchangeservice.bean;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExchangeValue {
	
	@Id
	private Long id;
	
	@Column(name="curr_from")
	private String from;
	
	@Column(name="curr_to")
	private String to;
	private BigDecimal rate;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getRate() {
		return rate;
	}
	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}
	public ExchangeValue(Long id, String from, String to, BigDecimal rate) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.rate = rate;
	}
	public ExchangeValue() {
		super();
	}
	@Override
	public String toString() {
		return "ExchangeValue [id=" + id + ", from=" + from + ", to=" + to + ", rate=" + rate + "]";
	}
	
	
}
