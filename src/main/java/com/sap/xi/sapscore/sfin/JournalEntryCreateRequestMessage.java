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


/**
 * <p>Java class for JournalEntryCreateRequestMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JournalEntryCreateRequestMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MessageHeader" type="{http://sap.com/xi/SAPSCORE/SFIN}BusinessDocumentMessageHeader"/>
 *         &lt;element name="JournalEntry" type="{http://sap.com/xi/SAPSCORE/SFIN}JournalEntryCreateRequestJournalEntry"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JournalEntryCreateRequestMessage", propOrder = {
    "messageHeader",
    "journalEntry"
})
public class JournalEntryCreateRequestMessage {

    @XmlElement(name = "MessageHeader", required = true)
    protected com.sap.xi.sapscore.sfin.BusinessDocumentMessageHeader messageHeader;
    @XmlElement(name = "JournalEntry", required = true)
    protected JournalEntryCreateRequestJournalEntry journalEntry;

    /**
     * Gets the value of the messageHeader property.
     * 
     * @return
     *     possible object is
     *     {@link com.sap.xi.sapscore.sfin.BusinessDocumentMessageHeader }
     *     
     */
    public com.sap.xi.sapscore.sfin.BusinessDocumentMessageHeader getMessageHeader() {
        return messageHeader;
    }

    /**
     * Sets the value of the messageHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sap.xi.sapscore.sfin.BusinessDocumentMessageHeader }
     *     
     */
    public void setMessageHeader(BusinessDocumentMessageHeader value) {
        this.messageHeader = value;
    }

    /**
     * Gets the value of the journalEntry property.
     * 
     * @return
     *     possible object is
     *     {@link JournalEntryCreateRequestJournalEntry }
     *     
     */
    public JournalEntryCreateRequestJournalEntry getJournalEntry() {
        return journalEntry;
    }

    /**
     * Sets the value of the journalEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JournalEntryCreateRequestJournalEntry }
     *     
     */
    public void setJournalEntry(JournalEntryCreateRequestJournalEntry value) {
        this.journalEntry = value;
    }

}
