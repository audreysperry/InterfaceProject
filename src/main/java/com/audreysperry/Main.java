package com.audreysperry;

import com.audreysperry.Models.ArmySoldier;
import com.audreysperry.Models.MarineSoldier;

public class Main {
    public static void main(String[] args) {
        ArmySoldier chad = new ArmySoldier();
        System.out.println(chad.bomb());
        chad.makeBomb();
        System.out.println(chad.explosiveBomb());
        System.out.println(chad.speak());

        MarineSoldier eric = new MarineSoldier();
        System.out.println(eric.shoot());
        System.out.println(eric.speak());
        System.out.println(eric.explosiveBomb());
    }
}
