package Oddities;

import java.util.Scanner;

public class Oddities{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int testCases = sc.nextInt();
    int input= -1;

    for(int i = 0 ; i<testCases; i++){
      input=sc.nextInt();
      if ((input%2)==0){
        System.out.println(input + " is even");
      }
      else{
        System.out.println(input + " is odd");

      }
    }
  }
}
