public class Lesson12 {
    public static void main(String[] args) {
        int[][] marks = {
            {78, 85, 90, 88},
            {67, 72, 80, 75},
            {92, 88, 84, 91}
        };

        displayAll(marks);
        total(marks);
        average(marks);
    }

    static void displayAll(int[][] data){
        for(int i = 0; i<data.length; i++){
            System.out.println("Student" + (i  + 1) + " grades:");
            for(int j = 0; j<data[i].length; j++){
                System.out.println("Course " + (j + 1) + ") " + data[i][j]);
            }
            System.out.println();
        }
    }

    static void total(int[][] data){
        for(int i = 0; i<data.length; i++){
            System.out.println("Student" + (i  + 1) + " total:");
            int total = 0;
            for(int j = 0; j<data[i].length; j++){
                total += data[i][j];
            }
            System.out.println(total);
        }
    }

    static void average(int[][] data){
        int average1 = 0;
        int average2 = 0;
        int average3 = 0;
        
        for(int i = 0; i<data.length; i++){
            average1 += data[i][0];
            average2 += data[i][1];
            average3 += data[i][2];
        }  

        System.out.println("Average course 1) " + average1/3);
        System.out.println("Average course 2) " + average2/3);
        System.out.println("Average course 3) " + average3/3);
    }
}


// methdos are shared each other. they will have a refrence of that method.

// packages are like folders.
// java is a root.
// java has a sub-folder called lang, util, ...
// java.lang contains most common classes you don't need to import them.
// java.util you need to import the classes.
// import java.util.Scanner

// local varaiable is inside method.
// field variable is inside class.
