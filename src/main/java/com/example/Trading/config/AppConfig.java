package com.example.Trading.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;

@Configuration
public class AppConfig {
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.sessionManagement(managment->managment.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .authorizeHttpRequests(Authorizae->Authorizae
                        .requestMatchers("/api**").authenticated().anyRequest().permitAll())
                .addFilterBefore(new jwtTokenValidator(), BasicAuthenticationFilter.class)
                .csef(csrf->csrf.disable())
                .cors(cors->cors.configurationSource(CorsConfigurationSource))

        return null;
    }
    private CorsConfigurationSource corsConfigurationSource(){
        return null;
    }

}
