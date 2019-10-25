import java.util.Scanner;

public class NastyHacks{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int testcases = sc.nextInt();
    int [] result = new int[testcases];

    for(int i = 0; i<testcases; i++){
      result[i]=callThisFunc(sc.nextInt(), sc.nextInt(), sc.nextInt());
    }
    for(int i = 0; i<testcases; i++){
      if (result[i]==1){System.out.println("do not advertise");}
      else if  (result[i]==0){System.out.println("advertise");}
      else {System.out.println("does not matter");}
    }
  }
  public static int callThisFunc(int expectedRevenueNoAdvert, int expectedRevenueYesAdvert, int costOfAdvert){
    if (expectedRevenueNoAdvert+costOfAdvert>expectedRevenueYesAdvert){return 1;}
    else if(expectedRevenueNoAdvert+costOfAdvert<expectedRevenueYesAdvert){return 0;}
    else {return -1;}
  }
}
