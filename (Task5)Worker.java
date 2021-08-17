public class Worker {

    private String firstName;
    private String lastName;
    private String post;
    private String email;
    private String phone;
    private String pay;
    private String age;


    public Worker(String firstName, String lastName, String post, String email, String phone, String pay, String age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.pay = pay;
        this.age = age;

    }

    public void info(){
        System.out.println(firstName + " " + lastName + " " + post + " " + email + " " + phone + " " + pay + " " + age);
    }

    public void object() {

        Worker[] persArray = new Worker[5];
        persArray[0] = new Worker("Ivan","Hmelnitsky","Manager","golub666@yanex.ru","8917666666","30000","32");
        persArray[1] = new Worker("Stepan","Zakvaskin","metalworker","kvas666@yanex.ru","8917652342","35000","22");
        persArray[2] = new Worker("Fedor","Pivovarov","fitter","pivo666@yanex.ru","8917432346","31000","35");
        persArray[3] = new Worker("Anton","Pshenichny","plumber","zerno666@yanex.ru","8912345266","20000","42");
        persArray[4] = new Worker("Zahar","Melnikov","electrician","muka666@yanex.ru","89175323166","20000","47");

    }


}


