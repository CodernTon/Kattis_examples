import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class PasswordHacking{
  public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
    int testcases = sc.nextInt();
    double counter = 1;
    double result=0;
    List<Double> likelyness = new ArrayList<>();
    for (int i = 0; i<testcases; i++){
      String password = sc.next();
      likelyness.add(sc.nextDouble());
    }
    Collections.sort(likelyness);
    Collections.reverse(likelyness);
    //Works till here, able to sort i ascending order

    for (int k =  0; k< testcases; k++){
      result+=counter*likelyness.get(k);
      counter++;
    }

    System.out.println(result);
  }
}
