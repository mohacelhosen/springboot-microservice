package com.mcu.autowiring.memeory;

import org.springframework.stereotype.Component;

@Component
public class Chip {
    public Chip() {
        System.out.println("Chip 🧠:: Constructor Executed");
    }

    public String chipStatus(){
        return "Chip are working Fine ✅";
    }
}
