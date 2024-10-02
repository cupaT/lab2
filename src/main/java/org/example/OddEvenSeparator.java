package org.example;

import java.util.ArrayList;
import java.util.List;

import org.example.exceptions.ClassNotLoadedException;


public class OddEvenSeparator {
    private final List<Integer> evenNumbers = new ArrayList<>();
    private final List<Integer> oddNumbers = new ArrayList<>();

    public void addNumber(int number) {
        if (number % 2 == 0) {
            evenNumbers.add(number);
        } else {
            oddNumbers.add(number);
        }
    }

    public List<Integer> even() throws ClassNotLoadedException {
        if (evenNumbers.isEmpty()) {
            throw new ClassNotLoadedException("No even numbers added!");
        }
        return evenNumbers;
    }

    public List<Integer> odd() throws ClassNotLoadedException {
        if (oddNumbers.isEmpty()) {
            throw new ClassNotLoadedException("No odd numbers added!");
        }
        return oddNumbers;
    }
}
