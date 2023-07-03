package java10to17;

public class OldSwitch {
    public static void main(String[] args) {
        int a = 10;
        switch (a){
            case 5:
                System.out.println("its 5");
                break;
            case 10:
                System.out.println("Its 10");
                break;
            default:
                System.out.println("Its default");
        }
    }
}
