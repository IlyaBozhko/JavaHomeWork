package Homework;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int addFood;


        Plate plate = new Plate(50);
        plate.info();
        Cat.cats(plate);
        plate.info();
        System.out.println("How much eat should add to the plate?");
        addFood = scanner.nextInt();
        plate.increaseFood(addFood);
        plate.info();
        Cat.cats(plate);
        plate.info();
        System.out.println("How much eat should add to the plate?");
        addFood = scanner.nextInt();
        plate.increaseFood(addFood);
    }
}
