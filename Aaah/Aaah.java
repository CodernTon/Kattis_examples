import java.util.Scanner;

public class Aaah {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String jonAbleToSay = sc.next();
        String doctorWant = sc.next();

        if(jonAbleToSay.length()>=doctorWant.length()){
            System.out.println("go");
        }
        else{
            System.out.println("no");
        }
    }
}
