package com.mcu;

public class Motor {
    static  int count = 1;
    public Motor() {
        System.out.printf("Motor= %d::Constructor\n",count);
        count++;
    }
}
