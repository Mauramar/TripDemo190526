package com.example.proyectomvc01.service;

import com.example.proyectomvc01.model.Categoria;
import java.util.List;

public interface ICategoriaService {

    List<Categoria> buscarTodas();

    Categoria buscarPorId(Integer idCategoria);

    void guardar(Categoria categoria);

    void eliminar(Integer idCategoria);
}