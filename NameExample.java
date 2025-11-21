import javax.swing.Spring;
import java.util.Scanner;

/**
 * Write a description of class NameExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NameExample
{
    public static void main(String[]arg)
    {
       Scanner sc=new Scanner(System.in); //input from user
       System.out.println("Student Name");
       String StudentName=sc.nextLine();
       System.out.println("age");
       int age=sc.nextInt();
       System.out.println("gpa");
       double gpa=sc.nextDouble();
       System.out.println("StudentName"+StudentName); //displaying value
       System.out.println("age"+age);
       System.out.println("gpa"+gpa);
       
       
    }
}