package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

class ButtonTest {

    @Test
    void testClicks() {
        Button button = new Button();
        assertEquals(0, button.getClicks());

        button.click();
        assertEquals(1, button.getClicks());
    }
}

class BalanceTest {

    @Test
    void testBalanceResult() {
        Balance balance = new Balance();
        balance.addLeft(10);
        balance.addRight(5);
        assertEquals("L", balance.result());

        balance.addRight(10);
        assertEquals("R", balance.result());

        balance.addLeft(5);
        assertEquals("=", balance.result());
    }
}

class OddEvenSeparatorTest {

    @Test
    public void testAddEvenNumbers() {
        OddEvenSeparator separator = new OddEvenSeparator();
        separator.addNumber(2);
        separator.addNumber(4);

        assertEquals(Arrays.asList(2, 4), separator.even());
    }

    @Test
    public void testAddOddNumbers() {
        OddEvenSeparator separator = new OddEvenSeparator();
        separator.addNumber(1);
        separator.addNumber(3);

        assertEquals(Arrays.asList(1, 3), separator.odd());
    }

    @Test
    public void testAddMixedNumbers() {
        OddEvenSeparator separator = new OddEvenSeparator();
        separator.addNumber(1);
        separator.addNumber(2);
        separator.addNumber(3);
        separator.addNumber(4);

        assertEquals(Arrays.asList(2, 4), separator.even()); // Проверяем четные числа
        assertEquals(Arrays.asList(1, 3), separator.odd()); // Проверяем нечетные числа
    }
}

class TableTest {

    @Test
    public void testTableInitialization() {
        Table table = new Table(2, 2); // 2x2 таблица

        // Все значения по умолчанию должны быть равны 0
        assertEquals(0, table.getValue(0, 0));
        assertEquals(0, table.getValue(0, 1));
        assertEquals(0, table.getValue(1, 0));
        assertEquals(0, table.getValue(1, 1));
    }

    @Test
    public void testSetAndGetValue() {
        Table table = new Table(3, 3); // 3x3 таблица

        table.setValue(1, 1, 42);
        assertEquals(42, table.getValue(1, 1)); // Проверяем, что значение правильно установлено
    }

    @Test
    public void testAverageValue() {
        Table table = new Table(2, 2);
        table.setValue(0, 0, 10);
        table.setValue(0, 1, 20);
        table.setValue(1, 0, 30);
        table.setValue(1, 1, 40);

        assertEquals(25.0, table.average(), 0.01); // Проверяем среднее арифметическое
    }

    @Test
    public void testTableToString() {
        Table table = new Table(2, 2);
        table.setValue(0, 0, 1);
        table.setValue(0, 1, 2);
        table.setValue(1, 0, 3);
        table.setValue(1, 1, 4);

        String expectedOutput = "[1, 2]\n[3, 4]\n";
        assertEquals(expectedOutput, table.toString());
    }
}
