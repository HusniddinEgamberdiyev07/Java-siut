import java.util.Scanner;

class Student {
    int id;
    String name;
    String major;
    String contact;

    void setDetails() {
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

        sc.close();
    }

    void getDetails() {
        System.out.println("id: " + id);
        System.out.println("name: " + name);
        System.out.println("major: " + major);
        System.out.println("contact: " + contact);
    }
}

class Teacher {
    int id;
    String name;
    String department;

    void setDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.println("id");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("name");
        name = sc.nextLine();
        System.out.println("department");
        department = sc.nextLine();

        sc.close();
    }

    void getDetails() {
        System.out.println("id: " + id);
        System.out.println("name: " + name);
        System.out.println("department: " + department);
    }
}

class DataInterface<T> {

    T obj;

    DataInterface(T o){
        obj = o;
    }

    T RunMethods() {
        return obj;
    }
}

public class School {
    public static void main(String[] args) {
        DataInterface<Teacher> s1 = new DataInterface<>(new Teacher());
        s1.RunMethods().setDetails();
        s1.RunMethods().getDetails();
        //200 lines of code (5 roles)
    }
}
