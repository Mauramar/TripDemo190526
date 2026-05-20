package com.example.proyectomvc01.repository;

import com.example.proyectomvc01.model.Trip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITripRepository extends JpaRepository<Trip, Integer> {
}