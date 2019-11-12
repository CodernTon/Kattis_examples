import java.util.Scanner;

public class JudgingMoose{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int leftTines = sc.nextInt();
    int rightTines = sc.nextInt();

    if (leftTines==0 && rightTines==0){
      System.out.println("Not a moose");
    }
    else if (leftTines==rightTines){
      System.out.println("Even "+ leftTines*2);
    }
    else{
      if (leftTines>rightTines){
        System.out.println("Odd "+(leftTines*2));
      }
      else {
        System.out.println("Odd "+(rightTines*2));
      }
    }
  }
}
