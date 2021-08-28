package Homework;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int a) {
        food -= a;
    }

    public void increaseFood(int b) {
        food += b;
    }

    public void info() {
        System.out.printf("Eat in plate [ Food %d ]\n", +food);
    }
}