class BoxOBJ {
    // data members
    int width, height, length;

    // constructor
    BoxOBJ(int w, int h, int l){
        width = w;
        height = h;
        length = l;
    }

    // method members
    int volume(){
        return width*height*length;
    }
}

public class Box {
    public static void main(String[] args) {
        BoxOBJ b = new BoxOBJ(10, 10, 50);
        System.out.println(b.volume());
    }
}

// Some fields won't change.
// Some of them might change.

// Constructor has same as class name.
// Constructor will be called just after object created.
// If class does not have constructor when java compiles the code it will add 
// non paramter constructor

// Class will have 3 parts
// data members, constructor, method members. All of them are optional.

// Class will have 3 parts.
// We can have a class without main method.
// When we compile java file with many classes we will get one bytecode for each class
