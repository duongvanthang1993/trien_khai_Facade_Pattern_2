package com;

import java.util.ArrayList;
import java.util.List;

public class ListFilter {
    public List<Integer> filterOdd(List<Integer> list) {
        List<Integer> evenlist = new ArrayList<>();
        for (Integer number : list) {
            if (number % 2 == 0) {
                evenlist.add(number);
            }
        }
        return evenlist;
    }

}
