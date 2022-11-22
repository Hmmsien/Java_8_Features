
// here come up some questions
// can we create an object of interface
// can we create the object of the implementation of the interface

@FunctionalInterface
interface A {
    void test();
    //int test5();

    default void test2() {
        System.out.println("Default Method Executed");
    }
    static void test3() {
        System.out.println("static Method Executed");
    }
}

// not necessary to create a class if the class will be used only once.
class B implements A {
    public void test() {
        System.out.println("hi - class B");
    }
}

public class functionalInterface1 {
    public static void main(String[] args) {
//        A obj1 = new A();

        A obj2 = new B();
        obj2.test();

        // anonymous inner class
        A obj3 = new A() {
            public void test() {
                System.out.println("hi - anonymous inner class");
            }
        };
        obj3.test();

        // lambda expression
        A obj4 = () -> System.out.println("hi - lambda expression");
        obj4.test();
    }
}
