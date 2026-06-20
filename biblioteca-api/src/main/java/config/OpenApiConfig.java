package com.biblioteca.bibliotecaapi.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI bibliotecaOpenAPI() {

        return new OpenAPI()
                .info(new Info()
                        .title("Biblioteca API")
                        .description("API para gerenciamento de livros")
                        .version("1.0")
                        .contact(new Contact()
                                .name("Rodrigo Andrade")
                                .email("seu-email@exemplo.com")))
                .externalDocs(new ExternalDocumentation()
                        .description("Projeto Biblioteca"));
    }
}