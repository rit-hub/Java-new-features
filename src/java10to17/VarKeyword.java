package java10to17;

// java 10
// java is statically typed language because var will be converted in the compile time. not in runime.
public class VarKeyword {
    public static void main(String[] args) {
        var i = 10;
        var skills = new int[10];

        for(var s : skills){
            System.out.println(s);
        }
    }
}
