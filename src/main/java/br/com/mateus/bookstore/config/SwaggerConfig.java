package br.com.mateus.bookstore.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SwaggerConfig {

    private static final String API_TITLE = "Book Store Manager";
    private static final String API_VERSION = "1.0.0";
    private static final String API_DESCRIPTION = "Sistema de gerenciamento de locação de livros";

    @Bean
    public OpenAPI api(){
        return new OpenAPI().info(new Info().title(API_TITLE).version(API_VERSION).description(API_DESCRIPTION));
     }

    @Bean
    public GroupedOpenApi buildApiInfo() {
        return GroupedOpenApi.builder()
                .group("http")
                .pathsToMatch("/**")
                .build();
    }
}
