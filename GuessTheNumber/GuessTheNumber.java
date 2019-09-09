import java.util.Scanner;

public class GuessTheNumber{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int lowerLimit=1;
    int upperLimit=1000;
    int counter=0;
    int guessedValue = (lowerLimit+upperLimit)/2;

    while(counter<10){
      String input= sc.nextLine();
      if (input.equals("lower")){
        upperLimit=guessedValue;
        guessedValue=(lowerLimit+upperLimit)/2;
        counter++;
      }
      else if (input.equals("higher")){
        lowerLimit = guessedValue;
        guessedValue=(lowerLimit+upperLimit+1)/2;
        counter++;
      }
      else{
        break;
      }
      System.out.println(guessedValue);
    }
    sc.close();
  }
}
