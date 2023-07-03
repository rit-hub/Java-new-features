package java8.StreamAPI.interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

class PredicateImpl implements Predicate<Integer>{

    @Override
    public boolean test(Integer i) {
        return i%5==0;
    }
}
public class PredicateClass {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1,3,4,5,6,7);
        Predicate<Integer> p = new PredicateImpl();
        Stream s = values.stream().filter(p);
        s.forEach(System.out::println);

    }
}
