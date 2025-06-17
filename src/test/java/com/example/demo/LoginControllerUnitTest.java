package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@ExtendWith(MockitoExtension.class)
class LoginControllerUnitTest {

    @InjectMocks
    private LoginController loginController;

    @Test
    void loginSuccess() {
        LoginController.LoginRequest request = new LoginController.LoginRequest();
        request.username = "admin";
        request.password = "password";

        ResponseEntity<String> response = loginController.login(request);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals("Login successful", response.getBody());
    }

    @Test
    void loginFail() {
        LoginController.LoginRequest request = new LoginController.LoginRequest();
        request.username = "admin";
        request.password = "wrong";

        ResponseEntity<String> response = loginController.login(request);

        assertEquals(HttpStatus.UNAUTHORIZED, response.getStatusCode());
        assertEquals("Unauthorized", response.getBody());
    }
}
