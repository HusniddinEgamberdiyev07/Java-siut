class Animal{
    String type;
    Animal(String t){
        type = t;
        System.out.println("Animal constructor");
    }
    void eat(){
        System.out.println("Animal is eating");
    }
    void sound(){
        System.out.println("Animal sound");
    }
}

class Dog extends Animal{
    String name;
    Dog(String t, String n){
        System.out.println("Dog constructor");
        name = n;
        super(t); // execute Animal() constructor
        //name = n;     
    }
    void bark(){
        System.out.println("Dog barks");    
    }

    // @Override
    void sound(){
        System.out.println("Dog sound");
    }
}

// class DogType extends Dog{
//     DogType(){
//         System.out.println("Dog type constructor");
//     }
// }

public class World {
    public static void main(String[] args) {
        Dog d1 = new Dog("dog", "something");
        
        d1.eat(); // inherited
        d1.bark(); // owned
        d1.sound();
        System.out.println(d1.name + " " + d1.type);
    }
}

// java do not allow multiple class inheritence
// not allowed: class A extends B, C
// because of diamond problem
// first parent constructor will be executed and then child class
// multi-level inheritence
// hierchery inheritence
