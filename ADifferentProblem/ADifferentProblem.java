import java.util.Scanner;

public class ADifferentProblem {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        long [] input = new long [2];
        while (sc.hasNextLong()){
            input[0]=sc.nextLong();
            input[1]=sc.nextLong();
            System.out.println(Math.abs(input[0]-input[1]));
        }
    }
}
