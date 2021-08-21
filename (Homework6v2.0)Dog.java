package Code;

public class Dog extends Animals {
    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void Run(int maxRun) {
        if ((maxRun >= 0) && (maxRun <= 500))
            System.out.println(name + " Пробежал " + maxRun + " Метра");
        else {
            System.out.println(name + " Не может столько пробежать ");
        }
    }

    @Override
    public void Swim(int maxSwim){
        if ((maxSwim >= 0) && (maxSwim <= 10))
            System.out.println(name + " проплыл " + maxSwim + " Метра");
        else {
            System.out.println(name + " Не может столько проплыть");
        }
    }
}