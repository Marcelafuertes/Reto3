/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sa.G8.Grupo01.Reto3.repository;

import com.sa.G8.Grupo01.Reto3.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Novosix
 */
public interface ReservationRepository extends JpaRepository<Reservation, Integer>{
    
    
}

