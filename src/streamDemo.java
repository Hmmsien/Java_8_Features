import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streamDemo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(9,3,6,2,8);

        Stream<Integer> data = nums.stream();
//        data.forEach(n -> System.out.println(n));
//        //we can use stream only once
//        data.forEach(n -> System.out.println(n));

//        long count = data.count();
//        System.out.println(count);

//        Stream<Integer> sortedData = data.sorted();
//        sortedData.forEach(n -> System.out.println(n));

        nums.stream()
                .filter(n -> n > 3)
                .sorted()
                .map((n -> n*2))
                .forEach(n -> System.out.println(n));


        nums.forEach(System.out::println);

    }
}

