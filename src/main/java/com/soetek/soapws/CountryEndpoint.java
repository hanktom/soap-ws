package com.soetek.soapws;

import com.soetek.soapws.model.TblCountry;
import com.soetek.soapws.repository.CountryRepository;
import com.soetek.soapws.repository.TblCountryRepository;
import io.spring.guides.gs_producing_web_service.GetCountryRequest;
import io.spring.guides.gs_producing_web_service.GetCountryResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CountryEndpoint {
    private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";
    public static final Logger log = LoggerFactory.getLogger(CountryEndpoint.class);
    private CountryRepository countryRepository;
    private TblCountryRepository tblCountryRepository;

    @Autowired
    public CountryEndpoint(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
//        this.tblCountryRepository = countryRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryRequest")
    @ResponsePayload
    public GetCountryResponse getCountry(@RequestPayload GetCountryRequest request) {
        GetCountryResponse response = new GetCountryResponse();
//        response.setCountry(countryRepository.findCountry(request.getName()));
//        TblCountry tblCountry = tblCountryRepository.findByCountryName(request.getName());
//        log.info(tblCountry.getCountryName());
//        Country country = new Country();
//        country.name = tblCountry.getCountryName();
//        country.capital = tblCountry.getCapital();
//        country.currency = Currency.EUR;
//        country.population = 100;
        response.setCountry(countryRepository.findCountry(request.getName()));
        return response;
    }

}
