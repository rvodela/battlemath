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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for JournalEntryCreateRequestJournalEntryItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JournalEntryCreateRequestJournalEntryItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReferenceDocumentItem" type="{http://sap.com/xi/SAPSCORE/SFIN}BusinessTransactionDocumentItemID" minOccurs="0"/>
 *         &lt;element name="ItemGroup" type="{http://sap.com/xi/SAPSCORE/SFIN}ItemGroup" minOccurs="0"/>
 *         &lt;element name="CompanyCode" type="{http://sap.com/xi/SAPSCORE/SFIN}CompanyCodeID" minOccurs="0"/>
 *         &lt;element name="GLAccount" type="{http://sap.com/xi/SAPSCORE/SFIN}ChartOfAccountsItemCode"/>
 *         &lt;element name="AmountInTransactionCurrency" type="{http://sap.com/xi/SAPSCORE/SFIN}Amount"/>
 *         &lt;element name="AmountInCompanyCodeCurrency" type="{http://sap.com/xi/SAPSCORE/SFIN}Amount" minOccurs="0"/>
 *         &lt;element name="DebitCreditCode" type="{http://sap.com/xi/SAPSCORE/SFIN}DebitCreditCode" minOccurs="0"/>
 *         &lt;element name="DocumentItemText" type="{http://sap.com/xi/SAPSCORE/SFIN}DocumentItemText" minOccurs="0"/>
 *         &lt;element name="AssignmentReference" type="{http://sap.com/xi/SAPSCORE/SFIN}AssignmentReference" minOccurs="0"/>
 *         &lt;element name="FinancialTransactionType" type="{http://sap.com/xi/SAPSCORE/SFIN}FinancialTransactionTypeCode" minOccurs="0"/>
 *         &lt;element name="Tax" type="{http://sap.com/xi/SAPSCORE/SFIN}JournalEntryCreateRequestJournalEntryTaxDetails" minOccurs="0"/>
 *         &lt;element name="Plant" type="{http://sap.com/xi/SAPSCORE/SFIN}PlantID" minOccurs="0"/>
 *         &lt;element name="Material" type="{http://sap.com/xi/SAPSCORE/SFIN}ProductID" minOccurs="0"/>
 *         &lt;element name="QuantityInEntryUnit" type="{http://sap.com/xi/SAPSCORE/SFIN}Quantity" minOccurs="0"/>
 *         &lt;element name="IsNotCashDiscountLiable" type="{http://sap.com/xi/SAPSCORE/SFIN}Indicator" minOccurs="0"/>
 *         &lt;element name="TradingPartner" type="{http://sap.com/xi/SAPSCORE/SFIN}TradingPartnerID" minOccurs="0"/>
 *         &lt;element name="ValueDate" type="{http://sap.com/xi/SAPSCORE/SFIN}Date" minOccurs="0"/>
 *         &lt;element name="AccountAssignment" type="{http://sap.com/xi/SAPSCORE/SFIN}JournalEntryCreateRequestJournalEntryItemAccountAssignment" minOccurs="0"/>
 *         &lt;element name="ProfitabilitySupplement" type="{http://sap.com/xi/SAPSCORE/SFIN}JournalEntryCreateRequestJournalEntryItemProfitabilitySupplement" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JournalEntryCreateRequestJournalEntryItem", propOrder = {
    "referenceDocumentItem",
    "itemGroup",
    "companyCode",
    "glAccount",
    "amountInTransactionCurrency",
    "amountInCompanyCodeCurrency",
    "debitCreditCode",
    "documentItemText",
    "assignmentReference",
    "financialTransactionType",
    "tax",
    "plant",
    "material",
    "quantityInEntryUnit",
    "isNotCashDiscountLiable",
    "tradingPartner",
    "valueDate",
    "accountAssignment",
    "profitabilitySupplement"
})
public class JournalEntryCreateRequestJournalEntryItem {

