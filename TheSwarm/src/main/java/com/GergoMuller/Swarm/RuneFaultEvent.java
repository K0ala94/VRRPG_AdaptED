package com.GergoMuller.Swarm;

import hu.bme.aut.adapted.commonlib.annotation.DisplayName;
import hu.bme.aut.adapted.commonlib.annotation.Parameter;

@DisplayName("Rajzolas Hiba")
public class RuneFaultEvent {

    @Parameter
    private final int faultCount;

    @Parameter
    private final String runeType;


    public RuneFaultEvent(int faultCount, String runeType){
        this.faultCount = faultCount;
        this.runeType = runeType;
    }

    public int getFaultCount(){
        return faultCount;
    }

    public String getRuneType(){
        return runeType;
    }
}
