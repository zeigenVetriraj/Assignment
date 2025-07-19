
//1. Write a code to illustrate the various scope of variables(static, local, instance, block, final variables)?
public class Question1{
  final static double PI = 3.14159; // final variable
  static String place = "Alangulam"; // static variable
  String answer; // instance variable
  
  public static void main(String[] args){
    int x = 10; // local variable
      {
          int y = 11; // block variable
          System.out.println(x+y);
      }
    System.out.println("Final variable : "+PI);
  }
}
