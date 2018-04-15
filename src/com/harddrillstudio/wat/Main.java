package com.harddrillstudio.wat;

public class Main {

    public static void main(String[] args) {

        boolean wantsToEnter[] = new boolean[2];
        wantsToEnter[0] = false;
        wantsToEnter[1] = false;
        int turn = 0;



        Process0 p0 = new Process0();
        Process1 p1 = new Process1();

        p0.start();
        p1.start();
    }
}
