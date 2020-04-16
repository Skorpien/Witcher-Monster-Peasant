package com.rps.backend;

public class CheckHand {

    public String handChecker(Hand myHand, Hand compHand) {
        String result;
        if(myHand.toString().equals(compHand.toString())) {
            result = draw(myHand);
        } else {
            result = whoWin(myHand, compHand);
        }
        return result;
    }

    private String whoWin(Hand myHand, Hand compHand) {
        String result;
        if(compHand.toString().equals(myHand.getBeats())) {
            result = myHand.showHand() + " - WYGRAŁEŚ!";
        } else {
            result = compHand.showHand() + " - PRZEGRANA...";
        }
        return result;
    }

    private String draw(Hand myHand) {
        String result = myHand.toString() + " i " + myHand.toString();
        if(myHand.getClass().equals(Witcher.class))
           result = result.concat(" razem pijo");
        if(myHand.getClass().equals(Monster.class))
            result = result.concat(" razem łowio");
        if(myHand.getClass().equals(Peasant.class))
            result = result.concat(" razem orajo pole");

        return "REMIS - " + result;
    }
}
