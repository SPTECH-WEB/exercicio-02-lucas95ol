package com.example.atividade2.atividade2.controller;

import com.example.atividade2.atividade2.service.FreteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/frete")
public class FreteController {

    @Autowired
    private FreteService service;

    @GetMapping
    public String calcularFrete(@RequestParam String tipo, @RequestParam double peso){
        double valor = service.calcular(tipo, peso);
        return "Frete, tipo: %s, valor: R$ %.2f".formatted(tipo, valor);
    }

}
