package com.harddrillstudio.wat;

public class Process extends Thread {

    private int id;

    static boolean wantsToEnter[] = new boolean[2];
    static int turn = 0;


    public Process(int id) {
        this.id = id;

        wantsToEnter[0] = false;
        wantsToEnter[1] = false;

    }

    public void run() {
        System.out.println("[" + getName() + "] Started!");

        wantsToEnter[id] = true;

        while (wantsToEnter[ (id+1)%2 ] ) {
            if (turn != 0) {
                wantsToEnter[id] = false;
            }

            while (turn != 0) {
                ;//System.out.println("LOL");
            }
        }

        critical();

        turn = (id+1)%2;
        wantsToEnter[id] = false;

        // remainder section
    }



    void critical() {
        System.out.println("[" + getName() + "] Entering critical section...");
        //busy
        System.out.println("[" + getName() + "] Exiting critical section...");
    }
}
