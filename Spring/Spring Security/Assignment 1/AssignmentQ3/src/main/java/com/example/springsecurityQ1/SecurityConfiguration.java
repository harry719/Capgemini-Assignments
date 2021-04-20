package com.example.springsecurityQ1;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	

	@Autowired
	DataSource dataSource;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		//jdbc based auth.
		
		auth.jdbcAuthentication().dataSource(dataSource);
	
	}

	@Bean
	public PasswordEncoder  getpasswordEncoder() {
		return NoOpPasswordEncoder.getInstance(); //not porividng any security.!
		
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
	
	http.authorizeRequests()
    .antMatchers("/**").permitAll()
    .anyRequest().authenticated()
    .and()
    .formLogin()
    .loginPage("/login")
    .loginProcessingUrl("/login")
    .defaultSuccessUrl("/index")
    .failureForwardUrl("/login").permitAll();
	
	
	
}
}
