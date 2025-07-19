import java.util.Scanner;

//6. Write a program that illustrate the Explicit type casting?
public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first Number : " );
        int num1 = sc.nextInt();
        
        System.out.print("Enter the second Number : " );
        int num2 = sc.nextInt();
        
        // type cast to Double
        double val = (double)num1 / num2;
        System.out.println("Type casted : "+val);

        String str = new StringBuilder();
        StringBuilder sb = (StirngBuilder) str;
      
    }
}
