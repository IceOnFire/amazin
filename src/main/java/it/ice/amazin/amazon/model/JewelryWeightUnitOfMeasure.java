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
 * <p>Java class for JewelryWeightUnitOfMeasure.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="JewelryWeightUnitOfMeasure">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GR"/>
 *     &lt;enumeration value="KG"/>
 *     &lt;enumeration value="OZ"/>
 *     &lt;enumeration value="LB"/>
 *     &lt;enumeration value="CARATS"/>
 *     &lt;enumeration value="DWT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "JewelryWeightUnitOfMeasure")
@XmlEnum
public enum JewelryWeightUnitOfMeasure {

    GR,
    KG,
    OZ,
    LB,
    CARATS,
    DWT;

    public String value() {
        return name();
    }

    public static JewelryWeightUnitOfMeasure fromValue(String v) {
        return valueOf(v);
    }

}
