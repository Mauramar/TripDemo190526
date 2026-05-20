package com.example.proyectomvc01.repository;

import com.example.proyectomvc01.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoriaRepository extends JpaRepository<Categoria, Integer> {
}