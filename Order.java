package com.company;

public class Order<T> {
    private Order2Linked data;

    public Order() {
        this.data = new Order2Linked();
    }

    public void add(Item item) {
        data.addLast(item);
    }

}
