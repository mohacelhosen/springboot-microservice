package com.mcu.autowiring.Battey;

import org.springframework.stereotype.Component;

@Component
public class ChargeCell implements Cell{
    public ChargeCell()  {
        System.out.println("Battery🔋:: Constructor Executed");
    }

    @Override
    public Integer chargeStatus(){
        System.out.println("Charge Cell are used");
        return 95;
    }
}
