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
 * <p>Java class for JournalEntryCreateRequestJournalEntryWithholdingTaxItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JournalEntryCreateRequestJournalEntryWithholdingTaxItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReferenceDocumentItem" type="{http://sap.com/xi/SAPSCORE/SFIN}BusinessTransactionDocumentItemID" minOccurs="0"/>
 *         &lt;element name="WithholdingTaxType" type="{http://sap.com/xi/SAPSCORE/SFIN}WithholdingTaxType"/>
 *         &lt;element name="WithholdingTaxCode" type="{http://sap.com/xi/SAPSCORE/SFIN}WithholdingTaxCode"/>
 *         &lt;element name="AmountInTransactionCurrency" type="{http://sap.com/xi/SAPSCORE/SFIN}Amount" minOccurs="0"/>
 *         &lt;element name="AmountInCompanyCodeCurrency" type="{http://sap.com/xi/SAPSCORE/SFIN}Amount" minOccurs="0"/>
 *         &lt;element name="TaxBaseAmountInTransCrcy" type="{http://sap.com/xi/SAPSCORE/SFIN}Amount"/>
 *         &lt;element name="TaxBaseAmountInCoCodeCrcy" type="{http://sap.com/xi/SAPSCORE/SFIN}Amount" minOccurs="0"/>
 *         &lt;element name="TaxIsToBeCalculated" type="{http://sap.com/xi/SAPSCORE/SFIN}Indicator" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JournalEntryCreateRequestJournalEntryWithholdingTaxItem", propOrder = {
    "referenceDocumentItem",
    "withholdingTaxType",
    "withholdingTaxCode",
    "amountInTransactionCurrency",
    "amountInCompanyCodeCurrency",
    "taxBaseAmountInTransCrcy",
    "taxBaseAmountInCoCodeCrcy",
    "taxIsToBeCalculated"
})
public class JournalEntryCreateRequestJournalEntryWithholdingTaxItem {

    @XmlElement(name = "ReferenceDocumentItem")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String referenceDocumentItem;
    @XmlElement(name = "WithholdingTaxType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String withholdingTaxType;
    @XmlElement(name = "WithholdingTaxCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String withholdingTaxCode;
    @XmlElement(name = "AmountInTransactionCurrency")
    protected com.sap.xi.sapscore.sfin.Amount amountInTransactionCurrency;
    @XmlElement(name = "AmountInCompanyCodeCurrency")
    protected com.sap.xi.sapscore.sfin.Amount amountInCompanyCodeCurrency;
    @XmlElement(name = "TaxBaseAmountInTransCrcy", required = true)
    protected com.sap.xi.sapscore.sfin.Amount taxBaseAmountInTransCrcy;
    @XmlElement(name = "TaxBaseAmountInCoCodeCrcy")
    protected com.sap.xi.sapscore.sfin.Amount taxBaseAmountInCoCodeCrcy;
    @XmlElement(name = "TaxIsToBeCalculated")
    protected Boolean taxIsToBeCalculated;

    /**
     * Gets the value of the referenceDocumentItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceDocumentItem() {
        return referenceDocumentItem;
    }

    /**
     * Sets the value of the referenceDocumentItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceDocumentItem(String value) {
        this.referenceDocumentItem = value;
    }

    /**
     * Gets the value of the withholdingTaxType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWithholdingTaxType() {
        return withholdingTaxType;
    }

    /**
     * Sets the value of the withholdingTaxType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWithholdingTaxType(String value) {
        this.withholdingTaxType = value;
    }

    /**
     * Gets the value of the withholdingTaxCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWithholdingTaxCode() {
        return withholdingTaxCode;
    }

    /**
     * Sets the value of the withholdingTaxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWithholdingTaxCode(String value) {
        this.withholdingTaxCode = value;
    }

    /**
     * Gets the value of the amountInTransactionCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link com.sap.xi.sapscore.sfin.Amount }
     *     
     */
    public com.sap.xi.sapscore.sfin.Amount getAmountInTransactionCurrency() {
        return amountInTransactionCurrency;
    }

    /**
     * Sets the value of the amountInTransactionCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sap.xi.sapscore.sfin.Amount }
     *     
     */
    public void setAmountInTransactionCurrency(com.sap.xi.sapscore.sfin.Amount value) {
        this.amountInTransactionCurrency = value;
    }

    /**
     * Gets the value of the amountInCompanyCodeCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link com.sap.xi.sapscore.sfin.Amount }
     *     
     */
    public com.sap.xi.sapscore.sfin.Amount getAmountInCompanyCodeCurrency() {
        return amountInCompanyCodeCurrency;
    }

    /**
     * Sets the value of the amountInCompanyCodeCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sap.xi.sapscore.sfin.Amount }
     *     
     */
    public void setAmountInCompanyCodeCurrency(com.sap.xi.sapscore.sfin.Amount value) {
        this.amountInCompanyCodeCurrency = value;
    }

    /**
     * Gets the value of the taxBaseAmountInTransCrcy property.
     * 
     * @return
     *     possible object is
     *     {@link com.sap.xi.sapscore.sfin.Amount }
     *     
     */
    public com.sap.xi.sapscore.sfin.Amount getTaxBaseAmountInTransCrcy() {
        return taxBaseAmountInTransCrcy;
    }

    /**
     * Sets the value of the taxBaseAmountInTransCrcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sap.xi.sapscore.sfin.Amount }
     *     
     */
    public void setTaxBaseAmountInTransCrcy(com.sap.xi.sapscore.sfin.Amount value) {
        this.taxBaseAmountInTransCrcy = value;
    }

    /**
     * Gets the value of the taxBaseAmountInCoCodeCrcy property.
     * 
     * @return
     *     possible object is
     *     {@link com.sap.xi.sapscore.sfin.Amount }
     *     
     */
    public com.sap.xi.sapscore.sfin.Amount getTaxBaseAmountInCoCodeCrcy() {
        return taxBaseAmountInCoCodeCrcy;
    }

    /**
     * Sets the value of the taxBaseAmountInCoCodeCrcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sap.xi.sapscore.sfin.Amount }
     *     
     */
    public void setTaxBaseAmountInCoCodeCrcy(Amount value) {
        this.taxBaseAmountInCoCodeCrcy = value;
    }

    /**
     * Gets the value of the taxIsToBeCalculated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxIsToBeCalculated() {
        return taxIsToBeCalculated;
    }

    /**
     * Sets the value of the taxIsToBeCalculated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxIsToBeCalculated(Boolean value) {
        this.taxIsToBeCalculated = value;
    }

}
