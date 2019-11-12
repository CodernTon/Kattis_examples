import java.util.Scanner;
import java.lang.Math;

public class PizzaCrust{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    double radieOfPizza = sc.nextDouble();
    double cmOfCrust = sc.nextDouble();

    double totalAreaOfPizza = (radieOfPizza*radieOfPizza)*Math.PI;
    double totalAreaOfCheese = ((radieOfPizza-cmOfCrust)*(radieOfPizza-cmOfCrust))*Math.PI;
    if (cmOfCrust>radieOfPizza){
      radieOfPizza = 0;
      cmOfCrust = 0;
      System.out.println("0.000000000");
    }
    else {
        System.out.println((totalAreaOfCheese/totalAreaOfPizza)*100);
    }
  }
}
