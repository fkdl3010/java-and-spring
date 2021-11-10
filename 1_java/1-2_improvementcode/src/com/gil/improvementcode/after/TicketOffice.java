package com.gil.improvementcode.after;

import java.util.List;

public class TicketOffice {
    private int amount;
    private List<Ticket> tickets;

    public void sellTicketTo(Audience audience){
        this.plusAmount(audience.buy(this.getTicket()));
    }

    public Ticket getTicket(){
        if (this.tickets.size() == 0) {
            return null;
        }
        Ticket ticket = this.tickets.remove(tickets.size() -1);
        return ticket;
    }

    public void minusAmount(int amount){
        this.amount -= amount;
    }

    public void plusAmount(int amount){
        this.amount += amount;
    }

}
