package com.example.attendace_system.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests((requests) -> requests
                        .requestMatchers("/register", "/login", "/css/**").permitAll()  // Open access to register and login pages
                        .anyRequest().authenticated()  // Require authentication for other requests
                )
                .formLogin((form) -> form
                        .loginPage("/login")  // Custom login page
                        .defaultSuccessUrl("/attendance", true)  // Redirect to attendance page upon successful login
                )
                .logout((logout) -> logout
                        .logoutUrl("/logout")  // Logout endpoint
                        .logoutSuccessUrl("/login?logout")  // Redirect to login page with a success message
                        .invalidateHttpSession(true)  // Invalidate session
                        .deleteCookies("JSESSIONID")  // Remove session cookie
                        .permitAll()  // Allow access to log out endpoint
                );

        return http.build();
    }
}
