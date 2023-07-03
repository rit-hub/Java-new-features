package java10to17;

// Switch as a expression in java 14
public class NewSwitch {
    public static void main(String[] args) {
        var a = "Harry";
        var result = switch (a){
            case "Harry" -> 10;
            default -> 0;
        };

        System.out.println(result);

    }
}
