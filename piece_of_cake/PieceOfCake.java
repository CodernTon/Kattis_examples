import java.util.Scanner;

public class PieceOfCake{
  public static void main(String[]args){
    int [] input = new int[8];
    int result=0, temp=0;
    Scanner sc = new Scanner(System.in);
    int lengthOfSide = sc.nextInt();
    int sideOneOfOneSquare = sc.nextInt();
    int sideTwoOfOneSquare = sc.nextInt();
    input[0] = sideOneOfOneSquare;
    input[1] = sideTwoOfOneSquare;
    input[2] = lengthOfSide-sideTwoOfOneSquare;
    input[3] = sideOneOfOneSquare;
    input[4] = lengthOfSide-sideOneOfOneSquare;
    input[5] = lengthOfSide-sideTwoOfOneSquare;
    input[6] = sideTwoOfOneSquare;
    input[7] = lengthOfSide-sideOneOfOneSquare;
    for (int i = 0; i<7; i++){
      int temporaryVar=input[i+1];
      temp=calculateVolume(input[i], temporaryVar);
      if (result<temp){
        result=temp;
      }
      i++;
    }
    System.out.println(result);
  }
  public static int calculateVolume(int sideOneOfOneSquare, int sideTwoOfOneSquare){
    return (sideOneOfOneSquare*sideTwoOfOneSquare)*4;
  }
}
