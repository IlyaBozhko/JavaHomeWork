package Homework;

public class Cat {
    private final String name;
    private int appetite;
    private boolean hungry;

    public Cat(String name, int appetite, boolean hungry) {
        this.name = name;
        this.appetite = appetite;
        this.hungry = hungry;
    }

    public static void cats(Plate plate){
        Cat[] Cats = new Cat[5];
        Cats[0] = new Cat("Faza", 4, false);
        Cats[1] = new Cat("Optron", 5, false);
        Cats[2] = new Cat("Duga", 6, false);
        Cats[3] = new Cat("Simistor", 7, false);
        Cats[4] = new Cat("Varistor", 30, false);

        for (Cat cat : Cats) {
            if (!cat.getHungry() && cat.getAppetite() < plate.getFood()) {
                cat.eat(plate);
                cat.setHungry(true);
                System.out.println("Cat " + cat.getName() + " Is eat");
            } else {
                System.out.println("Cat " + cat.getName() + " Is not eat");
                cat.setAppetite(cat.appetite*2);
                cat.setHungry(false);
                System.out.println("Cat " + cat.getName() + " Is hungry");
            }
        }
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean getHungry() {
        return hungry;
    }

    public void eat(Plate plate) {
        plate.decreaseFood(appetite);
    }
}

