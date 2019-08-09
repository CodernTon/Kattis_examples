package stuckinatimeloop;

import java.util.Scanner;

public class StuckInATimeLoop{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    for(int i = 1; i<input+1; i++){
      System.out.println(i+" Abracadabra");
    }
  }
}
