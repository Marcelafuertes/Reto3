/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sa.G8.Grupo01.Reto3.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Lili Diaz
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="message")

public class Message {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idMessage;
    private String messageText;
    
    @ManyToOne
    @JoinColumn(name = "game_id")
    @JsonIgnoreProperties({"messages","reservations"})
    private Game game;
    
    @ManyToOne
    @JoinColumn(name = "client_idClient")
    @JsonIgnoreProperties({"messages","reservations"})
    private Client client;
    

}
