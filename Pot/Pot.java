package Pot;

import java.util.Scanner;

public class Pot{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int numberOfAddends= sc.nextInt();
    int number;
    int total=0;
    for (int i = 1; i<numberOfAddends+1; i++){
      number = sc.nextInt();
      int raised = number%10;
      int numberFromBefore =number/10;
      total+= Math.pow(numberFromBefore, raised);
    }
    System.out.println(total);
  }
}
