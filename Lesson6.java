public class Lesson6 {
    public static void main(String[] args){
        System.out.println(Integer.toBinaryString(-23));
        System.out.println(Integer.toBinaryString(~(-23)));
        System.out.println(~(23));

        int a;
        a=23;
        
        if((~(a)+1)<a){
            System.out.println("Positive");
        }else if(a==0){
            System.out.print("Zero");
        }
        else{
            System.out.println("Negative");
        }

        String numIs = (~(a)+1)<a ? "Positive":"Negative";
        System.out.println(numIs);

        // while (condition) {
            
        // }

        int count = 5;
        while (count > 0) {
            System.out.println(count);
            count--;
        }
        System.out.println("While done");

        for (int i=5; i>0; i--){
            System.out.println(i);
        }
        // int i=5 will be executed first and only once
        // second action is condition
        // third one is base
        // last one is action
        System.out.println("For done");
    }
}

// When we don't know the limit of the loop we can use while loop and when we know how many times loop will run we use for loop
