package babybites;

import java.util.Scanner;

public class BabyBites{
  public static void main(String[]args){
    Scanner sc = new Scanner (System.in);
    int numberOfInputs = sc.nextInt();
    int counter = 1;
    String temp = "0";
    for (int i = 0; i<numberOfInputs; i++){
      if(counter.toString().equals(temp=sc.next())){
        counter++;
      }
    }
  }
}
