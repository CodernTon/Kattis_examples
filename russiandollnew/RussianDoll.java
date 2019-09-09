import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

/**
 * Program that sort Russian dolls
 *
 *
 * @author  Anton Lyngfelt
 * @version 1.0
 * @since   2019-05-20
 */
public class RussianDoll{


    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Random rand;
        List <Doll> dollList = new ArrayList<>();
        List <Doll> unSortedDollList = new ArrayList<>();
        List <Doll> finalList = new ArrayList<>();
        List <Integer> dollsInList = new ArrayList<>();

        RussianDoll Player = new RussianDoll();

        int numOfDolls;
        int [] value = new int[3];
        int counter = 0;

        Comparator<Doll> compHeight = (aHeight, bHeight) ->
                bHeight.getHeight().compareTo(aHeight.getHeight());

        Comparator<Doll> compWidth = (aWidth, bWidth) ->
                bWidth.getWidth().compareTo(bWidth.getWidth());

        while ((numOfDolls=sc.nextInt())!=0 && numOfDolls<201 && counter<5){

             for (int i =0; i<(numOfDolls*2); i++){
                value[0]=sc.nextInt();
                value[1]=sc.nextInt();
                value[2]=sc.nextInt();
                dollList.add(new Doll(value[0],value[1],value[2]));
            }

            //Sort the list in natural order
            Collections.sort(dollList, compHeight);
            Collections.sort(dollList, compWidth);

            System.out.println(dollList);

            //Place the sorted list in a temp variable in case it cant be sorted first time
            unSortedDollList.addAll(dollList);

            //Code that sort the list
            dollList=Player.sortTheList(dollList, numOfDolls);

            //If it is a error with list, it tries new values
            try{
                while(dollList.size()==0){
                    rand = new Random();
                    int r = rand.nextInt(numOfDolls)+1;
                    int q = rand.nextInt(numOfDolls)+1;


                    dollList.addAll(unSortedDollList);
                    Collections.swap(dollList, r, q);
                    dollList=Player.sortTheList(dollList, numOfDolls);
                }
            }catch(Exception e){
                System.out.println("Here is error!");
                //dollList.addAll(unSortedDollList);
            }

            //Clear the List, so it can use it again!
            unSortedDollList.clear();

            //Add to final list
            finalList.addAll(dollList);
            //Add number of dolls to list
            dollsInList.add(numOfDolls);
            //Clear List
            dollList.clear();
            //Break outside loop
            if (counter==4){
                break;
            }
            counter++;
        }
        //Call the method to present all the results
        Player.presentResult(finalList, dollsInList);
    }
    //Present result, works
    public void presentResult(List <Doll> finalList, List <Integer> numOfDolls){
        for(int j = 0; j<numOfDolls.size();j++){
            if (j>0){
                System.out.println();
            }
            for(int i = 0; i<numOfDolls.get(j);i++){
                Doll test = finalList.get(0);
                System.out.println(test.getHeight()+" "+test.getDiameter()+" "+test.getWidth());
                finalList.remove(0);
            }
            System.out.println("-");
            for(int i = 0; i<numOfDolls.get(j);i++){
                Doll test = finalList.get(0);
                System.out.println(test.getHeight()+" "+test.getDiameter()+" "+test.getWidth());
                finalList.remove(0);
            }
        }
    }

    public List <Doll> sortTheList(List<Doll> dollList, int numOfDolls){
        //Test if list is okay
        Doll dollTemp1;
        Doll dollTemp2;
        Doll dollTemp3;

        List<Doll> dollResult1 = new ArrayList<>();
        List<Doll> dollResult2 = new ArrayList<>();

        int temp1a = 0;
        int temp1b = 0;
        int temp3  = 0;

        int temp2a = 0;
        int temp2b = 0;
        int temp4  = 0;

        int counter = 0;
        int dollResult1Counter=0;
        int dollResult2Counter=0;

        //add first value to both list
        dollResult1.add(dollList.get(0));
        dollResult2.add(dollList.get(1));
        dollList.remove(0);
        dollList.remove(0);
        int temp= (numOfDolls*2)-2;
        while( dollList.size() > 0 && (counter<=temp)){
            dollTemp1 = dollList.get(0);

            dollTemp2 = dollResult1.get(dollResult1Counter);

            dollTemp3 = dollResult2.get(dollResult2Counter);

            temp1a = dollTemp2.getHeight();
            temp1b = dollTemp1.getHeight();
            temp3 = dollTemp2.getWidth();
            temp3= temp3*2;
            temp1a = temp1a-temp3;

            temp2a = dollTemp3.getHeight();
            temp2b = dollTemp1.getHeight();
            temp4 = dollTemp3.getWidth();
            temp4= temp4*2;
            temp2a = temp2a-temp4;

            if(temp1a >= temp1b && dollResult1.size()<(numOfDolls)){
                //System.out.println("Added to list 1");
                dollResult1.add(dollTemp1);
                dollList.remove(0);
                dollResult1Counter++;
                counter++;
            }
            else if(temp2a >= temp2b && dollResult2.size()<(numOfDolls)) {
                //System.out.println("Added to list 2");
                dollResult2.add(dollTemp1);
                dollList.remove(0);
                dollResult2Counter++;
                counter++;
            }
            else{
                //Only gets here if it needs to change start values.

                //System.out.println(dollResult1);
                //System.out.println();
                //System.out.println(dollResult2);

                dollResult1.clear();
                return dollResult1;
            }
        }
        //Adds all values to list
        dollResult1.addAll(dollResult2);
        return dollResult1;
    }
}
class Doll{
    private int height;
    private int diameter;
    private int width;
    public Doll(int height, int diameter, int width){
        this.height=height;
        this.diameter=diameter;
        this.width=width;
    }
    public Integer getHeight() {
        return height;
    }
    public Integer getDiameter() {
        return diameter;
    }
    public Integer getWidth() {
        return width;
    }
    @Override
    public String toString(){
        return height+" "+diameter+" "+width+"\n";
    }
}
