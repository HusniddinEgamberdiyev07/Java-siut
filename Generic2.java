class GenericDemo <T, J>{
    T obj1;
    J obj2;

    GenericDemo(T o1, J o2){
        obj1 = o1;
        obj2 = o2;
    }

    T getobj1(){
        return obj1;
    }

    J getobj2(){
        return obj2;
    }
}

public class Generic2 {
    public static void main(String[] args) {
        GenericDemo<Integer, String> a1 = new GenericDemo<>(1, "hello");
        System.out.println(a1.getobj1());
        System.out.println(a1.getobj2());
    }    
}
