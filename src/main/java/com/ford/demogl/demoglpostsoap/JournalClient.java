package com.ford.demogl.demoglpostsoap;

import com.ford.demogl.demoglpostsoap.model.JournalEntryBO;
import com.sap.xi.sapscore.sfin.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import static javax.xml.datatype.DatatypeFactory.newInstance;

public class JournalClient extends WebServiceGatewaySupport {

	private static final Logger log = LoggerFactory.getLogger(JournalClient.class);

	
	public JournalEntryCreateConfirmationMessage create() throws DatatypeConfigurationException {

		JournalEntryBO journalEntryBO = new JournalEntryBO();
		JournalEntryCreateRequestMessage  request = new JournalEntryCreateRequestMessage ();


		JournalEntryCreateRequestJournalEntry journalEntry = new JournalEntryCreateRequestJournalEntry();
		journalEntry.setAccountingDocumentType("SA");
		journalEntry.setBusinessTransactionType("RFBU");
		journalEntry.setOriginalReferenceDocumentType("BKPFF");
		journalEntry.setOriginalReferenceDocumentLogicalSystem("S5SCLNT100");
		journalEntry.setDocumentHeaderText("Test Soap WS Testing");
		journalEntry.setCompanyCode(journalEntryBO.getBUnitId());
		journalEntry.setOriginalReferenceDocument(journalEntryBO.getJournalId());
		journalEntry.setOriginalReferenceDocumentLogicalSystem("S5SCLNT100");
		//Date docDate = journalEntryBO.getJournalDate();

		String FORMATER = "yyyy-MM-dd'T'HH:mm:ss'Z'";

		DateFormat format = new SimpleDateFormat(FORMATER);
		Date date = new Date();
		XMLGregorianCalendar gDateFormatted =
				newInstance().newXMLGregorianCalendar(format.format(date));
		//XMLGregorianCalendar formattedDocDate =
			//	newInstance().newXMLGregorianCalendar(format.format(gDateFormatted));
		journalEntry.setDocumentDate(gDateFormatted);
		//Date docPostDate = getLastMonthDate(gDateFormatted);
		XMLGregorianCalendar formattedPostDate  =
				newInstance().newXMLGregorianCalendar(format.format(date));
		journalEntry.setPostingDate(formattedPostDate);
		journalEntry.setCreatedByUser("RVODELA");
		List<JournalEntryCreateRequestJournalEntryItem> itemList = journalEntry.getItem();

		JournalEntryCreateRequestJournalEntryItem item = new JournalEntryCreateRequestJournalEntryItem();
		item.setCompanyCode("6570");
		ChartOfAccountsItemCode glAccount = new ChartOfAccountsItemCode();
		glAccount.setValue("0010002000");
		Amount amount = new Amount();
		amount.setCurrencyCode("CAD");
		BigDecimal accountValue = new BigDecimal(100.00);
		amount.setValue(accountValue);
		item.setAmountInCompanyCodeCurrency(amount);
		item.setDebitCreditCode("S");
		itemList.add(item);

		JournalEntryCreateRequestJournalEntryItem item2 = new JournalEntryCreateRequestJournalEntryItem();
		item2.setCompanyCode("6570");
		ChartOfAccountsItemCode glAccount2 = new ChartOfAccountsItemCode();
		glAccount2.setValue("0013318000");
		Amount amount2 = new Amount();
		amount2.setCurrencyCode("CAD");
		BigDecimal accountValue2 = new BigDecimal(-100.00);
		amount2.setValue(accountValue2);
		item2.setAmountInCompanyCodeCurrency(amount2);
		item2.setDebitCreditCode("H");
		itemList.add(item2);

		JournalEntryCreateRequestMessage msgreq = new JournalEntryCreateRequestMessage();

		msgreq.setJournalEntry(journalEntry);
		BusinessDocumentMessageHeader bh = new BusinessDocumentMessageHeader();
		bh.setID(new BusinessDocumentMessageID());
		String FORMATER2 = "yyyy-MM-dd'T'HH:mm:ss'Z'";

		DateFormat format2 = new SimpleDateFormat(FORMATER2);
		Date date2 = new Date();
		XMLGregorianCalendar gDateFormatted2 =
				DatatypeFactory.newInstance().newXMLGregorianCalendar(format.format(date));
		bh.setCreationDateTime(gDateFormatted);
		bh.setReferenceID(new BusinessDocumentMessageID() );
		bh.setID(new BusinessDocumentMessageID());
		bh.setReferenceUUID(new com.sap.xi.sapscore.sfin.UUID());

		request.setMessageHeader(bh);
		request.setJournalEntry(journalEntry);

		JournalEntryCreateConfirmationMessage  response =  (JournalEntryCreateConfirmationMessage) getWebServiceTemplate()
				.marshalSendAndReceive("http://saps5s00.ierp.ford.com:8000/sap/bc/srt/scs/sap/journalentrycreaterequestconfi?sap-client=100", request,
						
						new SoapActionCallback(
								"http://sap.com/xi/SAPSCORE/SFIN/JournalEntryCreateRequestConfirmation_In/JournalEntryCreateRequestConfirmation_InRequest")

						); 
		

		/*
		JAXBElement<JournalEntryCreateRequestBulkMessage> response = (JAXBElement<JournalEntryCreateRequestBulkMessage>)getWebServiceTemplate()
				.marshalSendAndReceive("http://localhost:18000/JabProviderWeb/BookingServiceV1", request); */
	
		//use this is you have to use the JAXBElement wrapper
		//return response.getValue();
		
		return response;
			
	}

	private static Date getLastMonthDate(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MONTH, -1);

		Date preMonthDate = cal.getTime();

		return preMonthDate;
	}
	public static String shortUUID() {
		java.util.UUID uuid = UUID.randomUUID();
		long l = ByteBuffer.wrap(uuid.toString().getBytes()).getLong();
		return Long.toString(l, Character.MAX_RADIX);
	}
}