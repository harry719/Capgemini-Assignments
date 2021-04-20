package com.example.springsecurity;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		//IN memortSet your configuration on the auth object
		auth.inMemoryAuthentication()
		.withUser("hari")
		.password("hari")
		.roles("USER")
		.and()
		.withUser("foo")
		.password("foo")
		.roles("ADMIN");
	}

	@Bean
	public PasswordEncoder  getpasswordEncoder() {
		return NoOpPasswordEncoder.getInstance(); //not porividng any security.!
		
	}
//privildeg bi set kar skte hai.
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub////sabko match kargea / k bd walo ko,wild card se karega ** matches curetn level and below level fir role bi denge
		
	http.authorizeRequests()
	.antMatchers("/admin").hasRole("ADMIN")
	.antMatchers("/user").hasAnyRole("USER","ADMIN")
	.antMatchers("/**")
	.hasAnyRole("ADMIN")
	.antMatchers("/").permitAll()
	.and()
	.formLogin();
	
	}

	
	
	
}
