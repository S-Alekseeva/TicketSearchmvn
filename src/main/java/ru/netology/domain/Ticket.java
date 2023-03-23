package ru.netology.domain;

public class Ticket implements Comparable<Ticket> {

    public Ticket(int id, int price, int time, String from, String to) {
        this.id = id;
        this.price = price;
        this.time = time;
        this.from = from;
        this.to = to;
    }

    private int id;
    private int price;
    private int time;

    private String from;
    private String to;

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public void setTime(int time) {
        this.time = time;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public int getTime() {
        return time;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    @Override
    public int compareTo(Ticket o) {
        if (this.price < o.price) {
            return -1;
        } else if (this.price > o.price) {
            return 1;
        } else {
            return 0;
        }
    }
}
