//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.08 at 02:43:12 PM CET 
//


package com.alliander.jaxb2.monitoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AsyncResponse" type="{http://www.alliander.com/schemas/osgp/common/2014/10}AsyncResponse"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "asyncResponse"
})
@XmlRootElement(name = "ReadAlarmRegisterAsyncResponse")
public class ReadAlarmRegisterAsyncResponse {

    @XmlElement(name = "AsyncResponse", required = true)
    protected AsyncResponse asyncResponse;

    /**
     * Gets the value of the asyncResponse property.
     * 
     * @return
     *     possible object is
     *     {@link AsyncResponse }
     *     
     */
    public AsyncResponse getAsyncResponse() {
        return asyncResponse;
    }

    /**
     * Sets the value of the asyncResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link AsyncResponse }
     *     
     */
    public void setAsyncResponse(AsyncResponse value) {
        this.asyncResponse = value;
    }

}
