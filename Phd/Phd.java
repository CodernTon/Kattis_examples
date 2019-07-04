import java.util.Scanner;

public class Phd {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        for (int i = 0; i < testcases; i++) {
            String input = sc.next();
            if(input.equals("P=NP")){
                System.out.println("skipped");
            }
            else{
                String [] inputs= input.split("\\+");
                System.out.println(Integer.parseInt(inputs[0])+Integer.parseInt(inputs[1]));
            }
        }
    }
}
