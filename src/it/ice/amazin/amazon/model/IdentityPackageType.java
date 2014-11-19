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
 * <p>Java class for IdentityPackageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IdentityPackageType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="bulk"/>
 *     &lt;enumeration value="frustration_free"/>
 *     &lt;enumeration value="traditional"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IdentityPackageType")
@XmlEnum
public enum IdentityPackageType {

    @XmlEnumValue("bulk")
    BULK("bulk"),
    @XmlEnumValue("frustration_free")
    FRUSTRATION_FREE("frustration_free"),
    @XmlEnumValue("traditional")
    TRADITIONAL("traditional");
    private final String value;

    IdentityPackageType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IdentityPackageType fromValue(String v) {
        for (IdentityPackageType c: IdentityPackageType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
