package com.example.atividade2.atividade2.service;

import org.springframework.stereotype.Component;

@Component
public class TransportadoraTerceirizada implements FreteStrategy{
    @Override
    public double calcular(double peso) {
        return peso * 2;
    }

    @Override
    public String tipo() {
        return "Terceirizada";
    }
}