    @XmlElement(name = "ReferenceDocumentItem")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String referenceDocumentItem;
    @XmlElement(name = "ItemGroup")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String itemGroup;
    @XmlElement(name = "CompanyCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String companyCode;
    @XmlElement(name = "GLAccount", required = true)
    protected com.sap.xi.sapscore.sfin.ChartOfAccountsItemCode glAccount;
    @XmlElement(name = "AmountInTransactionCurrency", required = true)
    protected com.sap.xi.sapscore.sfin.Amount amountInTransactionCurrency;
    @XmlElement(name = "AmountInCompanyCodeCurrency")
    protected com.sap.xi.sapscore.sfin.Amount amountInCompanyCodeCurrency;
    @XmlElement(name = "DebitCreditCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String debitCreditCode;
    @XmlElement(name = "DocumentItemText")
    protected String documentItemText;
    @XmlElement(name = "AssignmentReference")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String assignmentReference;
    @XmlElement(name = "FinancialTransactionType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String financialTransactionType;
    @XmlElement(name = "Tax")
    protected JournalEntryCreateRequestJournalEntryTaxDetails tax;
    @XmlElement(name = "Plant")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String plant;
    @XmlElement(name = "Material")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String material;
    @XmlElement(name = "QuantityInEntryUnit")
    protected com.sap.xi.sapscore.sfin.Quantity quantityInEntryUnit;
    @XmlElement(name = "IsNotCashDiscountLiable")
    protected Boolean isNotCashDiscountLiable;
    @XmlElement(name = "TradingPartner")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String tradingPartner;
    @XmlElement(name = "ValueDate")
    protected XMLGregorianCalendar valueDate;
    @XmlElement(name = "AccountAssignment")
    protected JournalEntryCreateRequestJournalEntryItemAccountAssignment accountAssignment;
    @XmlElement(name = "ProfitabilitySupplement")
    protected JournalEntryCreateRequestJournalEntryItemProfitabilitySupplement profitabilitySupplement;

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
     * Gets the value of the itemGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemGroup() {
        return itemGroup;
    }

    /**
     * Sets the value of the itemGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemGroup(String value) {
        this.itemGroup = value;
    }

    /**
     * Gets the value of the companyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyCode() {
        return companyCode;
    }

    /**
     * Sets the value of the companyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyCode(String value) {
        this.companyCode = value;
    }

    /**
     * Gets the value of the glAccount property.
     * 
     * @return
     *     possible object is
     *     {@link com.sap.xi.sapscore.sfin.ChartOfAccountsItemCode }
     *     
     */
    public com.sap.xi.sapscore.sfin.ChartOfAccountsItemCode getGLAccount() {
        return glAccount;
    }

    /**
     * Sets the value of the glAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sap.xi.sapscore.sfin.ChartOfAccountsItemCode }
     *     
     */
    public void setGLAccount(ChartOfAccountsItemCode value) {
        this.glAccount = value;
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
    public void setAmountInCompanyCodeCurrency(Amount value) {
        this.amountInCompanyCodeCurrency = value;
    }

    /**
     * Gets the value of the debitCreditCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebitCreditCode() {
        return debitCreditCode;
    }

    /**
     * Sets the value of the debitCreditCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebitCreditCode(String value) {
        this.debitCreditCode = value;
    }

    /**
     * Gets the value of the documentItemText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentItemText() {
        return documentItemText;
    }

    /**
     * Sets the value of the documentItemText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentItemText(String value) {
        this.documentItemText = value;
    }

    /**
     * Gets the value of the assignmentReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignmentReference() {
        return assignmentReference;
    }

    /**
     * Sets the value of the assignmentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignmentReference(String value) {
        this.assignmentReference = value;
    }

    /**
     * Gets the value of the financialTransactionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinancialTransactionType() {
        return financialTransactionType;
    }

    /**
     * Sets the value of the financialTransactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinancialTransactionType(String value) {
        this.financialTransactionType = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * @return
     *     possible object is
     *     {@link JournalEntryCreateRequestJournalEntryTaxDetails }
     *     
     */
    public JournalEntryCreateRequestJournalEntryTaxDetails getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JournalEntryCreateRequestJournalEntryTaxDetails }
     *     
     */
    public void setTax(JournalEntryCreateRequestJournalEntryTaxDetails value) {
        this.tax = value;
    }

    /**
     * Gets the value of the plant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlant() {
        return plant;
    }

    /**
     * Sets the value of the plant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlant(String value) {
        this.plant = value;
    }

    /**
     * Gets the value of the material property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Sets the value of the material property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterial(String value) {
        this.material = value;
    }

    /**
     * Gets the value of the quantityInEntryUnit property.
     * 
     * @return
     *     possible object is
     *     {@link com.sap.xi.sapscore.sfin.Quantity }
     *     
     */
    public com.sap.xi.sapscore.sfin.Quantity getQuantityInEntryUnit() {
        return quantityInEntryUnit;
    }

    /**
     * Sets the value of the quantityInEntryUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sap.xi.sapscore.sfin.Quantity }
     *     
     */
    public void setQuantityInEntryUnit(Quantity value) {
        this.quantityInEntryUnit = value;
    }

    /**
     * Gets the value of the isNotCashDiscountLiable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNotCashDiscountLiable() {
        return isNotCashDiscountLiable;
    }

    /**
     * Sets the value of the isNotCashDiscountLiable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNotCashDiscountLiable(Boolean value) {
        this.isNotCashDiscountLiable = value;
    }

    /**
     * Gets the value of the tradingPartner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradingPartner() {
        return tradingPartner;
    }

    /**
     * Sets the value of the tradingPartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradingPartner(String value) {
        this.tradingPartner = value;
    }

    /**
     * Gets the value of the valueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValueDate() {
        return valueDate;
    }

    /**
     * Sets the value of the valueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValueDate(XMLGregorianCalendar value) {
        this.valueDate = value;
    }

    /**
     * Gets the value of the accountAssignment property.
     * 
     * @return
     *     possible object is
     *     {@link JournalEntryCreateRequestJournalEntryItemAccountAssignment }
     *     
     */
    public JournalEntryCreateRequestJournalEntryItemAccountAssignment getAccountAssignment() {
        return accountAssignment;
    }

    /**
     * Sets the value of the accountAssignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JournalEntryCreateRequestJournalEntryItemAccountAssignment }
     *     
     */
    public void setAccountAssignment(JournalEntryCreateRequestJournalEntryItemAccountAssignment value) {
        this.accountAssignment = value;
    }

    /**
     * Gets the value of the profitabilitySupplement property.
     * 
     * @return
     *     possible object is
     *     {@link JournalEntryCreateRequestJournalEntryItemProfitabilitySupplement }
     *     
     */
    public JournalEntryCreateRequestJournalEntryItemProfitabilitySupplement getProfitabilitySupplement() {
        return profitabilitySupplement;
    }

    /**
     * Sets the value of the profitabilitySupplement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JournalEntryCreateRequestJournalEntryItemProfitabilitySupplement }
     *     
     */
    public void setProfitabilitySupplement(JournalEntryCreateRequestJournalEntryItemProfitabilitySupplement value) {
        this.profitabilitySupplement = value;
    }

}
