import java.text.DecimalFormat;
import java.util.Scanner;

public class AboveAverage {
    public static void main(String []args){
        DecimalFormat myFormatter = new DecimalFormat("##0.000");
        Scanner sc = new Scanner(System.in);
        int k=0;
        int counter = sc.nextInt();
        int temp = counter;
        double [] result = new double[counter];
        while (counter>0) {
            int testcases = sc.nextInt();
            double better = 0;
            double avg = 0;
            double[] array = new double[testcases + 1];

            double totalScore = 0;
            for (int i = 0; i < testcases; i++) {
                array[i] = sc.nextDouble();
                totalScore += array[i];
            }
            avg = totalScore / testcases;

            for (int j = 0; j < testcases; j++) {
                if (avg < array[j]) {
                    better++;
                }
            }
            result[k]=100*(better/testcases);
            k++;
            counter--;
        }
        for (int i = 0; i<temp; i++){
            System.out.println(myFormatter.format(result[i])+"%");
        }
    }
}
