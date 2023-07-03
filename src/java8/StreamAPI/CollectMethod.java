package java8.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectMethod {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> evens = nums.stream().filter(i -> i%2==0).collect(Collectors.toList());
        evens.forEach(System.out::println);
    }
}
