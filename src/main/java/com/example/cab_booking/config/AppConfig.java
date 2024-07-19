package com.example.cab_booking.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class AppConfig {

        public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity)
        {
                throw Exception{
                httpSecurity.sessionManagement()
                        .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                        .and()
                        .authorizeRequests()
                        .antMatchers("/api/v1/auth/**").permitAll()
                        .requestMatchers("/api/v1/auth")
                        .anyRequest().authenticated()
                        .and()
                        .httpBasic();

                return httpSecurity.build();
        }
        }
}
