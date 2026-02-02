class Lesson2 {
    public static void main(String[] args){
        // byte, small, int, long
        // float, double
        // char, string
        // var
        // boolean -> true, false

        int num1 = 1;
        int num2 = 4;
        final float PI = 3.14f;     // this is constant
        double money = 90.12864821d;
        boolean canFly = true;
        char myGrade = 'F';
        String txt = "This is a text";
        var dunno = "dunno";

        int small = 21353;
        long big = small;

        float decimal_number = 12.12f;
        int whole_number = (int) decimal_number;
        
        int[] nums = {1, 2, 3, 4, 5, 6,};
        
        if(num2 % 2 == 0){
            System.out.println("It is even");
        }else{
            System.out.println("It is odd");
        }

        for(int i =0; i<nums.length; i++){
            System.out.println(i);
        }

        System.out.println("Hello lesson2");
        System.out.println("Hello there");
        System.out.println(num1 + num2);
        System.out.println(decimal_number);
        System.out.println(whole_number);
        System.out.println(big);



        String txt2 = "i am lower    ";
        String txt3 = "Hello ";
        txt2 = txt2.toUpperCase();
        System.out.println(txt2);
        txt2 = txt2.toLowerCase();
        System.out.println(txt2);
        System.out.println(txt2.indexOf("lower"));
        System.out.println(txt2.charAt(2));
        System.out.println(txt2.equals("i am lower"));
        System.out.println(txt2.trim() + " bye");
        System.out.println(txt3.concat(" World"));
    }
}

// Java is high level language
// James Gosling was the creator in 1991
// Original language name was OAK
// Write once run anywhere
// Java is both software platform (allows to run apps) and programming language
// Java has a lot of libraries
// Java has automatic garbage collection

// Main.java is command line argument

// .java -> byte code (java compiler) -> native code (jvm)

// If we have different cpus we need the same compiler and different jvm

// jvm calls main method when it is running.

// public -> access specifier, any code can access even another program.
// We made main method public because jvm needs to access.

// static -> means before Lesson2 object created method main will be created even we don't have Lesson2.
// void -> nothing returning. Method main can have only have void.
// String[] args -> it is for inputs.

// System is a class, out is an object, println is a method