import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class  Mjehuric{
  public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    ArrayList <Integer> numbers = new ArrayList<>();
    for (int i =0; i<5; i++){
      numbers.add(sc.nextInt());
    }
    calculate(numbers);
  }
  public static void calculate(ArrayList<Integer>numbers){
    int temp = 0;
    for (int i = 0; i<numbers.size();i++){
      for (int j = 0; j<4; j++){
        if (numbers.get(j)>numbers.get(j+1)){
          temp=numbers.get(j);
          numbers.set(j, numbers.get(j+1));
          numbers.set(j+1, temp);
          for (int k = 0; k<5; k++){
            System.out.print(numbers.get(k)+" ");
          }
          System.out.println();
        }
      }
    }
  }
}
