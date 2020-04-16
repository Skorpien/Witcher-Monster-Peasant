package com.rps.backend;

import lombok.Getter;

@Getter
public class ToView {

    private CheckHand checkHand = new CheckHand();
    private String youAre;
    private String compIs;


    public String passToView(Hand myHand) {
        youAre = "Postawnowiłeś zostać " + myHand.toString() + "em";
        RpsAI rpsAI = new RpsAI();
        Hand compHand = rpsAI.randomize();
        compIs = "Komputer jest " + compHand.toString() + "em";
        return checkHand.handChecker(myHand, compHand);
    }
}
