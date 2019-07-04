import java.util.Scanner;

public class Railroad {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int amountOfMb= sc.nextInt();
        int months= sc.nextInt();

        if(0==months%2){
            System.out.println("possible");
        }
        else{
            System.out.println("impossible");
        }
    }
}
