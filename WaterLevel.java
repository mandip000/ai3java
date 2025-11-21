import java.util.Scanner;

/**
 * Write a description of class WaterLevel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WaterLevel
{
    public static void main(String[]arg)
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("the level of water;");
        int waterlevel=sc.nextInt();
                  String message=(waterlevel>=1000)?"Warning":"Normal";
        
        
        
    }
    
}