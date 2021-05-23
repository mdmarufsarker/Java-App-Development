
    // byte (number, 1 byte)
    // short (number, 2 bytes)
    // int (number, 4 bytes)
    // long (number, 8 bytes)
    // float (float number, 4 bytes)
    // double (float number, 8 bytes)
    // char (a character, 2 bytes)
    // boolean (true or false, 1 byte)


public class Main {
    public static void main(String[] args) {
    // Numbers

    // To declare and assign a number use the following syntax:

    int myNumber1;
    myNumber1 = 5;

    // Or you can combine them:

    int myNumber2 = 5;

    // To define a double floating point number, use the following syntax:

    double d = 4.5;
    d = 3.0;

    // If you want to use float, you will have to cast:

    float f1 = (float) 4.5;

    // Or, You can use this:

    float f2 = 4.5f; // (f is a shorter way of casting float)


    // Characters and Strings

    // Create a string with a constructor
    String s1 = new String("Who let the dogs out?");// String object stored in heap memory

    // Just using "" creates a string, so no need to write it the previous way.
    String s2 = "Who who who who!";// String literal stored in String pool

    // Java defined the operator + on strings to concatenate:
    String s3 = s1 + s2;
///////////////////////////////////////////////
    // Boolean

    boolean b1 = false;
    b = true;

    boolean toBe = false;
    b = toBe || !toBe;
    if (b) {
        System.out.println(toBe);
        }
///////////////////////////////////////////////
    String myName = "Maruf";
    int age = 21;
    System.out.println("My name is " + myName + " and my age is " + age);

///////////////////////////////////////////////
    double num1 = 6.7;
    double num2 = 3.1;
    System.out.println(num1 + num2 - 7.3);
    // 2.500000000000001

///////////////////////////////////////////////
    String myString = "oahfiasdhfyiyrhfikdfkdffd";
    System.out.println(myString.length());
    // 25

///////////////////////////////////////////////
    String firstName = "Maruf";
    String lastName = "Sarker";
    String fullName = firstName + lastName;
    int length = firstName.length() + lastName.length();
    
    System.out.println("My full name is " + fullName);
    System.out.println("The number of characters in my full name is " + length);

    // My full name is MarufSarker
    // The number of characters in my full name is 11

    }
}
