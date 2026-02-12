public class Lab {
    public static void main(String[] args){

        // First

        int num = -100;

        if(num>0){
            System.out.println("Positive");

            if(num > 99 && num <= 999){
                System.out.println("Num is 3 digit number");
            }else{
                System.out.println("Num is not 3 digit number");
            }

        }else if(num<0){
            System.out.println("Negative");

            if((~(num)+1) > 99 && num <= 999){
            System.out.println("Num is 3 digit number");
            }else{
                System.out.println("Num is not 3 digit number");
            }

        }else{
            System.out.println("Zero");
        }

        if(num == 0){
            System.out.println("Zero");
        }else if(num % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

        if(num % 5 == 0){
            System.out.println("Divisible by 5");
        }else{
            System.out.println("Not divisible by 5");
        }

        // Second

        int num2 = -121;
        int num3 = num2;
        int reverse = 0;

        while (num2 != 0) {
            int digit = num2 % 10;
            reverse = reverse * 10 + digit; 
            num2 = num2 / 10;
        }
        if(num3 == reverse){
            System.out.println("Num is palindrom");
        }
        System.out.println(reverse);

        // Third

        int balance = 100;
        int withdrawal = 90;

        int current_balance = balance - withdrawal;

        if(current_balance > 0){
            System.out.println("You can withdraw");
            System.out.println(current_balance);
        }else{
            System.out.println("You can't");
        }
    }
}
