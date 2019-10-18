import java.util.Scanner;

public class FreeFood{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int numberOfTestcases = sc.nextInt();
    List <Integer> allValues = new ArrayList<>();
    int numberOfFreeMeals = 0;
    for (int i = 1; i<367; i++){
      allValues.add(i);
    }
    for(int i = 0; i < numberOfTestcases; i++){
      int s = sc.nextInt();
      int t = sc.nextInt();
      for(int c = s; c<=t; c++){
        allValues.set(c, 0);
      }
    }
    for (int i = 0; i < 366; i++){
      if (allValues.get(i)==0){
        numberOfFreeMeals+=1;
      }
    }
    System.out.println(numberOfFreeMeals);
  }
}
