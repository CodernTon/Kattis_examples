import java.util.Scanner;

public class ThreeDStatues{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int statues=sc.nextInt();
    int printers = 1;
    int printedStatues=0;
    int days=0;
    while(statues>printedStatues){
      if(statues-printedStatues>printers){
        printers +=printers;
      }
      else{
        printedStatues+=printers;
      }
      days++;
    }
    System.out.println(days);
  }
}
