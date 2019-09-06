package com.xyzcompany.bowling.model;

public class BowlingGame {
    private static final int TOTAL_FRAMES = 10;

    private final BowlingGameId gameId;
    private final int[] rolls = new int[21];
    private int current =0;

    private BowlingGame(BowlingGameId gameId){
        this.gameId = gameId;
    }

    private static BowlingGame createNewGame(BowlingGameId gameId)
    {
        return new BowlingGame(gameId);
    }

    public void roll(int numberOfPins){
        rolls[current++] = numberOfPins;
    }

    private boolean isStroke(int frame){
        return rolls[frame] ==10;
    }

    private boolean isSpare(int frame){
        return rolls[frame] + rolls[frame+1] == 10;
    }

    private int strikeBonus(int frameIndex){
        return rolls[frameIndex + 1] + rolls[frameIndex + 2];
    }

    private int spareBonus(int frame){
        return rolls[frame+2];
    }
}
