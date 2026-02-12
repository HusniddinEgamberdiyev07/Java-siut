public class Lesson5{
    public static void main(String[] args){
        int num_int = 9 / 2;    // 4
        float num_f_i = 9/2;    // 4.0
        float num_float = 9 / 2.0f;   // 4.5
        float num_float2 = (float) 9 / 2;   // 4.5

        System.out.println(num_int);
        System.out.println(num_f_i);
        System.out.println(num_float);
        System.out.println(num_float2);

        int a  = 5;
        int b = a++;
        System.out.println("a " + a);
        System.out.println("b "+ b);

        int a_m  = 5;
        int b_m = a_m--;
        System.out.println("a_m "+a_m);
        System.out.println("b_m "+b_m);

        int a2  = 5;
        int b2 = ++a2;
        System.out.println("a2 " + a2);
        System.out.println("b2 "+ b2);

        int a_m2  = 5;
        int b_m2 = --a_m2;
        System.out.println("a_m2 "+a_m2);
        System.out.println("b_m2 "+b_m2);

        System.out.println(Integer.toBinaryString(-4));
        System.out.println(Integer.toBinaryString(5));
        System.out.println(Integer.toBinaryString(4 << 1));

        System.out.println(4 << 1); // left shift removes from start and add one zero  at the end. Multipy by 2.

        System.out.println(6 >> 1); // divide it by 2. Add 1 in the start
        // 32->16->8->4->2->1
        System.out.println(-2147483648 >> 1);   // negative
        System.out.println(-2147483648 >>> 1);  // positive. Add zero in the start
        System.out.println(-2147483648 / 2);



        int i = 2 > 5 ? 10 : 15;
        System.out.println(i);

        int num = 5;
        int exp = num + 5 + sum(6, 7);
        System.out.println(exp);

        for (int i2=0; i2 < 30; i2++){
            System.out.println(Integer.toBinaryString(i2));
        }
    }

    static int sum (int num1, int num2){
        return num1 + num2;
    }
}

// -- Operators --
// Arithmetic -> + - * / % -- ++
// 9 / 2 = 4
// 9 % 2 = 1

// Relational >, <, >=, <=, ==, !=,

// Bitwise &, |, ^, ~, <<, >>, >>> 
// For every bit we are doing logic gates

// & bitwise and
// | bitwise or
// ^ bitwise xor -> both needs to be different to be true

// a = 5;
// b = a ++;
// b = 5;
// a = 6;

// a = 5;
// b = ++ a;
// b = 6;
// a = 6;