package com.audreysperry.Interfaces;

import com.audreysperry.Models.BigBomb;

public interface BombFactory extends Bomb {

    default public Bomb makeBomb() {
        BigBomb explosiveBomb = new BigBomb();
        return explosiveBomb;
    }

    default public String explosiveBomb() {
        return "CRAZY LOAD BOOM";
    }
}
