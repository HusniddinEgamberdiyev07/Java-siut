import java.util.Scanner;

class Payment{
    void pay(){
        System.out.println("Paid");
    }
}

class CreaditCard extends Payment{
    void pay() {
        System.out.println("Paid with credit card");
    }
}

class UIP extends Payment{
    void pay(){
        System.out.println("Paid with UIP");
    }
}


public class PaymentSevice {
    public static void main(String[] args) {
        Payment p = new Payment();
        Scanner sc = new Scanner(System.in);
        System.out.println("1 credit card. 2 upi");
        int choice = sc.nextInt();
        if(choice == 1) p = new CreaditCard();
        else if(choice == 2) p = new UIP();
        p.pay();
    }
}

// late binding is in run time
// early binding is in comiling time