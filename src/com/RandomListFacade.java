package com;

import java.util.List;
import java.util.Random;

public class RandomListFacade {
    private RamdomList randomList;
    private ListFilter listFilter;
    private ListPrinter listPrinter;

    public RandomListFacade() {
        this.randomList = new RamdomList();
        this.listFilter = new ListFilter();
        this.listPrinter = new ListPrinter();
    }

    public void printRandomEvenList(int size, int bound) {
        List<Integer> numbers = randomList.generateList(size, bound);
        System.out.println("danh sach ban dau: " + numbers);

        List<Integer> evenNumbers = listFilter.filterOdd(numbers);

        listPrinter.printList(evenNumbers);
    }

}
