package com.biblioteca.bibliotecaapi.controller;

import com.biblioteca.bibliotecaapi.dto.LoginRequest;
import com.biblioteca.bibliotecaapi.dto.LoginResponse;
import com.biblioteca.bibliotecaapi.security.JwtService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final JwtService jwtService;

    public AuthController(JwtService jwtService) {
        this.jwtService = jwtService;
    }

    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest request) {

        if ("rodrigo".equals(request.getUsername())
                && "123456".equals(request.getPassword())) {

            String token =
                    jwtService.gerarToken(request.getUsername());

            return new LoginResponse(token);
        }

        throw new RuntimeException("Usuário ou senha inválidos");
    }
}