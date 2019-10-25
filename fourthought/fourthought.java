import java.util.Scanner;
import java.util.List ;
import java.util.ArrayList;

public class fourthought{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int numberOfTestcases= sc.nextInt();
    StringBuilder [] result = new StringBuilder[numberOfTestcases];
    for (int i = 0; i<numberOfTestcases; i++){
      result[i]=howToCalculate(sc.nextInt());
    }
    for (int i = 0; i<numberOfTestcases; i++){
      presentResult(result[i]);
    }
  }

  public static StringBuilder howToCalculate(int sum){
    StringBuilder sb = new StringBuilder();
    if (4+4+4+4==sum){
      sb.append("4 + 4 + 4 + 4 = ");
      sb.append(Integer.toString(sum));
      return sb;
    }
    else if(4+4+4-4==sum){
      sb.append("4 + 4 + 4 - 4 = ");
      sb.append(Integer.toString(sum));
      return sb;
    }
    else if(4+4-4-4==sum){
      sb.append("4 + 4 - 4 - 4 = ");
      sb.append(Integer.toString(sum));
      return sb;
    }
    else if(4-4-4-4==sum){
      sb.append("4 - 4 - 4 - 4 = ");
      sb.append(Integer.toString(sum));
      return sb;
    }
    else if(4+4/4*4==sum){
      sb.append("4 + 4 / 4 * 4 = ");
      sb.append(Integer.toString(sum));
      return sb;
    }
    else if(4/4+4*4==sum){
      sb.append("4 / 4 + 4 - 4 = ");
      sb.append(Integer.toString(sum));
      return sb;
    }
    else if(4/4-4+4==sum){
      sb.append("4 - 4 - 4 - 4 = ");
      sb.append(Integer.toString(sum));
      return sb;
    }
    else if(4*4/4-4==sum){
      sb.append("4 - 4 - 4 - 4 = ");
      sb.append(Integer.toString(sum));
      return sb;
    }
    else if(4+4+4/4==sum){
      sb.append("4 - 4 - 4 - 4 = ");
      sb.append(Integer.toString(sum));
      return sb;
    }
    else if(4*4-4*4==sum){
      sb.append("4 - 4 - 4 - 4 = ");
      sb.append(Integer.toString(sum));
      return sb;
    }
    else if(4+4-4/4==sum){
      sb.append("4 - 4 - 4 - 4 = ");
      sb.append(Integer.toString(sum));
      return sb;
    }
    else if(4*4+4+4==sum){
      sb.append("4 - 4 - 4 - 4 = ");
      sb.append(Integer.toString(sum));
      return sb;
    }
    else if(4*4*4*4==sum){
      sb.append("4 - 4 - 4 - 4 = ");
      sb.append(Integer.toString(sum));
      return sb;
    }
    else if(4/4/4/4==sum){
      sb.append("4 - 4 - 4 - 4 = ");
      sb.append(Integer.toString(sum));
      return sb;
    }
    else if(4/4/4*4==sum){
      sb.append("4 - 4 - 4 - 4 = ");
      sb.append(Integer.toString(sum));
      return sb;
    }
    else if(4+4*4*4==sum){
      sb.append("4 - 4 - 4 - 4 = ");
      sb.append(Integer.toString(sum));
      return sb;
    }
    else if(4-4*4*4==sum){
      sb.append("4 - 4 - 4 - 4 = ");
      sb.append(Integer.toString(sum));
      return sb;
    }
    else if(4-4*4/4==sum){
      sb.append("4 - 4 - 4 - 4 = ");
      sb.append(Integer.toString(sum));
      return sb;
    }
    else if(4/4/4*4==sum){
      sb.append("4 - 4 - 4 - 4 = ");
      sb.append(Integer.toString(sum));
      return sb;
    }
    else{
      return sb;
    }
  }
  public static void presentResult(StringBuilder result){
    if (result.length()==0){
      System.out.println("no solution");
    }
    else {
      System.out.println(result);
    }
  }
}
