//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.03 at 06:38:41 PM GMT+05:30 
//


package com.ultracash.upi.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;


/**
 * <p>Java class for ratingType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="ratingType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="verifiedAddress" type="{http://npci.org/upi/schema/}whiteListedConstant" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ratingType", propOrder = {
        "value"
})
public class RatingType {

    @XmlValue
    protected String value;
    @XmlAttribute
    protected WhiteListedConstant verifiedAddress;

    /**
     * Gets the value of the value property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the verifiedAddress property.
     *
     * @return possible object is
     * {@link WhiteListedConstant }
     */
    public WhiteListedConstant getVerifiedAddress() {
        return verifiedAddress;
    }

    /**
     * Sets the value of the verifiedAddress property.
     *
     * @param value allowed object is
     *              {@link WhiteListedConstant }
     */
    public void setVerifiedAddress(WhiteListedConstant value) {
        this.verifiedAddress = value;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.reflectionToString(this);
    }
}
