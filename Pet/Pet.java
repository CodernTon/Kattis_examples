import java.util.Scanner;

public class Pet{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int result=0, counter=0, winningNumber=0;

    for(int i = 0; i < 5; i++){
      counter++;
      int number=sc.nextInt();
      number+=sc.nextInt();
      number+=sc.nextInt();
      number+=sc.nextInt();
      if (number>result){
        result=number;
        winningNumber=counter;
      }
    }
    System.out.println(winningNumber+" "+result);
  }
}
