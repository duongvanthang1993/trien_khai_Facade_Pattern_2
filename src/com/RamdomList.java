package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RamdomList {
    public List<Integer> generateList(int size, int bount) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(bount));
        }
        return list;
    }

}