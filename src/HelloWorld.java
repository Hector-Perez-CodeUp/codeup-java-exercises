public class HelloWorld {
    public static void main(String args[])
    {
        System.out.println("Hello, World");
        System.out.print("Hello, World");
        System.out.println();

        int myFavoriteNumber = 14;
        System.out.println(myFavoriteNumber);

        String myString = "3.14159";
        System.out.println(myString);

        float myNumber = 123;
        System.out.println(myNumber);

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
//
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//        System.out.println(three);

//        int x = 4;
//        x += 5;

//        int x = 3;
//        int y = 4;
//        y *= x;

        int x = 10;
        int y = 2;
        x /= y;
        y -= x;

        //What happens if you assign a value to a numerical variable that is larger or smaller than the type it can hold?:
//        byte larger = 128;
//        System.out.println(larger);

//        byte smaller = -129;
//        System.out.println(smaller);


        //What happens if you increment a numberic variable past the type's capacity?
//        byte increment = 127;
//        System.out.println(++increment);


    }
}