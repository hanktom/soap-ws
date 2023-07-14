package com.soetek.soapws;

import com.soetek.soapws.model.TblCountry;
import com.soetek.soapws.repository.CountryRepository;
import com.soetek.soapws.repository.TblCountryRepository;
import io.spring.guides.gs_producing_web_service.Country;
import io.spring.guides.gs_producing_web_service.Currency;
import io.spring.guides.gs_producing_web_service.GetCountryRequest;
import io.spring.guides.gs_producing_web_service.GetCountryResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.List;

@Endpoint
public class CountryEndpoint {
    private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";
    public static final Logger log = LoggerFactory.getLogger(CountryEndpoint.class);
    private CountryRepository countryRepository;
    private TblCountryRepository tblCountryRepository;

    @Autowired
    public CountryEndpoint(TblCountryRepository countryRepository) {
//        this.countryRepository = countryRepository;
        this.tblCountryRepository = countryRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryRequest")
    @ResponsePayload
    public GetCountryResponse getCountry(@RequestPayload GetCountryRequest request) {
        GetCountryResponse response = new GetCountryResponse();
//        response.setCountry(countryRepository.findCountry(request.getName()));
        List<Object[]> list = tblCountryRepository.nativeQuery("en");
        log.info(list.size()+"");
        for (Object[] c : list) {
            log.info(c[0] + "," + c[1]);
        }

        TblCountry tblCountry = tblCountryRepository.findByCountryName(request.getName());
        log.info(tblCountry.getCountryName());
        Country country = new Country();
        country.setName(tblCountry.getCountryName());
        country.setCapital(tblCountry.getCapital());
        country.setCurrency(Currency.EUR);
        country.setPopulation(100);
        response.setCountry(country);
        return response;
    }
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAllCountryRequest")
    @ResponsePayload
    public GetCountryResponse getAllCountries(@RequestPayload GetCountryRequest request) {
        GetCountryResponse response = new GetCountryResponse();

        return response;
    }

}
