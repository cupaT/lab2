package org.example;

import org.example.exceptions.ClassNotLoadedException;
import org.example.geometry2d.Circle;
import org.example.geometry2d.Rectangle;
import org.example.geometry3d.Cylinder;
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


    @Test
    public void testAddEvenNumbers() {
        OddEvenSeparator separator = new OddEvenSeparator();
        separator.addNumber(2);
        separator.addNumber(4);

        try {
            assertEquals(Arrays.asList(2, 4), separator.even());
        } catch (ClassNotLoadedException e) {
            fail("Even Error");
        }
    }

    @Test
    public void testAddOddNumbers() {
        OddEvenSeparator separator = new OddEvenSeparator();
        separator.addNumber(1);
        separator.addNumber(3);

        try {
            assertEquals(Arrays.asList(1, 3), separator.odd());
        } catch (ClassNotLoadedException e) {
            fail("Odd Error");
        }
    }

    @Test
    public void testAddMixedNumbers() {
        OddEvenSeparator separator = new OddEvenSeparator();
        separator.addNumber(1);
        separator.addNumber(2);
        separator.addNumber(3);
        separator.addNumber(4);

        try {
            assertEquals(Arrays.asList(2, 4), separator.even());
        } catch (ClassNotLoadedException e) {
            fail("Even Error");
        }

        try {
            assertEquals(Arrays.asList(1, 3), separator.odd());
        } catch (ClassNotLoadedException e) {
            fail("Odd Error");
        }
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

class GeometryTest {

    @Test
    public void testCircleArea() {
        Circle circle = new Circle(5);
        assertEquals(78.5398, circle.area(), 0.0001);
    }

    @Test
    public void testCircleToString() {
        Circle circle = new Circle(5);
        assertEquals("Circle with radius 5.0", circle.toString());
    }

    @Test
    public void testRectangleArea() {
        Rectangle rectangle = new Rectangle(2, 3);
        assertEquals(6, rectangle.area(), 0.0001);
    }

    @Test
    public void testRectangleToString() {
        Rectangle rectangle = new Rectangle(2, 3);
        assertEquals("Rectangle with width 2.0 and height 3.0", rectangle.toString());
    }

    @Test
    public void testCylinderVolume() {
        Circle circle = new Circle(3); // Основание цилиндра - круг с радиусом 3
        Cylinder cylinder = new Cylinder(circle, 10); // Высота цилиндра - 10
        assertEquals(282.7433, cylinder.volume(), 0.0001);
    }

    @Test
    public void testCylinderToString() {
        Rectangle rectangle = new Rectangle(2, 3);
        Cylinder cylinder = new Cylinder(rectangle, 5);
        assertEquals("Cylinder with base Rectangle with width 2.0 and height 3.0 and height 5.0", cylinder.toString());
    }
}
