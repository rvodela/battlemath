package com.ford.demogl.demoglpostsoap.acceptance;

import com.ford.cloudnative.base.test.acceptance.AcceptanceTestUtil;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.json.JsonContent;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import static com.ford.cloudnative.base.test.json.JsonUtil.jsonContent;
import static org.assertj.core.api.Assertions.assertThat;

public class WebSecurityAcceptanceTest {

	RestTemplate restTemplate;

	@Before
	public void setup() {
		restTemplate = AcceptanceTestUtil.restTemplateBuilder().disableErrorHandler().build();
	}

	@Test
	public void testActuatorInfoEndpointIsAccessible() throws Exception {
		ResponseEntity<String> response = restTemplate.getForEntity("/actuator/info", String.class);
		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);

		JsonContent<?> jsonContent = jsonContent(response.getBody());
		assertThat(jsonContent).hasJsonPathStringValue("$.app.name");
		assertThat(jsonContent).extractingJsonPathStringValue("$.app.name").isNotBlank();
	}

}
