package com.calculator;

import com.calculator.client.gen.CalculatorRequest;
import com.calculator.client.gen.CalculatorResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CalculatorEndpoint {

    private static final String NAMESPACE_URI = "http://www.baeldung.com/springsoap/gen";

    private final CalculatorRepository calculatorRepository;

    public CalculatorEndpoint(CalculatorRepository calculatorRepository) {
        this.calculatorRepository = calculatorRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "calculatorRequest")
    @ResponsePayload
    public CalculatorResponse getResult(@RequestPayload CalculatorRequest request) {
        CalculatorResponse response = new CalculatorResponse();
        response.setResult(calculatorRepository.calculate(request.getExpression()));
        return response;
    }
}

