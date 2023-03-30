package main.java8.lambda;

public class Driver {
    public static void main(String[] args) {

        /** 1. With-out lambda, implemented interface */
        MyInterface myInterface = new MyInterfaceImpl();
        myInterface.sayHello();

        /** 2. Create anonymous class for separate interface */
        MyInterface anInterface1 = new MyInterface() {
            @Override
            public void sayHello() {
                System.out.println("this is from anonymous class :: 1");
            }
        };
        anInterface1.sayHello();

        MyInterface anInterface2 = new MyInterface() {
            @Override
            public void sayHello() {
                System.out.println("this is from anonymous class :: 2");
            }
        };
        anInterface2.sayHello();

        /** 3. Using lambda expression */
        MyInterface anInterface3 = () -> {
            System.out.println("this is lambda expression");
        };

        anInterface3.sayHello();

        MyInterface anInterface4 = () -> System.out.println("this is lambda expression, removed braces");

        anInterface4.sayHello();

        Sum sum = (int a, int b) ->
        {
            return a + b;
        };
        System.out.println("Sum Interface : " + sum.add(2, 5));

        Sum sum2 = (a, b) -> a + b;
        System.out.println("More precise : " + sum2.add(3, 5));

        Length length = str -> str.length();
        System.out.println("Length of given string : " + length.getStrLength("Some random string"));
    }
}
