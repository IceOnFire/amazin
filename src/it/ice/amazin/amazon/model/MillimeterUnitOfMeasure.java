//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.27 at 11:06:36 AM CEST 
//


package it.ice.amazin.amazon.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MillimeterUnitOfMeasure.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MillimeterUnitOfMeasure">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="millimeters"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MillimeterUnitOfMeasure")
@XmlEnum
public enum MillimeterUnitOfMeasure {

    @XmlEnumValue("millimeters")
    MILLIMETERS("millimeters");
    private final String value;

    MillimeterUnitOfMeasure(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MillimeterUnitOfMeasure fromValue(String v) {
        for (MillimeterUnitOfMeasure c: MillimeterUnitOfMeasure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
