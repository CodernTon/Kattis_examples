import java.util.*;

public class R2{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int one = sc.nextInt();
    int result = sc.nextInt();
    R2 bla = new R2();
    int two= bla.method(one, result);
    System.out.println(two);
  }
  public int method(int one, int result){

    int two = (result*2)-one;
    return two;
  }
}
