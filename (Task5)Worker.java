public class Worker {

    private String firstName;
    private String lastName;
    private String post;
    private String email;
    private int phone;
    private int pay;
    private int age;

    public Worker(String firstName, String lastName, String post, String email, int phone, int pay, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.pay = pay;
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return firstName + lastName;
    }

}
