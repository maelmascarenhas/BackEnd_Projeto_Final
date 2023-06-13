package com.example.controller;

import com.example.model.PaginaModel;
import com.example.service.PaginaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SuppressWarnings("unused")
@RestController
@RequestMapping("/paginas")
public class PaginaController {

    private final PaginaService paginaService;

    @Autowired
    public PaginaController(PaginaService paginaService) {
        this.paginaService = paginaService;
    }
}
   
