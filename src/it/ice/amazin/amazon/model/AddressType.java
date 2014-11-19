//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.27 at 11:06:36 AM CEST 
//


package it.ice.amazin.amazon.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for AddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{}String"/>
 *         &lt;element name="FormalTitle" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="GivenName" type="{}String" minOccurs="0"/>
 *         &lt;element name="FamilyName" type="{}String" minOccurs="0"/>
 *         &lt;element name="AddressFieldOne" type="{}AddressLine"/>
 *         &lt;element name="AddressFieldTwo" type="{}AddressLine" minOccurs="0"/>
 *         &lt;element name="AddressFieldThree" type="{}AddressLine" minOccurs="0"/>
 *         &lt;element name="City" type="{}String" minOccurs="0"/>
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
 *         &lt;element name="PhoneNumber" type="{}PhoneNumberType" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="isDefaultShipping" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isDefaultBilling" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isDefaultOneClick" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressType", propOrder = {
    "name",
    "formalTitle",
    "givenName",
    "familyName",
    "addressFieldOne",
    "addressFieldTwo",
    "addressFieldThree",
    "city",
    "county",
    "stateOrRegion",
    "postalCode",
    "countryCode",
    "phoneNumber",
    "isDefaultShipping",
    "isDefaultBilling",
    "isDefaultOneClick"
})
public class AddressType {

    @XmlElement(name = "Name", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String name;
    @XmlElement(name = "FormalTitle")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String formalTitle;
    @XmlElement(name = "GivenName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String givenName;
    @XmlElement(name = "FamilyName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String familyName;
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
    protected List<PhoneNumberType> phoneNumber;
    protected Boolean isDefaultShipping;
    protected Boolean isDefaultBilling;
    protected Boolean isDefaultOneClick;

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
     * Gets the value of the formalTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormalTitle() {
        return formalTitle;
    }

    /**
     * Sets the value of the formalTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormalTitle(String value) {
        this.formalTitle = value;
    }

    /**
     * Gets the value of the givenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGivenName() {
        return givenName;
    }

    /**
     * Sets the value of the givenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGivenName(String value) {
        this.givenName = value;
    }

    /**
     * Gets the value of the familyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilyName() {
        return familyName;
    }

    /**
     * Sets the value of the familyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilyName(String value) {
        this.familyName = value;
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phoneNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhoneNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhoneNumberType }
     * 
     * 
     */
    public List<PhoneNumberType> getPhoneNumber() {
        if (phoneNumber == null) {
            phoneNumber = new ArrayList<PhoneNumberType>();
        }
        return this.phoneNumber;
    }

    /**
     * Gets the value of the isDefaultShipping property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDefaultShipping() {
        return isDefaultShipping;
    }

    /**
     * Sets the value of the isDefaultShipping property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDefaultShipping(Boolean value) {
        this.isDefaultShipping = value;
    }

    /**
     * Gets the value of the isDefaultBilling property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDefaultBilling() {
        return isDefaultBilling;
    }

    /**
     * Sets the value of the isDefaultBilling property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDefaultBilling(Boolean value) {
        this.isDefaultBilling = value;
    }

    /**
     * Gets the value of the isDefaultOneClick property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDefaultOneClick() {
        return isDefaultOneClick;
    }

    /**
     * Sets the value of the isDefaultOneClick property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDefaultOneClick(Boolean value) {
        this.isDefaultOneClick = value;
    }

}
