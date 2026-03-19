class Student{
    String name;
    int rollNum;
    int[] marks1;
    int[] marks2;
    int[] marks3;

    Student(String n, int rN, int[] m1, int[] m2, int[] m3){
        name = n;
        rollNum = rN;
        marks1 = m1;
        marks2 = m2;
        marks3 = m3;
    }

    void displayDetails(){
        System.out.println("name "+name);
        System.out.println("rollNum "+rollNum);
        displayMarks(marks1, 1);
        displayMarks(marks2, 2);
        displayMarks(marks3, 3);
    }

    void displayMarks(int[] arr, int subject){
        System.out.println("subject "+subject);
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println("\n");
    }

    void total(){
        System.out.println("total 1) " + calcTotal(marks1));
        System.out.println("total 2) " + calcTotal(marks2));
        System.out.println("total 3) " + calcTotal(marks3));
    }

    int calcTotal(int[] arr){
        int totalAmount = 0;
        for(int i : arr){
            totalAmount += i;
        }
        return totalAmount;
    }

    int calcAvg(int[] arr){
        int total = calcTotal(arr);
        return total/arr.length;
    }

    void average(){
        System.out.println("average 1) " + calcAvg(marks1));
        System.out.println("average 2) " + calcAvg(marks2));
        System.out.println("average 3) " + calcAvg(marks3));
    }
}


public class ClassTask {
    public static void main(String[] args) {
        Student s1 = new Student("Husniddin", 0, new int[]{1, 2, 3, 4}, new int[]{8, 10, 3, 20}, new int[]{1, 12, 3, 34});
        s1.displayDetails();
        s1.average();
        s1.total();
    }
}
