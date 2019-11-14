//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.12 at 10:52:02 AM EST 
//


package com.sap.xi.sapscore.sfin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for JournalEntryCreateRequestJournalEntryTaxDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JournalEntryCreateRequestJournalEntryTaxDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TaxCode" type="{http://sap.com/xi/SAPSCORE/SFIN}ProductTaxationCharacteristicsCode"/>
 *         &lt;element name="TaxJurisdiction" type="{http://sap.com/xi/SAPSCORE/SFIN}TaxJurisdictionCode" minOccurs="0"/>
 *         &lt;element name="TaxItemGroup" type="{http://sap.com/xi/SAPSCORE/SFIN}TaxItemGroupID" minOccurs="0"/>
 *         &lt;element name="TaxExpenseAmountInTransacCrcy" type="{http://sap.com/xi/SAPSCORE/SFIN}Amount" minOccurs="0"/>
 *         &lt;element name="TaxExpenseAmountInCoCodeCrcy" type="{http://sap.com/xi/SAPSCORE/SFIN}Amount" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JournalEntryCreateRequestJournalEntryTaxDetails", propOrder = {
    "taxCode",
    "taxJurisdiction",
    "taxItemGroup",
    "taxExpenseAmountInTransacCrcy",
    "taxExpenseAmountInCoCodeCrcy"
})
public class JournalEntryCreateRequestJournalEntryTaxDetails {

    @XmlElement(name = "TaxCode", required = true)
    protected com.sap.xi.sapscore.sfin.ProductTaxationCharacteristicsCode taxCode;
    @XmlElement(name = "TaxJurisdiction")
    protected com.sap.xi.sapscore.sfin.TaxJurisdictionCode taxJurisdiction;
    @XmlElement(name = "TaxItemGroup")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String taxItemGroup;
    @XmlElement(name = "TaxExpenseAmountInTransacCrcy")
    protected com.sap.xi.sapscore.sfin.Amount taxExpenseAmountInTransacCrcy;
    @XmlElement(name = "TaxExpenseAmountInCoCodeCrcy")
    protected com.sap.xi.sapscore.sfin.Amount taxExpenseAmountInCoCodeCrcy;

    /**
     * Gets the value of the taxCode property.
     * 
     * @return
     *     possible object is
     *     {@link com.sap.xi.sapscore.sfin.ProductTaxationCharacteristicsCode }
     *     
     */
    public com.sap.xi.sapscore.sfin.ProductTaxationCharacteristicsCode getTaxCode() {
        return taxCode;
    }

    /**
     * Sets the value of the taxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sap.xi.sapscore.sfin.ProductTaxationCharacteristicsCode }
     *     
     */
    public void setTaxCode(ProductTaxationCharacteristicsCode value) {
        this.taxCode = value;
    }

    /**
     * Gets the value of the taxJurisdiction property.
     * 
     * @return
     *     possible object is
     *     {@link com.sap.xi.sapscore.sfin.TaxJurisdictionCode }
     *     
     */
    public com.sap.xi.sapscore.sfin.TaxJurisdictionCode getTaxJurisdiction() {
        return taxJurisdiction;
    }

    /**
     * Sets the value of the taxJurisdiction property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sap.xi.sapscore.sfin.TaxJurisdictionCode }
     *     
     */
    public void setTaxJurisdiction(TaxJurisdictionCode value) {
        this.taxJurisdiction = value;
    }

    /**
     * Gets the value of the taxItemGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxItemGroup() {
        return taxItemGroup;
    }

    /**
     * Sets the value of the taxItemGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxItemGroup(String value) {
        this.taxItemGroup = value;
    }

    /**
     * Gets the value of the taxExpenseAmountInTransacCrcy property.
     * 
     * @return
     *     possible object is
     *     {@link com.sap.xi.sapscore.sfin.Amount }
     *     
     */
    public com.sap.xi.sapscore.sfin.Amount getTaxExpenseAmountInTransacCrcy() {
        return taxExpenseAmountInTransacCrcy;
    }

    /**
     * Sets the value of the taxExpenseAmountInTransacCrcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sap.xi.sapscore.sfin.Amount }
     *     
     */
    public void setTaxExpenseAmountInTransacCrcy(com.sap.xi.sapscore.sfin.Amount value) {
        this.taxExpenseAmountInTransacCrcy = value;
    }

    /**
     * Gets the value of the taxExpenseAmountInCoCodeCrcy property.
     * 
     * @return
     *     possible object is
     *     {@link com.sap.xi.sapscore.sfin.Amount }
     *     
     */
    public com.sap.xi.sapscore.sfin.Amount getTaxExpenseAmountInCoCodeCrcy() {
        return taxExpenseAmountInCoCodeCrcy;
    }

    /**
     * Sets the value of the taxExpenseAmountInCoCodeCrcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sap.xi.sapscore.sfin.Amount }
     *     
     */
    public void setTaxExpenseAmountInCoCodeCrcy(Amount value) {
        this.taxExpenseAmountInCoCodeCrcy = value;
    }

}
