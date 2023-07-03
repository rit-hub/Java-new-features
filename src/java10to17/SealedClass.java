package java10to17;

// preview in java 14
public class SealedClass {
    public static void main(String[] args) {
        var obj = new B();
        obj.show();
    }
}


sealed class A permits  B{
   void show(){
        System.out.println("Class A");
    }
}

non-sealed class B extends A{
    void  show(){
        System.out.println("Class B");
    }
}
