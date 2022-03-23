package com.calculator.client.gen;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {

    public ObjectFactory() {
    }

    public CalculatorResponse createCalculatorResponse() {
        return new CalculatorResponse();
    }

    public CalculatorRequest createCalculatorRequest() {
        return new CalculatorRequest();
    }

    public Expression createExpression() {
        return new Expression();
    }

}
