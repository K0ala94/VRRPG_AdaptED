package com.GergoMuller.Swarm;

import hu.bme.aut.adapted.commonlib.annotation.DisplayName;
import hu.bme.aut.adapted.commonlib.annotation.Parameter;

@DisplayName("Endgame statistics")
public class EndGameStatsEvent {

    @Parameter
    @DisplayName("Atlagos Hiba/Runa Tipus")
    private final String avgFaultPerRuneType;
    @Parameter
    @DisplayName("Atlagos Hiba/Runa")
    private final float avgFaultsPerRune;
    @Parameter
    @DisplayName("Atlagos figyelem")
    private final float avgAttention;
    @Parameter
    @DisplayName("Atlagos figyelem hibanal")
    private final float avgAttentionAtFault;
    @Parameter
    @DisplayName("Atlagos nyugalom hibanal")
    private final float avgMeditationAtFault;

    public EndGameStatsEvent(String avgFaultPerRuneType, float avgFaults, float avgAttention,
                             float avgAttentionAtFault, float avgMeditationAtFault){
        this.avgAttention = avgAttention;
        this.avgAttentionAtFault = avgAttentionAtFault;
        this.avgFaultsPerRune = avgFaults;
        this.avgFaultPerRuneType = avgFaultPerRuneType;
        this.avgMeditationAtFault = avgMeditationAtFault;
    }

    public String getAvgFaultPerRuneType() {
        return avgFaultPerRuneType;
    }

    public float getAvgFaultsPerRune() {
        return avgFaultsPerRune;
    }

    public float getAvgAttention() {
        return avgAttention;
    }

    public float getAvgAttentionAtFault() {
        return avgAttentionAtFault;
    }

    public float getAvgMeditationAtFault() {
        return avgMeditationAtFault;
    }
}
