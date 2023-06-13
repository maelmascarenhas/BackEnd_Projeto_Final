package com.example.service;

import com.example.model.PaginaModel;
import com.example.repository.PaginaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaginaService {

	private PaginaRepository paginaRepository;

    public List<PaginaModel> listarPaginas() {
        return paginaRepository.findAll();
    }

    public PaginaModel buscarPaginaPorId(Long id) {
        return paginaRepository.findById(id).orElse(null);
    }

    public PaginaModel salvarPagina(PaginaModel pagina) {
        return paginaRepository.save(pagina);
    }

    public void deletarPagina(Long id) {
        paginaRepository.deleteById(id);
    }
}
