import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class SpeedLimit{
  public static void main(String [] args ) {
    Scanner sc = new Scanner(System.in);
    List <Integer> printOut = new ArrayList<Integer>();
    int miles=0, total=0, count=0, totalAttempts=0, temp=0;

    while ((totalAttempts=sc.nextInt())!= -1){
      for(int i = 0; i<totalAttempts; i++){
        miles = sc.nextInt();
        temp=count;
        count = sc.nextInt() - count;
        total+=miles * count;
        count+=temp;
      }
      printOut.add(total);
      total=0;
      temp=0;
      miles=0;
      count=0;
    }
    for(int i = 0; i<printOut.size(); i++){
      System.out.println(printOut.get(i).toString()+ " miles");
    }
  }
}
