import java.util.Scanner;

//4. Write a program to check whether the given two numbers are equal or not w/o using comparison operator?
public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first Number : " );
        int num1 = sc.nextInt();
        
        System.out.print("Enter the second Number : " );
        int num2 = sc.nextInt();
        
        // Using equals (==) operator
        boolean equal = num1 == num2;

        if(equal)System.out.println("The two numbers is equal");
        else System.out.println("The two numbers is not equal");
    }
}
