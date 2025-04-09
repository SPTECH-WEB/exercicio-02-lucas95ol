package com.example.atividade2.atividade2.service;

import org.springframework.stereotype.Component;

@Component
public class EntregaExpressa implements FreteStrategy{
    @Override
    public double calcular(double peso) {
        return peso * 3;
    }

    @Override
    public String tipo() {
        return "Expressa";
    }
}
