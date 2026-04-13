class Employee{
    String name="few";
    int age=12;

    void showInfo(){
        System.out.println(name + " " + age);
    }
}

class Teacher extends Employee{
    String subject="fqeeq";

    void showInfo(){
        super.showInfo();
        System.out.println("subjcet "+subject);
    }
}

public class Jobs {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.showInfo();
    }
}
