package com.ryandemo.microservicies.currencyexchangeservice.Controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ryandemo.microservicies.currencyexchangeservice.bean.ExchangeValue;
import com.ryandemo.microservicies.currencyexchangeservice.repository.ExchangeValueRepository;

@RestController
public class CurrencyExchangeController {

	
	@Autowired
	private ExchangeValueRepository repository;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retrieveExchangeValue(@PathVariable String from,@PathVariable String to)
	{
		ExchangeValue exchange= repository.findByFromAndTo(from, to);
		return exchange;
	}
}
