package com.ford.demogl.demoglpostsoap;

import com.sap.xi.sapscore.sfin.JournalEntryCreateConfirmationMessage;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.xml.datatype.DatatypeConfigurationException;

@SpringBootApplication
public class DemoglpostsoapApplication {



	public static void main(String[] args) throws DatatypeConfigurationException {

		SpringApplication.run(DemoglpostsoapApplication.class, args);
	}


	@Bean
	CommandLineRunner lookup(JournalClient journalClient) {
		return args -> {

			JournalEntryCreateConfirmationMessage myDocument = journalClient.create();

            System.out.println(myDocument.getMessageHeader().getID());
			//RetrieveByBookingIdResponseType response = bookingClient.getBooking(bookingId);
			//System.out.println("Notes: " + response.getBooking().getNote());
		};
	}

}
