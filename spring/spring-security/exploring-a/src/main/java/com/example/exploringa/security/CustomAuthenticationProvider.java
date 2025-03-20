package com.example.exploringa.security;


import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

public class CustomAuthenticationProvider implements AuthenticationProvider {
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String username = authentication.getName();
        String token = authentication.getCredentials().toString();

        System.out.println("CustomAuthenticationProvider called for username: " + username + " with token: " + token);

        if ("token".equals(token)) {
            System.out.println("CustomAuthenticationProvider successfully authenticated user: " + username);
            return new UsernamePasswordAuthenticationToken(username, token, null); // No authorities for this example
        }

        System.out.println("CustomAuthenticationProvider failed for username: " + username);
        throw new AuthenticationException("Invalid token") {};
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
    }
}
