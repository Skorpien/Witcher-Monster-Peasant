package com.rps.backend;

import lombok.Getter;

@Getter
public class Peasant extends Hand {

    private String beats = "Wiedźmin";

    @Override
    public String showHand() {
        return "Chłop nadziewa na widły Wiedżmina";
    }


    @Override
    public String toString() {
        return "Chłop";
    }
}
