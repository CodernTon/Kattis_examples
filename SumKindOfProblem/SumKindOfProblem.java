import java.util.*;

public class SumKindOfProblem{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    SumKindOfProblem go = new SumKindOfProblem();
    int amount = sc.nextInt();
    int counter = 1;
    int [] input= new int[amount];
    for (int i = 0; i < amount; i++){
      sc.nextInt();
      input[i]=sc.nextInt();
    }
    for (int i = 0; i<amount; i++){
      System.out.println(counter+
      " "+go.sumPosInt(input[i])+
      " "+go.sumOddInt(input[i])+
      " "+go.sumEvenInt(input[i]));
      counter++;
    }
  }
  public int sumPosInt(int input){
    int result=0;
    for (int i = 0; i<input+1; i++){
      result=result+i;
    }
    return result;
  }
  public int sumOddInt(int input){
    int result=0;
    int upCount=0;
    int counter =0;
    while(counter < input){
      if ((upCount%2)!=0){
        result=result+upCount;
        upCount++;
        counter++;
      }
      else{
        upCount++;
      }
    }
    return result;
  }

  public int sumEvenInt(int input){
    int result=0;
    int upCount=0;
    int counter =0;
    while(counter < input+1){
      if ((upCount%2)==0){
        result=result+upCount;
        upCount++;
        counter++;
      }
      else{
        upCount++;
      }
    }
    return result;
  }
}
