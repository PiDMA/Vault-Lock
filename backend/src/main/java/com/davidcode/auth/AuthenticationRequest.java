package com.davidcode.auth;

public record AuthenticationRequest(
        String username,
        String password
) {
}
