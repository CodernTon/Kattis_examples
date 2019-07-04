import java.util.Scanner;

public class ABC {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int value1 = sc.nextInt();
        int value2 = sc.nextInt();
        int value3 = sc.nextInt();

        int A = 0;
        int B = 0;
        int C = 0;

        String letters = sc.next();

        if(value1<value2 && value1<value3){
            A =value1;
        }
        else if (value2<value1 && value2<value3){
            A =value2;
        }
        else{
            A =value3;
        }

        if(value1>value2 && value1<value3){
            B =value1;
        }

        else if(value1<value2 && value1>value3){
            B =value1;
        }
        else if (value2<value1 && value2>value3){
            B =value2;
        }
        else if (value2>value1 && value2<value3){
            B =value2;
        }
        else{
            B =value3;
        }

        if(value1>value2 && value1>value3){
            C =value1;
        }
        else if (value2>value1 && value2>value3){
            C =value2;
        }
        else{
            C =value3;
        }

        if(letters.equals("ABC")){
            System.out.println(A+" "+B+" "+C);
        }
        if(letters.equals("BAC")){
            System.out.println(B+" "+A+" "+C);
        }
        if(letters.equals("BCA")){
            System.out.println(B+" "+C+" "+A);
        }
        if(letters.equals("ACB")){
            System.out.println(A+" "+C+" "+B);
        }
        if(letters.equals("CAB")){
            System.out.println(C+" "+A+" "+B);
        }
        if(letters.equals("CBA")){
            System.out.println(C+" "+B+" "+A);
        }
    }
}
