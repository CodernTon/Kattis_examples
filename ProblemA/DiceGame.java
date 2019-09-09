import java.util.*;

public class DiceGame{
  public static void main(String[]args){
    int [] gunnarInput = storeInput();
    int [] emmaInput = storeInput();

    int gunnarValue=calculate(gunnarInput);
    int emmaValue=calculate(emmaInput);

    if (gunnarValue<emmaValue){
      printWinner("Emma");
    }
    else if (gunnarValue > emmaValue){
      printWinner("Gunnar");
    }
    else{
      printWinner("Tie");
    }
  }
  public static int [] storeInput(){
    Scanner sc = new Scanner(System.in);
    int [] inputValues = new int [4];
    for (int i =0; i <4; i++){
      inputValues[i]=sc.nextInt();
    }
    return inputValues;
  }
  public static int calculate(int [] userInput){
    int calculatedValue = 0;
    int counter = 0;
    int numberOfThrows=0;
    for (int i=userInput[0]; i<userInput[1]; i++){
      calculatedValue+=userInput[0]+counter;
      counter++;
    }
    numberOfThrows=counter;
    counter=0;
    for (int i=userInput[2]; i<userInput[3]; i++){
      calculatedValue+=userInput[2]+counter;
      counter++;
    }
    numberOfThrows+=counter;
    return calculatedValue/numberOfThrows;
  }
  public static void printWinner(String winner){
    System.out.println(winner);
  }
}
