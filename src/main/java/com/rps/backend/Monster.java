package com.rps.backend;

import lombok.Getter;

@Getter
public class Monster extends Hand {

    private String beats = "Chłop";

    @Override
    public String showHand() {
        return "Potworyr zjada Chłopa";
    }


    @Override
    public String toString() {
        return "Potworyr";
    }
}
