package com.example.controller;

import com.example.model.CarrosModel;
import com.example.service.CarrosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carros")
public class CarrosController {

	@Autowired
	private CarrosService carrosService;

    @GetMapping
    public ResponseEntity<List<CarrosModel>> listarCarros() {
        List<CarrosModel> carros = carrosService.listarCarros();
        return ResponseEntity.ok(carros);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CarrosModel> buscarCarroPorId(@PathVariable Long id) {
        CarrosModel carro = carrosService.buscarCarroPorId(id);
        if (carro != null) {
            return ResponseEntity.ok(carro);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/carros")
    public ResponseEntity<CarrosModel> salvarCarro(@RequestBody CarrosModel carro) {
        CarrosModel novoCarro = carrosService.salvarCarro(carro);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoCarro);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarCarro(@PathVariable Long id) {
        carrosService.deletarCarro(id);
        return ResponseEntity.noContent().build();
    }
}
