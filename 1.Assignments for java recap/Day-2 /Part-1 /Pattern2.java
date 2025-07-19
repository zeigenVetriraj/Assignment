import java.util.Scanner;
/*
3. Write a program to do the following patterns using while loop?
a)1    b) w
  2 3     w w
  4 5 6   w w w
  7 8     w w
  9       w
*/
public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        System.out.print("Enter the '1' to print character : ");
        int choice = sc.nextInt();

        if(choice==1){
            System.out.print("Enter the character : ");
            char choice = sc.nextLine().charAt(0);
            for(int i=1; i<=num; i++){
                if(i<=num/2){
                    
                }
            }
        }
        else{
            
        }
    }
}
