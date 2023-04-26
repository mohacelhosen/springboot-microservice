package com.mcu.autowiring.Battey;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class NeonCell implements Cell{
    public NeonCell() {
        System.out.println("Neon Cell:: Constructor");
    }
    @Override
    public Integer chargeStatus(){
        System.out.println("Neon Cell are used");
        return 100;
    }
}
