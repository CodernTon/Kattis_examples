package beavergnaw;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class BeaverGnaw{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    List <Double> result = new ArrayList<>();
    while(true){
      double linearUnits=sc.nextDouble();
      double cubicUnits=sc.nextDouble();
      if(linearUnits==0 || cubicUnits==0){
        break;
      }
      double totalVolume=Math.PI*Math.pow((linearUnits/2), 2)*linearUnits;
      double eaten = cubicUnits*1.5;
      totalVolume =totalVolume-eaten;
      totalVolume/=Math.PI;
      totalVolume/=2;
      totalVolume=Math.cbrt(totalVolume);
      result.add(totalVolume*2);
    }
    for (int i = 0; i<result.size(); i++){
      System.out.println(result.get(i));
    }
  }
}
