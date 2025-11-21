import java.util.Scanner;

/**
 * Write a description of class CalculatorExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CalculatorExample
{
   public static void main(String[]arg)
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter one number ");
       int onenumber=sc.nextInt();
       System.out.println("two number");
       int twonumber=sc.nextInt();
       int sum = onenumber+twonumber;
       int diff=onenumber-twonumber;
       int multi =onenumber*twonumber;
       int divi=onenumber%twonumber;
       int mod=onenumber/twonumber;
       
       
       System.out.println("onenumber+twonumber"+sum);
       System.out.println("onenumber-twonumber" +diff);
       System.out.println("onenumber*twonumber"+multi);
       System.out.println("onenumber%twonumber"+divi);
       System.out.println("mod"+mod);
       
       
        int bigger=(onenumber>twonumber)?onenumber:twonumber;
            System.out.println("bigger number is"+bigger);
            sc.close();
   }
  
   
   
}