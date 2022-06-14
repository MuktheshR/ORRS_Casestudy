package com.RailwayReservationAdminManagement.security;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;


@EnableWebSecurity 
public class AdminSecurityConfig extends WebSecurityConfigurerAdapter
{
	@Override
	  protected void configure(AuthenticationManagerBuilder auth) throws Exception  { 
		  auth.inMemoryAuthentication()
		  		.withUser("vicky")
		  		.password("vicky1234")
		  		.roles("ADMIN"); 
	  }
	  
	  @Override 
	  protected void configure(HttpSecurity http) throws Exception  {
		  
		  http
		  .httpBasic()
		  .and()
		  .authorizeRequests()
		  	  .antMatchers("/admin","/admin/add","/admin/update/**","/admin/delete/**","/admin/all")
		  	  .permitAll()
		  	//  .hasRole("ADMIN")
		  	  //.and().formLogin();
		  	  
//              .antMatchers("/admin/all","/admin/").permitAll()
		  	
		  	  .and().csrf().disable()
		  	  .headers().frameOptions().disable(); 
		 }
	  


			@Bean 
			 public PasswordEncoder getPasswordEncoder() { 
				 
				 return NoOpPasswordEncoder.getInstance();
				 
				 }
			 

}
