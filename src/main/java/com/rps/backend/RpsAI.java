package com.rps.backend;

import java.util.Random;

public class RpsAI {

    public Hand randomize() {
        Hand hand;
        Random random = new Random();
        int r = random.nextInt(3);
        switch (r) {
            case 0:
                hand = new Witcher();
                break;
            case 1:
                hand = new Monster();
                break;
            case 2:
                hand = new Peasant();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + r);
        }
        return hand;
    }
}
