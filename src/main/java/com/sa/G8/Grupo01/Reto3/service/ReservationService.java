/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sa.G8.Grupo01.Reto3.service;

import com.sa.G8.Grupo01.Reto3.entity.Reservation;
import com.sa.G8.Grupo01.Reto3.repository.ReservationRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Novosix
 */
@Service
public class ReservationService {
    @Autowired
    private ReservationRepository repository;
    
    public Reservation saveReservation(Reservation game){
       return repository.save(game);
    }
    
    public List<Reservation> getReservation(){
        return repository.findAll();
    }
    
    public Reservation getReservationById(int id){
        return repository.findById(id).orElse(null);
    }
    
      
    public String deleteReservation(int id){
        repository.deleteById(id);
        return "Reservacion eliminada "+id;
    }
    
    public Reservation updateReservation(Reservation reservation){
        Reservation existingReservation=repository.findById(reservation.getIdReservation()).orElse(null);
        existingReservation.setDevolutionDate(reservation.getDevolutionDate());
        existingReservation.setStartDate(reservation.getStartDate());
        existingReservation.setStatus(reservation.getStatus());
       return repository.save(existingReservation);
    }
}
