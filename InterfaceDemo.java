interface OldArithmetic {
    int sub(int a, int b);
}

interface Arithmetic extends OldArithmetic{
    float PI = 3.14f;
    int sum(int a, int b);
    int mult(int a, int b);
    float area(float f);

    default void display(){System.out.println("Hello");}
}

class MyArith implements Arithmetic{
    float radius;

    public int sum(int a, int b){return a+b;}
    public int mult(int a, int b){return a*b;}
    public float area(float f){return (PI * f * f);}
    public int sub(int a, int b){return 1;}
    
    void print(){System.out.println("Hello");}
}

class InterfaceDemo {
    public static void main(String[] args) {
        MyArith m = new MyArith();

        System.out.println(m.sum(10, 20));
        System.out.println(m.mult(2, 4));
        System.out.println(m.area(5));
        // m.print();
        System.out.println(m instanceof Arithmetic);
        System.out.println(m.sub(1, 1));
    }    
}
