import java.util.Scanner;

public class JobExpenses{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int numberOfValues = sc.nextInt();
    int resultOfAllExpenses=0;

    for(int i = 0; i<numberOfValues; i ++){

      int expense = sc.nextInt();
      if (expense<0){
        resultOfAllExpenses+=expense*(-1);
      }
    }
    System.out.println(resultOfAllExpenses);
  }
}
