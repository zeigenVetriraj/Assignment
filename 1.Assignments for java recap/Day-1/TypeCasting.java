
//6. Write a program that illustrate the Explicit type casting?
public class TypeCasting {
    public static void main(String[] args) {
        double val = (double) 12 / 5; // when dividing 2 int's if the output has desimal value we have to consider
        System.out.println("Explicitly Type casted (int to double): " + val);

        // double to int explicit type casting
        double d = 9.87;
        int i = (int) d; // fractional part lost
        System.out.println("Explicitly Type casted (double to int): " + i);

        // Valid casting from char to int
        char ch = 'A';
        int chVal = (int) ch; // give the ASCI value fo 'A'
        System.out.println("Explicitly Type casted (char to int): " + chVal);

        Animal a = new Dog(); // upcasting
        if (a instanceof Dog) {
            Dog d = (Dog) a; // Safe downcast
        }
    }
}

class Animal {}
class Dog extends Animal {}
