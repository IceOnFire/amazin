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
 * <p>Java class for SerialNumberFormatType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SerialNumberFormatType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="a_or_z_alphanumeric_13"/>
 *     &lt;enumeration value="alphanumeric_8"/>
 *     &lt;enumeration value="numeric_14"/>
 *     &lt;enumeration value="alphanumeric_14"/>
 *     &lt;enumeration value="numeric_12"/>
 *     &lt;enumeration value="w_alphanumeric_12"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SerialNumberFormatType")
@XmlEnum
public enum SerialNumberFormatType {

    @XmlEnumValue("a_or_z_alphanumeric_13")
    A_OR_Z_ALPHANUMERIC_13("a_or_z_alphanumeric_13"),
    @XmlEnumValue("alphanumeric_8")
    ALPHANUMERIC_8("alphanumeric_8"),
    @XmlEnumValue("numeric_14")
    NUMERIC_14("numeric_14"),
    @XmlEnumValue("alphanumeric_14")
    ALPHANUMERIC_14("alphanumeric_14"),
    @XmlEnumValue("numeric_12")
    NUMERIC_12("numeric_12"),
    @XmlEnumValue("w_alphanumeric_12")
    W_ALPHANUMERIC_12("w_alphanumeric_12");
    private final String value;

    SerialNumberFormatType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SerialNumberFormatType fromValue(String v) {
        for (SerialNumberFormatType c: SerialNumberFormatType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
