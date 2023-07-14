package com.soetek.soapws;

import com.soetek.soapws.repository.CountryRepository;
import com.soetek.soapws.repository.TblCountryRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.webservices.server.WebServiceServerTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.ws.test.server.MockWebServiceClient;
import org.springframework.ws.test.server.RequestCreators;
import org.springframework.ws.test.server.ResponseMatchers;
import org.springframework.xml.transform.StringSource;

import static org.springframework.ws.test.server.RequestCreators.withPayload;
import static org.springframework.ws.test.server.RequestCreators.withSoapEnvelope;
import static org.springframework.ws.test.server.ResponseMatchers.noFault;

@WebServiceServerTest
public class CountryEndpointTest {
    @Autowired
    MockWebServiceClient client;
    @MockBean
    private CountryRepository countryRepository;
//    @MockBean
//    TblCountryRepository tblCountryRepository;
    @Test
    void getCountryTest() {
        final var request = new StringSource(
                "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:gs=\"http://spring.io/guides/gs-producing-web-service\">\n" +
                        "   <soapenv:Header/>\n" +
                        "   <soapenv:Body>\n" +
                        "      <gs:getCountryRequest>\n" +
                        "         <gs:name>Poland</gs:name>\n" +
                        "      </gs:getCountryRequest>\n" +
                        "   </soapenv:Body>\n" +
                        "</soapenv:Envelope>");
        client.sendRequest(withSoapEnvelope(request))
                .andExpect(noFault());
    }
}
