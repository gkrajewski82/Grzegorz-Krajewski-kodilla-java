package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    List<Integer> evenNumbersList = new ArrayList<>();

    public List<Integer> exterminate(List<Integer> numbers) {
        for (int i=0; i<numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                evenNumbersList.add(i);
            }
        }
        return evenNumbersList;
    }
}
