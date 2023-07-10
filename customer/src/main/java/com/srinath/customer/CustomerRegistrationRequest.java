package com.srinath.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
