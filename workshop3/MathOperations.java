package workshop3;
import java.util.Scanner;


/**
 * Write a description of class MathOperations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathOperations
{
   public static void main(String[]arg)
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("first number ");
       int a=sc.nextInt();
       System.out.println("second number");
       int b=sc.nextInt();
       
       boolean greater=(a>b);
       boolean equal=(a==b);
       
       System.out.println("a>b:\n" +greater);
       System.out.println("a==b" +equal);
       
   }
}