import java.util.Scanner;

public class Tarifa {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int amountOfMb= sc.nextInt();
        int months= sc.nextInt();
        amountOfMb= amountOfMb*(months+1);
        int result = 0;
        int numberBuilder = 0;

        while(months>0){
            numberBuilder += sc.nextInt();
            months--;
        }
        result = amountOfMb-numberBuilder;
        System.out.println(result);
    }
}
