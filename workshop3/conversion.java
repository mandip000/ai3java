package workshop3;
import java.util.Scanner;


/**
 * Write a description of class conversion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class conversion
{
   public static void main(String[]arg)
   {
       Scanner sc =new Scanner(System.in);
       System.out.println("take second as input from user:");
       int second=sc.nextInt();
       
       int hour=second/3600;
       int minute=second%3600;
       int totalsecond = second%60;
       
       System.out.println(hour+": " +minute +" :" + totalsecond);
       
       
   }
}