//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.27 at 11:06:36 AM CEST 
//


package it.ice.amazin.amazon.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for AddressTypeSupportNonCity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressTypeSupportNonCity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{}String"/>
 *         &lt;element name="AddressFieldOne" type="{}AddressLine"/>
 *         &lt;element name="AddressFieldTwo" type="{}AddressLine" minOccurs="0"/>
 *         &lt;element name="AddressFieldThree" type="{}AddressLine" minOccurs="0"/>
 *         &lt;element name="City" type="{}String" minOccurs="0"/>
 *         &lt;element name="DistrictOrCounty" type="{}String" minOccurs="0"/>
 *         &lt;element name="County" type="{}String" minOccurs="0"/>
 *         &lt;element name="StateOrRegion" type="{}String" minOccurs="0"/>
 *         &lt;element name="PostalCode" type="{}String" minOccurs="0"/>
 *         &lt;element name="CountryCode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="2"/>
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PhoneNumber" type="{}String" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressTypeSupportNonCity", propOrder = {
    "name",
    "addressFieldOne",
    "addressFieldTwo",
    "addressFieldThree",
    "city",
    "districtOrCounty",
    "county",
    "stateOrRegion",
    "postalCode",
    "countryCode",
    "phoneNumber"
})
public class AddressTypeSupportNonCity {

    @XmlElement(name = "Name", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String name;
    @XmlElement(name = "AddressFieldOne", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String addressFieldOne;
    @XmlElement(name = "AddressFieldTwo")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String addressFieldTwo;
    @XmlElement(name = "AddressFieldThree")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String addressFieldThree;
    @XmlElement(name = "City")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String city;
    @XmlElement(name = "DistrictOrCounty")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String districtOrCounty;
    @XmlElement(name = "County")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String county;
    @XmlElement(name = "StateOrRegion")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String stateOrRegion;
    @XmlElement(name = "PostalCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String postalCode;
    @XmlElement(name = "CountryCode", required = true)
    protected String countryCode;
    @XmlElement(name = "PhoneNumber")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String phoneNumber;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the addressFieldOne property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressFieldOne() {
        return addressFieldOne;
    }

    /**
     * Sets the value of the addressFieldOne property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressFieldOne(String value) {
        this.addressFieldOne = value;
    }

    /**
     * Gets the value of the addressFieldTwo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressFieldTwo() {
        return addressFieldTwo;
    }

    /**
     * Sets the value of the addressFieldTwo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressFieldTwo(String value) {
        this.addressFieldTwo = value;
    }

    /**
     * Gets the value of the addressFieldThree property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressFieldThree() {
        return addressFieldThree;
    }

    /**
     * Sets the value of the addressFieldThree property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressFieldThree(String value) {
        this.addressFieldThree = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the districtOrCounty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrictOrCounty() {
        return districtOrCounty;
    }

    /**
     * Sets the value of the districtOrCounty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrictOrCounty(String value) {
        this.districtOrCounty = value;
    }

    /**
     * Gets the value of the county property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounty() {
        return county;
    }

    /**
     * Sets the value of the county property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounty(String value) {
        this.county = value;
    }

    /**
     * Gets the value of the stateOrRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateOrRegion() {
        return stateOrRegion;
    }

    /**
     * Sets the value of the stateOrRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateOrRegion(String value) {
        this.stateOrRegion = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

}
