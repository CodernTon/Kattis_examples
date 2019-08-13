package faktor;

import java.util.Scanner;

public class Faktor{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int planningToPublish = sc.nextInt();
    int impactFactor = sc.nextInt();

    impactFactor--;
    System.out.println(planningToPublish*impactFactor+1);
  }
}
