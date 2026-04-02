import java.util.Scanner;

interface Person{
    void setDetails();
    void getDetails();
}

class Student implements Person{
    int id;
    String name;
    String major;
    String contact;

    

    public void setDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("id");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("name");
        name = sc.nextLine();
        System.out.println("major");
        major = sc.nextLine();
        System.out.println("Contact");
        contact = sc.nextLine();

        //st.close();
    }

    public void getDetails() {
        System.out.println("id: " + id);
        System.out.println("name: " + name);
        System.out.println("major: " + major);
        System.out.println("contact: " + contact);
    }
}

class Teacher implements Person{
    int id;
    String name;
    String department;

    

    public void setDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("id");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("name");
        name = sc.nextLine();
        System.out.println("department");
        department = sc.nextLine();
    }

    public void getDetails() {
        System.out.println("id: " + id);
        System.out.println("name: " + name);
        System.out.println("department: " + department);
    }
}

class DataInterface<T extends Person> {

    T obj;

    DataInterface(T o){
        obj = o;
    }

    void setDetails(){
        obj.setDetails();
    }

    void getDetails(){
        obj.getDetails();
    }
}

public class School {
    public static void main(String[] args) {
        DataInterface<Teacher> s1 = new DataInterface<>(new Teacher());
        s1.setDetails();
        s1.getDetails();

        DataInterface<Student> s2 = new DataInterface<>(new Student());
        s2.setDetails();
        s2.getDetails();
    }
}