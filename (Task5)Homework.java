public class Homework {
    public static void main(String[] args) {

        Worker[] workers = new Worker[5];

        workers[0] = new Worker("Ivan", "Hmelnitsky", "Manager", "golub666@yanex.ru",54334231,23000,42);
        workers[1] = new Worker("Stepan", "Zakvaskin", "metalworker", "kvas666@yanex.ru",4324123,42000,42 );
        workers[2] = new Worker("Fedor", "Pivovarov", "fitter", "pivo666@yanex.ru", 53412312,23555,24);
        workers[3] = new Worker("Anton", "Pshenichny", "plumber", "zerno666@yanex.ru",41232414,23412,34 );
        workers[4] = new Worker("Zahar", "Melnikov", "electrician", "muka666@yanex.ru",124352341,32512,45 );

        for (int i = 0; i < 5; i++){
        if (workers[i].getAge() > 40)
            System.out.println(workers[i].getName());
}
    }
}
