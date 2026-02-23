import java.util.Scanner;

class Lesson8 {
    public static void main(String[] args) {
        
        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter a number: ");
        // int num = sc.nextInt();
        // System.out.println("Enter a word and a text: ");
        // String word = sc.next();
        // String text = sc.nextLine();

        
        // System.out.println("num: " + num);
        // System.out.println("word: " + word);
        // System.out.println("text: " + text);

        // sc.close();


        String s = "Let us extract substring";

        String j = s.substring(7);  // begining
        System.out.println(j);
        String k = s.substring(0, 7);
        System.out.println(k);

        String s1 = "Hello ";
        String s2 = "World ";
        System.out.println(s1+s2+2);
        s1 = "Bye";
        System.out.println(s1);
        // if we have one string operand java will convert other string if possible.

        String t1 = new String("Hello World");
        String t2 = new String("Hello");

        System.out.println(t1.equals(t2)); // it will check content
        System.out.println(t1==t2); // it will check refrence
    }
}

// Input and output

// System.in -> Input Stream class.
// System.out -> Print Stream class. println is method

// keyboard -> os -> keyboard buffer -> active window

// When data comes system.in will recieve. 
// That data is raw bytes.
// Scanner will format that data. It will parse and converts it.

// sc.close(); we finished using scanner and we empty the memory.


// nextInt()
// nextDouble()
// nextBoolean()
// nextLine() -> full sentence
// next() -> single word

// println() -> cursor in new line
// prin() -> cursor in the same line


// Common classes automaticaly be used. You don't need to import them.

// String is a class
// String text = ""; It will create a new string object.

// Sting is a collection of unicode character sequence
// Strings are immutable
// Create a string using constructor:
// String s = new String("");

// extracting substrings

// substring(int) begining indexes
// substring(int, int) begining and end indexes

// they will return java.lang.String. It is just string.

// If string object has the same content java will create one object for all of them.

// String s = new String(""); -> creates an empty object.
// String t = null; -> Does not create an object.