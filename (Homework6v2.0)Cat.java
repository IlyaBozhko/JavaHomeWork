package Code;

public class Cat extends Animals {
    public Cat(String name) {
        this.name = name;

    }

    @Override
    public void Run(int maxRun) {
        if ((maxRun >= 0) && (maxRun <= 200))
            System.out.println(name + " Пробежал " + maxRun + " Метра");
        else {
            System.out.println(name + " Не может столько пробежать");
        }
    }

    @Override
    public void Swim(int maxSwim) {
        if (maxSwim >= 0)
            System.out.println(name + " Не умеет плавать ");
    }
}
