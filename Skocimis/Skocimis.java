import java.util.Arrays;
import java.util.Scanner;

public class Skocimis {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int [] kangaroo = new int[3];
        kangaroo[0]=sc.nextInt();
        kangaroo[1]=sc.nextInt();
        kangaroo[2]=sc.nextInt();
        Arrays.sort(kangaroo);

        int solution = kangaroo[1] - kangaroo[0] > kangaroo[2] - kangaroo[1] ? kangaroo[1] - kangaroo[0] - 1 : kangaroo[2] - kangaroo[1] - 1;
        System.out.println(solution);

    }
}
