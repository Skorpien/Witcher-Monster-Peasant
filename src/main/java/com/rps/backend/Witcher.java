package com.rps.backend;

import lombok.Getter;

@Getter
public class Witcher extends Hand {

    private String beats = "Potworyr";

    @Override
    public String showHand() {
        return "Wiedżmin zasiekuje potworyra";
    }


    @Override
    public String toString() {
        return "Wiedźmin";
    }
}
