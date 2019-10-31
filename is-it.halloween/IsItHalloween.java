import java.util.Scanner;

public class IsItHalloween{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    String result = sc.nextLine();
    if (result.equals("OCT 31") || result.equals("DEC 25")){
      System.out.println("yup");
    }
    else {
      System.out.println("nope");
    }
  }
}
