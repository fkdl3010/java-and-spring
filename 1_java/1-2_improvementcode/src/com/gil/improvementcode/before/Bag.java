package com.gil.improvementcode.before;

public class Bag {

    private int amount;
    private Invitation invitation;
    private Ticket ticket;

    public int hold(Ticket ticket){
        if (this.hasInvitation()) {
            this.setTicket(ticket);
            return 0;
        } else {
            this.setTicket(ticket);
            this.minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public boolean hasInvitation(){
        return this.invitation != null;
    }

    public void minusAmount(int amount){
        this.amount -= amount;
    }

}
