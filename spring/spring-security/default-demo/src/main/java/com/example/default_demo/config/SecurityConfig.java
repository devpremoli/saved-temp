package com.example.default_demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                .authorizeHttpRequests(auth -> auth
                        .anyRequest().authenticated())
                .formLogin(form -> form
                        .loginPage("/login")
                        .loginProcessingUrl("/perform_login")
                        .defaultSuccessUrl("/", true)
                        .permitAll()
                        .usernameParameter("username")  // Default is "username"
                        .passwordParameter("password"))  // Default is "password"
                .logout(logout -> logout.logoutUrl("/logout").logoutSuccessUrl("/login"))
                .build();

        /*
        return http
                .authorizeHttpRequests(auth -> auth
                        .anyRequest().authenticated())
                .formLogin(Customizer.withDefaults())
                .build();
         */
    }



    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();  // Only for debugging
    }

    @Bean
    public UserDetailsService userDetailsService(PasswordEncoder passwordEncoder) {
        String encodedPassword = passwordEncoder.encode("password");
        System.out.println("Encoded password: " + encodedPassword);  // Debug output

        UserDetails user = User.builder()
                .username("user")
                .password(encodedPassword)
                .roles("USER")
                .build();

        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager(user);
        System.out.println("UserDetailsService initialized with user: " + user.getUsername());
        return manager;
    }
}
