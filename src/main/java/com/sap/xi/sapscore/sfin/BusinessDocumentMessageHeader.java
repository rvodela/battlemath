//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.12 at 10:52:02 AM EST 
//


package com.sap.xi.sapscore.sfin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BusinessDocumentMessageHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessDocumentMessageHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://sap.com/xi/SAPSCORE/SFIN}BusinessDocumentMessageID" minOccurs="0"/>
 *         &lt;element name="UUID" type="{http://sap.com/xi/SAPSCORE/SFIN}UUID" minOccurs="0"/>
 *         &lt;element name="ReferenceID" type="{http://sap.com/xi/SAPSCORE/SFIN}BusinessDocumentMessageID" minOccurs="0"/>
 *         &lt;element name="ReferenceUUID" type="{http://sap.com/xi/SAPSCORE/SFIN}UUID" minOccurs="0"/>
 *         &lt;element name="CreationDateTime" type="{http://sap.com/xi/SAPSCORE/SFIN}GLOBAL_DateTime"/>
 *         &lt;element name="TestDataIndicator" type="{http://sap.com/xi/SAPSCORE/SFIN}Indicator" minOccurs="0"/>
 *         &lt;element name="ReconciliationIndicator" type="{http://sap.com/xi/SAPSCORE/SFIN}Indicator" minOccurs="0"/>
 *         &lt;element name="SenderBusinessSystemID" type="{http://sap.com/xi/SAPSCORE/SFIN}BusinessSystemID" minOccurs="0"/>
 *         &lt;element name="RecipientBusinessSystemID" type="{http://sap.com/xi/SAPSCORE/SFIN}BusinessSystemID" minOccurs="0"/>
 *         &lt;element name="SenderParty" type="{http://sap.com/xi/SAPSCORE/SFIN}BusinessDocumentMessageHeaderParty" minOccurs="0"/>
 *         &lt;element name="RecipientParty" type="{http://sap.com/xi/SAPSCORE/SFIN}BusinessDocumentMessageHeaderParty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BusinessScope" type="{http://sap.com/xi/SAPSCORE/SFIN}BusinessScope" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessDocumentMessageHeader", propOrder = {
    "id",
    "uuid",
    "referenceID",
    "referenceUUID",
    "creationDateTime",
    "testDataIndicator",
    "reconciliationIndicator",
    "senderBusinessSystemID",
    "recipientBusinessSystemID",
    "senderParty",
    "recipientParty",
    "businessScope"
})
public class BusinessDocumentMessageHeader {

