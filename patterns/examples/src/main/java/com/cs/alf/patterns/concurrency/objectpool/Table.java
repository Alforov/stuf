package com.cs.alf.patterns.concurrency.objectpool;

/**
 * Created by mikhail_alferov on 06.04.2017.
 */
public class Table {
    private String numberOfTable;
    private Order currentOrder;

    public Table(String numberOfTable) {
        this.numberOfTable = numberOfTable;
    }

    public String getNumberOfTable() {
        return numberOfTable;
    }

    public void setNumberOfTable(String numberOfTable) {
        this.numberOfTable = numberOfTable;
    }

    public Order getCurrentOrder() {
        return currentOrder;
    }

    public void setCurrentOrder(Order currentOrder) {
        this.currentOrder = currentOrder;
    }
}
