package com.mcu;

public class Car {
    private DieselEngine engine;
    public Car() {
        System.out.println("Constructor:: Car");
    }

    public void setEngine(DieselEngine engine) {
        this.engine = engine;
        System.out.println("Setter injection");
    }
    public void drive(){
        if (engine.start()>=1){
            System.out.println("Journey start 😝....");
        }else{
            System.out.println("Engine start to fail  😵");
        }
    }
}
