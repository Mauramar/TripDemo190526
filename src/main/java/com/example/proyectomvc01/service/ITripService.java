package com.example.proyectomvc01.service;

import com.example.proyectomvc01.model.Trip;
import java.util.List;

public interface ITripService {

    List<Trip> buscarTodos();

    Trip buscarPorId(Integer idTrip);

    void guardar(Trip trip);

    void eliminar(Integer idTrip);
}