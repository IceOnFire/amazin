//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.27 at 11:06:36 AM CEST 
//


package it.ice.amazin.amazon.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NeckSizeUnitOfMeasure.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NeckSizeUnitOfMeasure">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CM"/>
 *     &lt;enumeration value="IN"/>
 *     &lt;enumeration value="MM"/>
 *     &lt;enumeration value="M"/>
 *     &lt;enumeration value="FT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NeckSizeUnitOfMeasure")
@XmlEnum
public enum NeckSizeUnitOfMeasure {

    CM,
    IN,
    MM,
    M,
    FT;

    public String value() {
        return name();
    }

    public static NeckSizeUnitOfMeasure fromValue(String v) {
        return valueOf(v);
    }

}
