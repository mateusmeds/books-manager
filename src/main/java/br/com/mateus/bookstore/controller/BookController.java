package br.com.mateus.bookstore.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/hello")
public class BookController {
    @GetMapping
    @Operation(summary = "Livros", responses = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Lista de livros",
                    content = @Content(mediaType = "application/json")
            ),
    })
    public String hello(){
        return "Hello, world!";
    }
}
