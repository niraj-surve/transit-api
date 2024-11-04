package com.transit.app.common.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.tags.Tag;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(createApiInfo())
                .addSecurityItem(createSecurityRequirement())
                .components(createComponents())
                .tags(List.of(
                        new Tag().name("Health Check API (Public)")
                ))
                .servers(createServers());
    }

    private Info createApiInfo() {
        return new Info()
                .title("Transit App API")
                .version("1.0")
                .description("""
                        API reference for developers
                        
                        ### App Overview
                        Transit is an application for the transport facilities.
                        
                        ### Contact
                        Email: \
                        niraj.surve07@gmail.com \
                        poskarmangesh029@gmail.com \
                        rohitgoythale23@gmail.com \
                        GitHub: \
                        https://github.com/niraj-surve \
                        https://github.com/Mangesh-Poskar29 \
                        https://github.com/RohitGoythale18 \
                        """)
                .contact(createContact());
    }

    private Contact createContact() {
        return new Contact()
                .name("Niraj Surve")
                .url("https://github.com/niraj-surve")
                .email("niraj.surve07@gmail.com");
    }

    private SecurityRequirement createSecurityRequirement() {
        return new SecurityRequirement().addList("bearerAuth");
    }

    private Components createComponents() {
        return new Components()
                .addSecuritySchemes("bearerAuth", createSecurityScheme());
    }

    private SecurityScheme createSecurityScheme() {
        return new SecurityScheme()
                .type(SecurityScheme.Type.HTTP)
                .scheme("bearer")
                .bearerFormat("JWT");
    }

    private List<io.swagger.v3.oas.models.servers.Server> createServers() {
        return List.of(
                new io.swagger.v3.oas.models.servers.Server()
                        .url("http://localhost:8080")
                        .description("Local server")
        );
    }
}
