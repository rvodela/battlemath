package com.ford.demogl.demoglpostsoap;

import org.springframework.boot.actuate.autoconfigure.security.servlet.EndpointRequest;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;



@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfiguration {

	/*****************************************************************************************************************
	 * Other - Basic/Public
	 *****************************************************************************************************************/

	@Configuration
	@Order(30)
	public static class HttpSecurityConfiguration extends WebSecurityConfigurerAdapter {

		@Override
		protected void configure(HttpSecurity http) throws Exception {
			http
			    .csrf()
				    .disable()
			    .authorizeRequests()
				.antMatchers("/swagger-ui.html", "/swagger-resources/**", "/webjars/**", "/v2/api-docs").permitAll()
				.requestMatchers(EndpointRequest.to("info", "health")).permitAll() // actuator
				.anyRequest().authenticated()
				.and()
			    .httpBasic()
			;
		}
	}

}
