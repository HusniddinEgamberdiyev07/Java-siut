interface InnerLesson17 {
    float PI = 3.14f; // this is final it is constant
    public int add(int a, int b);
}

class Math implements InnerLesson17{
    public int add(int a, int b){
        return a+b;
    }
    void print(){
        System.out.println("Hello World");
    }
}

public class Lesson17 {
    public static void main(String[] args) {
        Math m = new Math();
        m.print();

        System.out.println(m instanceof InnerLesson17);
        
        // InnerLesson17 il17;
        // il17 = new Math();
        // il17.add(10, 100);
        // il17.print();
    }
}

// abstraction is using object while not knowing how it exactly works.

// interfaces tells what classes should have.
// We cannot change name, return, params of methods.
// interface methods must be public
// fields are constants
// we don't need to write fields if they were on interface
// we have interface variable
// instanceof checks object has implements interface
// interfaces can be extend from other extends using extend
