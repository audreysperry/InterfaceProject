package com.audreysperry.Models;

import com.audreysperry.Interfaces.Bomb;
import com.audreysperry.Interfaces.BombFactory;
import com.audreysperry.Interfaces.Punch;

public class ArmySoldier extends Soldier implements Bomb, Punch, BombFactory{
    public String bomb() {
        return "BOOOOOOM";
    }

    public String punch() {
        return "POWW";
    }

    public String speak() {
        return "Hoaaah";
    }

}
