import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class BeenEverywhere{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int numberOfTestcases = sc.nextInt();
    int[]result = new int[numberOfTestcases];
    Set<String> hashSet;

    for (int i = 0; i<numberOfTestcases; i++){
      hashSet = new HashSet<String>();
      int numberOfWorktrips = sc.nextInt();
      for (int k = 0; k<numberOfWorktrips; k++){
        hashSet.add(sc.next());
      }
      result[i]=hashSet.size();
    }
    for (int i = 0; i<numberOfTestcases; i++){
      System.out.println(result[i]);
    }
  }
}
