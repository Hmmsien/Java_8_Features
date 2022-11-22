import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class lambda1 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        // normal loop to iterate nums
        for(int i = 0; i < nums.size(); i++) {
            System.out.print(nums.get(i));
        }

        System.out.println("\n");

        // enhanced loop in Java after jdk 1.5,
        // int n inside the nums
        for(Integer n :  nums) {
            System.out.print(n);
        }

       System.out.println("\n");
        // both normal and enhanced loop are external for loop
        // which means they externally act on the elements


        // since java 8, use forEach which is basically fetch the value from the added list
        // So in order to use forEach(), we need to create object of consumer
        // anonymous inner class: creating a class without a name inside a class
        nums.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer n) {
                System.out.print(n);
            }
        });

        System.out.println("\n");

        // lambda expression to iterate over a nums and perform some action on nums items
        // accept the value in n and the same value will be printed
        // Syntax: (parameters) -> {statements}
        nums.forEach( n-> System.out.print(n) );

        System.out.println("\n");

        // method reference
        // method can be mapped to specific existing method using double colon operator (::)
        nums.forEach(System.out::print);
    }
}
