package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Button but1 = new Button(15);

        Button but2 = new Button();

        System.out.println(but2.getClicks());

        for (int i = 0; i < 10; i++) {
            but1.click();
            System.out.println(but1.getClicks());
        }
        but1.setClicks(46);
        System.out.println(but1.getClicks());
    }
}