package com.rps.backend;

import lombok.Getter;

@Getter
public class Hand {

    private String beats;
    private String isBeaten;

    public String showHand() {
        return "";
    }
}
