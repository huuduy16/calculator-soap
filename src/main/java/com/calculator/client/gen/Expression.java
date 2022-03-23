package com.calculator.client.gen;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "expression", propOrder = {
    "num0",
    "num1",
    "operation"
})
public class Expression {

    private Double num0;
    private Double num1;
    @XmlElement(required = true)
    private String operation;
}