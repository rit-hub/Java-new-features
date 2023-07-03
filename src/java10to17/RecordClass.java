package java10to17;

// java 16 , previews in java 14 & 15
public class RecordClass {
    public static void main(String[] args) {
        Programmer p1 = new Programmer("Ritam", "Java");
        Programmer p2 = new Programmer("Rahul", "Cpp");
        System.out.println(p1);

    }
}

record Programmer(String name, String skill){}