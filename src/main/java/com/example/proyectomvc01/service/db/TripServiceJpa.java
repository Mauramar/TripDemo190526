package com.example.proyectomvc01.service.db;

import com.example.proyectomvc01.model.Trip;
import com.example.proyectomvc01.repository.ITripRepository;
import com.example.proyectomvc01.service.ITripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Primary
@Service
public class TripServiceJpa implements ITripService {

    @Autowired
    private ITripRepository repoTrip;

    @Override
    public List<Trip> buscarTodos() {
        return repoTrip.findAll();
    }

    @Override
    public Trip buscarPorId(Integer idTrip) {
        return repoTrip.findById(idTrip).orElse(null);
    }

    @Override
    public void guardar(Trip trip) {
        repoTrip.save(trip);
    }

    @Override
    public void eliminar(Integer idTrip) {
        repoTrip.deleteById(idTrip);
    }
}