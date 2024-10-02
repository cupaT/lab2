package org.example;

import org.example.exceptions.ClassNotLoadedException;
import org.example.geometry2d.Circle;
import org.example.geometry2d.Rectangle;
import org.example.geometry3d.Cylinder;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //1
        System.out.println("\nFirst number:\n");

        Button but1 = new Button(15);
        System.out.println(but1.getClicks());

        for (int i = 0; i < 10; i++) {
            but1.click();
            System.out.println(but1.getClicks());
        }
        but1.setClicks(46);
        System.out.println(but1.getClicks());

        // 2
        System.out.println("\nSecond number:\n");

        Balance balance = new Balance();
        balance.addLeft(10);
        balance.addRight(20);
        System.out.println(balance.result());

        balance.addLeft(15);
        System.out.println(balance.result());

        balance.addRight(5);
        System.out.println(balance.result());

        // 3
        System.out.println("\nThird number:\n");

        Bell bell = new Bell();
        bell.sound();
        bell.sound();
        bell.sound();

        // 4
        System.out.println("\nFourth number:\n");

        OddEvenSeparator separator = new OddEvenSeparator();
        separator.addNumber(3);
        separator.addNumber(4);
        separator.addNumber(7);
        separator.addNumber(8);
        try {
            System.out.println("Even numbers: " + separator.even());
            System.out.println("Odd numbers: " + separator.odd());
        } catch (ClassNotLoadedException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // 5
        System.out.println("\nFifth number:\n");

        Table table = new Table(3, 3); // 3x3 table
        table.setValue(0, 0, 10);
        table.setValue(1, 1, 20);
        table.setValue(2, 2, 30);
        System.out.println("Table value at (1, 1): " + table.getValue(1, 1));
        System.out.println("Average value in table: " + table.average());
        System.out.println("Table:\n" + table);

        //6
        System.out.println("\nnSixth number:\n");

        Circle circle = new Circle(5);
        System.out.println("Circle area: " + circle.area());
        System.out.println(circle.toString());

        Rectangle rectangle = new Rectangle(2, 3);
        System.out.println("Rectangle area: " + rectangle.area());
        System.out.println(rectangle.toString());

        Cylinder cylinderWithCircle = new Cylinder(circle, 10);
        System.out.println("Cylinder volume with circle base: " + cylinderWithCircle.volume());
        System.out.println(cylinderWithCircle.toString());

        Cylinder cylinderWithRectangle = new Cylinder(rectangle, 10);
        System.out.println("Cylinder volume with rectangle base: " + cylinderWithRectangle.volume());
        System.out.println(cylinderWithRectangle.toString());
    }

}