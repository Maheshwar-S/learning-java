import java.util.*;
public class second{
  public static void main(String[] args){
    //playing with operators
    System.out.println(74 + 36);
    System.out.println(50/3);
    System.out.println(-5 + 8 * 6);
    System.out.println((55+9) % 9);
    System.out.println(20 + -3*5 / 8);
    System.out.println(5 + 15 / 3 * 2 - 8 % 3);
    System.out.println("--------------------------------------");
    //taking input
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number: ");
    int a = sc.nextInt();
    System.out.println("Enter the second number: ");
    int b = sc.nextInt();
    System.out.println(a+b);
    System.out.println(a-b);
    System.out.println(a*b);
    System.out.println(a/b);
    System.out.println(a%b);
    System.out.println("--------------------------------------");
    //Playing with loops (multiplication table)
    System.out.println("Enter the number: ");
    int num = sc.nextInt();
    int i;
    for(i=1;i<=10;i++){
      System.out.println(num*i);
    }
    System.out.println("--------------------------------------");
  }
}