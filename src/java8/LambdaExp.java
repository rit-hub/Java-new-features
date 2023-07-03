package java8;

// () -> {} lambda expression syntax
public class LambdaExp {
    public static void main(String[] args) {
        Employee e = () -> System.out.println("Manager");
        e.role();

    }
}
@FunctionalInterface
interface Employee{
    void role();
}
