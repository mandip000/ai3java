package workshop3;
import java.util.Scanner;


/**
 * Write a description of class ternary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ternary
{
   public static void main(String[]arg)
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("grade");
       
       int grade=sc.nextInt();
       
       String result=(grade>=40)?"pass":"fail";
       System.out.println("your results is :\n"+result);
       
   }
}