package Homework;

public class Dog extends Animals {
    public Dog(String name, int age, int maxRun, int maxSwim) {
        this.name = name;
        this.age = age;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;

        if (maxRun <= 500){
            System.out.println(name + " пробежала " + maxRun + " метров");
        }
        if (maxRun > 500){
            System.out.println(name + " не может больше бежать");
        }
        if (maxSwim <= 10){
            System.out.println(name + " проплыла " + maxSwim + " метров");
        }
        if (maxSwim > 10){
            System.out.println(name + " не может больше плыть");
        }
    }
}
