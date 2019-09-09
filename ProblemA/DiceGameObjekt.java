import java.util.Scanner;

public class DiceGameObjekt{
  public static void main(String[]args){
    DiceGameObjekt player = new DiceGameObjekt();
    double [] gunnarInput= new double [4];
    double [] emmaInput = new double [4];

    Scanner sc = new Scanner(System.in);
    for (int i =0; i <4; i++){
      gunnarInput[i]=sc.nextDouble();
    }
    for (int i =0; i <4; i++){
      emmaInput[i]=sc.nextDouble();
    }
    sc.close();

    double gunnarValue=player.calculate(gunnarInput);
    double emmaValue=player.calculate(emmaInput);
    System.out.println(gunnarValue);
    System.out.println(emmaValue);

    if (gunnarValue < emmaValue){
      player.printWinner("Emma");
    }
    else if (gunnarValue > emmaValue){
      player.printWinner("Gunnar");
    }
    else{
      player.printWinner("Tie");
    }
  }
  public double calculate(double [] userInput){
    double calculatedValue = 0;
    double counter = 0;
    double chanceOfwinning=0;
    double numberOfPossibleThrows=0;
    double result1=0;
    double result2=0;
    for (double i=userInput[0]; i<=userInput[1]; i++){
      calculatedValue+=userInput[0]+counter;
      counter++;
    }
    numberOfPossibleThrows=counter;
    result1=calculatedValue/numberOfPossibleThrows;
    counter=0;
    calculatedValue=0;
    for (double i=userInput[2]; i<=userInput[3]; i++){
      calculatedValue+=userInput[2]+counter;
      counter++;
    }
    numberOfPossibleThrows=counter;
    result2=calculatedValue/numberOfPossibleThrows;
    return result1+result2;
  }
  public void printWinner(String winner){
    System.out.println(winner);
  }
}
