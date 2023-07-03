package java8.StreamAPI.interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class ConsumerImpl implements Consumer<Integer> {
    @Override
    public void accept(Integer i) {
        System.out.println(i);
    }
}
public class ConsumerClass {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1,3,4,5,6,7);
        Consumer<Integer> c = new ConsumerImpl();
        values.forEach(c);

    }

}
