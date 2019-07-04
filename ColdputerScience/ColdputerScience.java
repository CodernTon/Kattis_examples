import java.util.Scanner;

public class ColdputerScience {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int numberOfTemperatures = sc.nextInt();
        int temperature = 0;
        int amountOfTemperaturesLessThanZero=0;
        for (int i = 0; i<numberOfTemperatures; i++){
            temperature= sc.nextInt();
            if(temperature<0){
                amountOfTemperaturesLessThanZero +=1;
            }
        }
        System.out.println(amountOfTemperaturesLessThanZero);
    }
}
