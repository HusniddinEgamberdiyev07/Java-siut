class Utility{

    static <T extends Number> void pinrtArr(T[] arr){
        for(T el:arr){
            System.out.println(el + " ");
        }
        System.out.println();
    }

    // static <T> void justType(T something){
    //     System.out.println(something);
    // }
}

class Lesson16 {
    public static void main(String[] args) {
        Integer[] nums = {1,2,3,4};
        String[] letters = {"A", "B", "C"};
        Double[] price = {2.2, 3.4};

        Utility.<Integer>pinrtArr(nums);
        // Utility.<String>pinrtArr(letters);
        Utility.<Double>pinrtArr(price);

        // Utility.justType(1);
        // Utility.justType(2.2);
    }
}

// generic methods
// <T> T print(T value)
// <K, V> void print(K key, v value)

// Integer a -> a refrence of Integer. It is object
// Integer[] a = {1,2,3,4}; -> 5 objects
// generic will not work with primitive datatypes

// to enhance the readability of the code we can put type when we call generic methods

// no duplication, clean, reusable, autotpye when we call it.

// out method takes
// int 
// float 
// double

// no string

// <T extends Number> sup class of number. float, double, int