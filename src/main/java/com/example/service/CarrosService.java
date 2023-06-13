package com.example.service;

import com.example.model.CarrosModel;
import com.example.repository.CarrosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarrosService {

	@Autowired
    private CarrosRepository carrosRepository;

    public List<CarrosModel> listarCarros() {
        return carrosRepository.findAll();
    }

    public CarrosModel buscarCarroPorId(Long id) {
        return carrosRepository.findById(id).orElse(null);
    }

    public CarrosModel salvarCarro(CarrosModel carro) {
        return carrosRepository.save(carro);
    }

    public void deletarCarro(Long id) {
        carrosRepository.deleteById(id);
    }
}

//Essas classes de serviço fornecem métodos para realizar operações com as 
//respectivas entidades (listar, buscar, salvar e deletar). 
//Cada classe utiliza o repositório correspondente para interagir com o banco de dados. 
//Certifique-se de que os repositórios (UsuarioRepository, CarrosRepository e PaginaRepository) 
//estejam corretamente definidos e injetados nas classes de serviço por meio de anotações como @Autowired.