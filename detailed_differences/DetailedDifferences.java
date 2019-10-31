import java.util.Scanner;
import java.lang.StringBuilder;

public class DetailedDifferences{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int testcases = sc.nextInt();
    String [] result = new String[testcases];
    String [] codeLineOne = new String[testcases];
    String [] codeLineTwo = new String[testcases];
    for (int i = 0; i<testcases; i++){
      StringBuilder sb = new StringBuilder();
      codeLineOne[i] = sc.next();
      codeLineTwo[i] = sc.next();
      for (int j = 0; j<codeLineOne[i].length(); j++){
        if(codeLineOne[i].charAt(j)==codeLineTwo[i].charAt(j)){
          sb.append(".");
        }
        else{
          sb.append("*");
        }
      }
      result[i]=sb.toString();
    }
    for (int i = 0; i<result.length; i++){
      System.out.println(codeLineOne[i]+"\n"+codeLineTwo[i]+"\n"+result[i]);
    }
  }
}
