package com.dest1.minecraft.controllers;

import com.dest1.minecraft.entities.Jogo;
import com.dest1.minecraft.repositories.JogoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/jogos")
public class JogoController {

    @Autowired //injeção de dependencia
    JogoRepository repository;

    @PostMapping
    public Jogo m(@RequestBody Jogo j){
        return repository.save(j);
    }

    @GetMapping
    public List<Jogo> mostrar(){
        return repository.findAll();
    }
}