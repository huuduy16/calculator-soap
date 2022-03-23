package com.calculator.client;

import com.calculator.client.gen.CalculatorRequest;
import com.calculator.client.gen.CalculatorResponse;
import com.calculator.client.gen.Expression;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class CalculatorClient extends WebServiceGatewaySupport {

    private static final Logger logger = LoggerFactory.getLogger(CalculatorClient.class);

    public CalculatorResponse getResult(Expression value) {
        CalculatorRequest request = new CalculatorRequest();
        request.setExpression(value);

        logger.info("Requesting information for " + value.toString());

        return (CalculatorResponse) getWebServiceTemplate().marshalSendAndReceive(request);
    }
}
