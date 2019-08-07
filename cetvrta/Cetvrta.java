package cetvrta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cetvrta {
    public static void main(String []args ){
        Scanner sc = new Scanner(System.in);
        List <Integer> list = new ArrayList<Integer>();
        int resultx = 0;
        int resulty = 0;

        for(int i = 0; i<6; i++){
            list.add(sc.nextInt());
        }
        if     ( list.get(0)==list.get(2) ){ resultx = list.get(4); }
        if     ( list.get(2)==list.get(4) ){ resultx = list.get(0); }
        if     ( list.get(0)==list.get(4) ){ resultx = list.get(2); }


        if     ( list.get(1)==list.get(3) ){ resulty = list.get(5); }
        if     ( list.get(3)==list.get(5) ){ resulty = list.get(1); }
        if     ( list.get(1)==list.get(5) ){ resulty = list.get(3); }

        System.out.println(resultx +"  " + resulty);
    }
}
