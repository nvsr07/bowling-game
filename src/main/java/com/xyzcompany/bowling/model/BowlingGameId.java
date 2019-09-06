package com.xyzcompany.bowling.model;

import java.util.concurrent.atomic.AtomicInteger;

public class BowlingGameId {

    private static final AtomicInteger ATOMIC_INTEGER_GENERATOR = new AtomicInteger();

    private int id;

    public BowlingGameId(int id){
        this.id = id;
    }

    public static BowlingGameId generate(){
        return new BowlingGameId(ATOMIC_INTEGER_GENERATOR.incrementAndGet());
    }

    public static BowlingGameId generateFrom(int gameId){
        return new BowlingGameId(gameId);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
