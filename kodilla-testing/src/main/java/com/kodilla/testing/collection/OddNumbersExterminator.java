package com.kodilla.testing.collection;
import java.util.*;

public class OddNumbersExterminator {
    public List<Integer> exterminate (List<Integer> numbers) {
        List<Integer> list2 = new ArrayList<>();
        for(Integer number : numbers)
            if(number % 2 == 0) {
                list2.add(number);
            }
        return list2;
    }

}
