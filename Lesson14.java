class GenericDemo <HereWeGo> {
    HereWeGo weGo;

    GenericDemo(HereWeGo wG){
        weGo = wG;
    }

    HereWeGo getGo(){
        return weGo;
    }
}


public class Lesson14 {
    public static void main(String[] args) {
        GenericDemo <Integer> num = new GenericDemo<>(100);
        int x = num.getGo();
        System.out.println(x);

        GenericDemo <String> text = new GenericDemo<>("We went to the graveyard");
        String txt = text.getGo();
        System.out.println(txt);
    }
}
