package Code;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Barsik");
        Dog dog = new Dog("Bobik");

        cat.Run(23);
        cat.Swim(53);
        dog.Run(346);
        dog.Swim(521);
    }
}
