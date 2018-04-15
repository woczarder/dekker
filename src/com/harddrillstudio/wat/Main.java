package com.harddrillstudio.wat;

public class Main {

    public static void main(String[] args) {
        
        Process p0 = new Process(0);
        Process p1 = new Process(1);

        p0.start();
        p1.start();
    }
}
