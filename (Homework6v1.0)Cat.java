package Homework;

public class Cat extends Animals {
    public Cat(String name, int age,int maxRun, int maxSwim) {
        this.name = name;
        this.age = age;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;

        if (maxRun < 200){
            System.out.println(name + " пробежал " + maxRun + " метров");
        }
        if (maxRun > 200){
            System.out.println(name + " не может больше бежать");
        }
        if (maxSwim > 0){
            System.out.println(name + " не умеет плавать");
        }
    }

}
