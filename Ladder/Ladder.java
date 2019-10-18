import java.util.Scanner;
import java.lang.Math;

public class Ladder{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    double height=sc.nextInt();
    double degrees = sc.nextDouble();
    int result = (int)(height/(Math.sin(Math.toRadians(degrees))));
    System.out.println(result+1);
  }
}
