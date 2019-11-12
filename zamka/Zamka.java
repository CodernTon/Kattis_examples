import java.util.Scanner;

public class Zamka{
  public static int [] temporaryAdding;
  public static String [] tempV1Arr;
  public static int result= 0;
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int minimumValue = sc.nextInt();
    int maximumValue = sc.nextInt();
    int sumValue = sc.nextInt();

    for (int i = minimumValue-1; i<maximumValue; ++i){
      int possible = calculateSum(i);
      if (possible==sumValue){
          System.out.println(i);
          break;
      }
    }
    for (int i = maximumValue+1; i>minimumValue; --i){
      int possible = calculateSum(i);
      if (possible==sumValue){
          System.out.println(i);
          break;
      }
    }
  }
  public static int calculateSum(int minimumValue){
    result= 0;
    //Counts the sum of a number
    String tempV1 = Integer.toString(minimumValue);
    tempV1Arr=new String[tempV1.length()];
    for (int j = 0; j < tempV1.length(); j++){
      char wut=tempV1.charAt(j);
      tempV1Arr[j]=String.valueOf(wut);
    }
    for (int j = 0; j < tempV1.length(); j++){
      result += Integer.parseInt(tempV1Arr[j]);
    }
    return result;
  }
}
