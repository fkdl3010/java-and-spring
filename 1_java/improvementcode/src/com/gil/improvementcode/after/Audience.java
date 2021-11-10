package com.gil.improvementcode.after;

public class Audience {

    private final Bag bag;

    public Audience (Bag bag){
        this.bag = bag;
    }

    public int buy(Ticket ticket) {
        return this.bag.hold(ticket);
    }

}
