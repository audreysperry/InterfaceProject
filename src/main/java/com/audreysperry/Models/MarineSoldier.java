package com.audreysperry.Models;

import com.audreysperry.Interfaces.BombFactory;
import com.audreysperry.Interfaces.Punch;
import com.audreysperry.Interfaces.Shoot;

public class MarineSoldier extends Soldier implements Shoot, Punch, BombFactory {
    public String shoot() {
        return "POP";
    }

    public String punch() {
        return "POW";
    }

    public String speak() {
        return "oohrah";
    }

    @Override
    public String bomb() {
        return null;
    }

    public String explosiveBomb() {
        return "BOWWWWBAM";
    }
}