    @XmlElement(name = "ID")
    protected com.sap.xi.sapscore.sfin.BusinessDocumentMessageID id;
    @XmlElement(name = "UUID")
    protected com.sap.xi.sapscore.sfin.UUID uuid;
    @XmlElement(name = "ReferenceID")
    protected com.sap.xi.sapscore.sfin.BusinessDocumentMessageID referenceID;
    @XmlElement(name = "ReferenceUUID")
    protected com.sap.xi.sapscore.sfin.UUID referenceUUID;
    @XmlElement(name = "CreationDateTime", required = true)
    protected XMLGregorianCalendar creationDateTime;
    @XmlElement(name = "TestDataIndicator")
    protected Boolean testDataIndicator;
    @XmlElement(name = "ReconciliationIndicator")
    protected Boolean reconciliationIndicator;
    @XmlElement(name = "SenderBusinessSystemID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String senderBusinessSystemID;
    @XmlElement(name = "RecipientBusinessSystemID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String recipientBusinessSystemID;
    @XmlElement(name = "SenderParty")
    protected BusinessDocumentMessageHeaderParty senderParty;
    @XmlElement(name = "RecipientParty")
    protected List<BusinessDocumentMessageHeaderParty> recipientParty;
    @XmlElement(name = "BusinessScope")
    protected List<com.sap.xi.sapscore.sfin.BusinessScope> businessScope;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link com.sap.xi.sapscore.sfin.BusinessDocumentMessageID }
     *     
     */
    public com.sap.xi.sapscore.sfin.BusinessDocumentMessageID getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sap.xi.sapscore.sfin.BusinessDocumentMessageID }
     *     
     */
    public void setID(com.sap.xi.sapscore.sfin.BusinessDocumentMessageID value) {
        this.id = value;
    }

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link com.sap.xi.sapscore.sfin.UUID }
     *     
     */
    public com.sap.xi.sapscore.sfin.UUID getUUID() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sap.xi.sapscore.sfin.UUID }
     *     
     */
    public void setUUID(com.sap.xi.sapscore.sfin.UUID value) {
        this.uuid = value;
    }

    /**
     * Gets the value of the referenceID property.
     * 
     * @return
     *     possible object is
     *     {@link com.sap.xi.sapscore.sfin.BusinessDocumentMessageID }
     *     
     */
    public com.sap.xi.sapscore.sfin.BusinessDocumentMessageID getReferenceID() {
        return referenceID;
    }

    /**
     * Sets the value of the referenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sap.xi.sapscore.sfin.BusinessDocumentMessageID }
     *     
     */
    public void setReferenceID(BusinessDocumentMessageID value) {
        this.referenceID = value;
    }

    /**
     * Gets the value of the referenceUUID property.
     * 
     * @return
     *     possible object is
     *     {@link com.sap.xi.sapscore.sfin.UUID }
     *     
     */
    public com.sap.xi.sapscore.sfin.UUID getReferenceUUID() {
        return referenceUUID;
    }

    /**
     * Sets the value of the referenceUUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sap.xi.sapscore.sfin.UUID }
     *     
     */
    public void setReferenceUUID(UUID value) {
        this.referenceUUID = value;
    }

    /**
     * Gets the value of the creationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * Sets the value of the creationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDateTime(XMLGregorianCalendar value) {
        this.creationDateTime = value;
    }

    /**
     * Gets the value of the testDataIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTestDataIndicator() {
        return testDataIndicator;
    }

    /**
     * Sets the value of the testDataIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTestDataIndicator(Boolean value) {
        this.testDataIndicator = value;
    }

    /**
     * Gets the value of the reconciliationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReconciliationIndicator() {
        return reconciliationIndicator;
    }

    /**
     * Sets the value of the reconciliationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReconciliationIndicator(Boolean value) {
        this.reconciliationIndicator = value;
    }

    /**
     * Gets the value of the senderBusinessSystemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderBusinessSystemID() {
        return senderBusinessSystemID;
    }

    /**
     * Sets the value of the senderBusinessSystemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderBusinessSystemID(String value) {
        this.senderBusinessSystemID = value;
    }

    /**
     * Gets the value of the recipientBusinessSystemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientBusinessSystemID() {
        return recipientBusinessSystemID;
    }

    /**
     * Sets the value of the recipientBusinessSystemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientBusinessSystemID(String value) {
        this.recipientBusinessSystemID = value;
    }

    /**
     * Gets the value of the senderParty property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentMessageHeaderParty }
     *     
     */
    public BusinessDocumentMessageHeaderParty getSenderParty() {
        return senderParty;
    }

    /**
     * Sets the value of the senderParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentMessageHeaderParty }
     *     
     */
    public void setSenderParty(BusinessDocumentMessageHeaderParty value) {
        this.senderParty = value;
    }

    /**
     * Gets the value of the recipientParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recipientParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecipientParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessDocumentMessageHeaderParty }
     * 
     * 
     */
    public List<BusinessDocumentMessageHeaderParty> getRecipientParty() {
        if (recipientParty == null) {
            recipientParty = new ArrayList<BusinessDocumentMessageHeaderParty>();
        }
        return this.recipientParty;
    }

    /**
     * Gets the value of the businessScope property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessScope property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessScope().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link com.sap.xi.sapscore.sfin.BusinessScope }
     * 
     * 
     */
    public List<com.sap.xi.sapscore.sfin.BusinessScope> getBusinessScope() {
        if (businessScope == null) {
            businessScope = new ArrayList<BusinessScope>();
        }
        return this.businessScope;
    }

}
