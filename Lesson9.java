import java.util.Scanner;

class StudentResults {


    Scanner sr = new Scanner(System.in);

    String sName = sr.next();
    int sID = sr.nextInt();
    int m1 = sr.nextInt();
    int m2 = sr.nextInt();
    int m3 = sr.nextInt();

    int total;
    int average;

    void calc(){
        total = m1+m2+m3;
        average = total/3;
    }

    void info(){
        System.out.println("sName " + sName);
        System.out.println("sID " + sID);
        System.out.println("total " + total);
        System.out.println("avg " + average);
    }

    void mark(){
        if(average>=60){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
    }
}








public class Lesson9 {
    public static void main(String[] args) {
        // Arrays

        // Arrays are objects
        // Data type must be the same and they are semanticly same.

        // datatype[] -> to create an array.

        // declaration->creation in memory->intialition putting value

        int[] nums = {1, 2, 3};

        // array is fixed size
        // indexed
        // all elements same type
        // stored in contiguous memory

        // declaration:

        // it will create a refrence variable

        int[] nums2;
        int nums3[];

        // declaration + creation

        // creating object and telling I need 3 int space

        int[] nums4 = new int[3];   // 3 is size

        nums2 = new int[4];     // array creation
        // nums2 = [1, 2, 3, 4]; 




        int[] numbers; // I am declaring refrence variable
        numbers = new int[4]; // creating object with 4 data size

        numbers[0] = 30; // giving values
        numbers[1] = 40;
        numbers[2] = 20;
        numbers[3] = 1;



        int sum = numbers[0];
        int highest = numbers[0];
        int lowest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            sum+=numbers[i];

            if(highest<numbers[i]){
                highest=numbers[i];
            }
            if(lowest>numbers[i]){
                lowest=numbers[i];
            }
        }

        int average = sum/numbers.length;

        System.out.println("Average " + average);
        System.out.println("Total " + sum);

        System.out.println(highest);
        System.out.println(lowest);



        // Activity 1
        StudentResults s1 = new StudentResults();
        s1.calc();
        s1.info();
        s1.mark();
    }
}

// asymptotic analysis