package com.example.proyectomvc01.service.db;

import com.example.proyectomvc01.model.Categoria;
import com.example.proyectomvc01.repository.ICategoriaRepository;
import com.example.proyectomvc01.service.ICategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Primary
@Service
public class CategoriasServiceJpa implements ICategoriaService {

    @Autowired
    private ICategoriaRepository repoCategoria;

    @Override
    public List<Categoria> buscarTodas() {
        return repoCategoria.findAll();
    }

    @Override
    public Categoria buscarPorId(Integer idCategoria) {
        return repoCategoria.findById(idCategoria).orElse(null);
    }

    @Override
    public void guardar(Categoria categoria) {
        repoCategoria.save(categoria);
    }

    @Override
    public void eliminar(Integer idCategoria) {
        repoCategoria.deleteById(idCategoria);
    }
}