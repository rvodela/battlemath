package com.ford.demogl.demoglpostsoap;

import org.apache.http.auth.UsernamePasswordCredentials;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.transport.http.HttpComponentsMessageSender;

@Configuration
public class JournalConfiguration {

	@Bean
	public Jaxb2Marshaller marshaller() {
	    try {
            Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
            // this package must match the package in the <generatePackage> specified in
            // pom.xml
            marshaller.setContextPath("com.sap.xi.sapscore.sfin");
            marshaller.setCheckForXmlRootElement(false);
            //  marshaller.setContextPath("journalentrycreaterequestconfi_12.wsdl");
            // marshaller.setClassesToBeBound("com.sap.xi.sapscore.sfin");
            return marshaller;
        }
	    catch (Exception ex) {
            String es = ex.getMessage();


	        return null;
        }
	}

	@Bean
	public JournalClient journalClient(Jaxb2Marshaller marshaller) {
	    try {
            JournalClient client = new JournalClient();
            client.setDefaultUri("http://saps5s00.ierp.ford.com:8000/sap/bc/srt/scs/sap/journalentrycreaterequestconfi?sap-client=100");
            client.setMarshaller(marshaller);
            client.setUnmarshaller(marshaller);

            client.setMessageSender(httpComponentsMessageSender());


            return client;
        }
        catch (Exception ex) {
            String es = ex.getMessage();


            return null;
        }

	}
	
	  @Bean
	  public HttpComponentsMessageSender httpComponentsMessageSender() {
	    HttpComponentsMessageSender httpComponentsMessageSender = new HttpComponentsMessageSender();
	    // set the basic authorization credentials
	    httpComponentsMessageSender.setCredentials(usernamePasswordCredentials());

	    return httpComponentsMessageSender;
	  }

	  @Bean
	  public UsernamePasswordCredentials usernamePasswordCredentials() {
	    // pass the user name and password to be used
		//these are real values
	    return new UsernamePasswordCredentials("user", "password");
	  }
}