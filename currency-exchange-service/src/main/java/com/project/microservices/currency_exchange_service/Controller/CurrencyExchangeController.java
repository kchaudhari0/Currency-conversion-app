package com.project.microservices.currency_exchange_service.Controller;
import com.project.microservices.currency_exchange_service.Beans.CurrencyExchange;
import com.project.microservices.currency_exchange_service.Repository.CurrencyExchangeRespository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyExchangeController {

    Logger logger = LoggerFactory.getLogger(CurrencyExchangeController.class);

    @Autowired
    private CurrencyExchangeRespository exchangeRespository;

    @Autowired
    private Environment environment;

    @GetMapping("currency-exchange/from/{from}/to/{to}")
    public CurrencyExchange retriveExchangeValue(
            @PathVariable String from,
            @PathVariable String to)

    {
        logger.info("retriveExchangeValue API has been called from {} to {}",from,to);

        CurrencyExchange currencyExchange=exchangeRespository.findByFromAndTo(from, to);
        if(currencyExchange==null)
        {
            throw new RuntimeException("Unable to find data in currency exchange");
        }
        String port= environment.getProperty("local.server.port");
        currencyExchange.setEnvironment(port);

        return currencyExchange;
    }
}
