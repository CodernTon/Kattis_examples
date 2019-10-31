import java.util.Scanner;

public class GrassSeedInc{
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    double costSeedPerSquareMeter = sc.nextDouble();
    double numberOfLawns = sc.nextDouble();
    double result = 0;
    for (int i = 0; i<numberOfLawns; i++){
      double width = sc.nextDouble();
      double lenght = sc.nextDouble();
      result+= (width*lenght)*costSeedPerSquareMeter;
    }
    System.out.println(result);
  }
}
