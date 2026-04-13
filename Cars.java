class  Car {
    // changeGear()

    void dir(float a, float b){
        System.out.println(a/b);
    }
}

// sup class             super class
class ImproveCar extends Car{
    // acFucntion
    // changeGear() -> method overriding

    void dir(float a, float b){
        if(b==0){
            System.out.println("can't 0");
        }else{
            super.dir(a, b);
        }
    }
}

public class Cars {
    public static void main(String[] args) {
        ImproveCar car1 = new ImproveCar();
        car1.dir(1, 5);
    }
}
