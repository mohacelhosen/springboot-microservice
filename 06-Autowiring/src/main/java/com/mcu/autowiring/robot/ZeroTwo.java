


package com.mcu.autowiring.robot;

import com.mcu.autowiring.Battey.Cell;
import com.mcu.autowiring.Battey.ChargeCell;
import com.mcu.autowiring.memeory.Chip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ZeroTwo {
    //3rd way field/variable injection
//    @Autowired
    private Chip memory;
    //3rd way field/variable injection
//    @Autowired
    private Cell battery;
    private String NeonCell = "com.mcu.autowiring.Battey.NeonCell";
    private String ChargeCell = "com.mcu.autowiring.Battey.ChargeCell";

    public ZeroTwo() {
        System.out.println("ZeroTwo no-args :: Constructor Executed");
    }


    //1st way constructor injection
    //    @Autowired
    public ZeroTwo(Chip memory, ChargeCell battery) {
        this.memory = memory;
        this.battery = battery;
        System.out.println("ZeroTwo args :: Constructor Executed");
    }

    //2nd way by setter injection
    @Autowired
    public void setMemory(Chip memory) {
        this.memory = memory;
    }
    //2nd way by setter injection
    @Autowired
    public void setBattery(Cell battery) {
        this.battery = battery;
    }
    public void Status(){
        System.out.println("HI, I am Zero Two 🤖");
        String status = String.format(memory.chipStatus()+"\n"+ "Battery status: "+battery.chargeStatus()+"%%");
        System.out.println(status);

        if (battery.getClass().getName().equals(NeonCell)){
            System.out.println(battery.getClass().getName()+" 💗💗💗");
        }else{
            System.out.println(battery.getClass().getName()+" 💖💖💖");
        }
    }
}




