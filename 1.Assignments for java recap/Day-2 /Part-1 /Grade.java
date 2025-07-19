import java.util.Scanner;

/*
7. Use both if and switch case statement  as two ways to find the grade of a student.
Percent>=85 && Percent<=100 Grade ‘A’
Percent>=70 Grade ‘B’
Percent>=50 Grade ‘C’
otherwise print ”Fail”
*/

public class Grade{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Number : ");
        int percent = sc.nextInt();

        if(percent>=85 && percent<=100)System.out.println("Grade A");
        else if(percent>=70 && percent<85)System.out.println("Grade B");
        else if(percent>=50 && percent<70)System.out.println("Grade C");
        else if(percent>=0 && percent<50)System.out.println("Grade B");
        else System.out.println("You'r Not Elegible");

        switch(subject){
            case 
        }
        
        
    }
}
