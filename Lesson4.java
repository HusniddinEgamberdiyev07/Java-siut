public class Lesson4{
    public static void main(String[] args){

        
        // Integers

        System.out.println("int byte "+ Integer.BYTES);
        System.out.println("int min "+ Integer.MIN_VALUE);
        System.out.println("int max "+ Integer.MAX_VALUE);

        System.out.println(0x20);       // hexadecimal (0x)
        System.out.println(040);        // octal (0)
        System.out.println(0b100000);   // binary (0b)

        System.out.println(Integer.toBinaryString(32));
        System.out.println(Integer.toHexString(32));
        System.out.println(Integer.toOctalString(32));



        // Floating

        System.out.println("float byte "+ Float.BYTES);
        System.out.println("float min "+ Float.MIN_VALUE);
        System.out.println("float max "+ Float.MAX_VALUE);

        int f = (int) 3.14f;
        System.out.println(f);

        float f2 = 3;
        System.out.println(f2);

        // float f3 = 3.14; it is error double to float




        // Character

        System.out.println("Char bytes "+Character.BYTES);

        // char->single quotes

        char tm= '\u2122';
        System.out.println(tm);

        char pi= '\u03C0';
        System.out.println(pi);




        // Boolean

        // We can  assign true or false

        boolean b = 5<10;
        System.out.println(b);


        // Variable name starts with letter
        // Can contain _ or $

        // Const variable

    }
}

// 11 can be text or number
// if it is text it will be like 1 and 1 not 11

// Every types represented different types

// Java has 8 primitive data types

// integers (4), floating (2), character type (1), Boolean type (1)

// inetgers:
// long (8 bytes)
// int (4 bytes)
// short (2 bytes)
// byte (1 byte)


// floating
// float (4 bytes)
// double (8 bytes)


// literals exact value 5
// expression 5+12

