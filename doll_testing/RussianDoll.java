import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

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

        //System.out.println("Type testcase(0 to quit): "); //First message, not needed
        while ((numOfDolls=sc.nextInt())!=0 && numOfDolls<201 && counter<5){
            //Type values manually
            /*
             for (int i =0; i<(numOfDolls*2); i++){
                value[0]=sc.nextInt();
                value[1]=sc.nextInt();
                value[2]=sc.nextInt();
                dollList.add(new Doll(value[0],value[1],value[2]));
            }

             */

          //Different test cases! Just type number on test case: 1 2 3 4 etc.

          if (numOfDolls==1){
            //TESTCASE 1
            numOfDolls=5;
            dollList=Player.testCase1();
          }
          else if (numOfDolls==2){
            //TESTCASE 2
            numOfDolls=3;
            dollList=Player.testCase2();
          }
          else if (numOfDolls==3){
            //TESTCASE 3
            dollList=Player.testCase3();
          }
          else if (numOfDolls==4){
            //TESTCASE 4
            numOfDolls=3;
            dollList=Player.testCase4();
          }
          else if (numOfDolls==5){
            //TESTCASE 5(Every other int except 1-4)
            numOfDolls=3;
            dollList=Player.testCase5();
          }
          else if (numOfDolls==6){
              //TESTCASE 5(Every other int except 1-4)
              numOfDolls=5;
              dollList=Player.testCase6();
          }
          else if (numOfDolls==7){
              //TESTCASE 5(Every other int except 1-4)
              numOfDolls=3;
              dollList=Player.testCase7();
          }
          else{
            numOfDolls=5;
            dollList=Player.testCase8();
          }

            //Sort the list in natural order
            Collections.sort(dollList, compHeight);

            //Place the sorted list in a temp variable in case it cant be sorted first time
            unSortedDollList.addAll(dollList);

            //Code that sort the list
            dollList=Player.sortTheList(dollList, numOfDolls);

            //If it is a error with list, it tries new values
            try{
                int q=1;
                while(dollList.size()==0){
                    dollList.addAll(unSortedDollList);
                    Collections.swap(dollList, q, q+1);
                    dollList=Player.sortTheList(dollList, numOfDolls);
                    q++;
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
    //Testcases
    public List<Doll> testCase1(){
        List<Doll> dollList = new ArrayList<>();
        dollList.add(new Doll(100,100,1));
        dollList.add(new Doll(97,97,3));
        dollList.add(new Doll(98,98,1));
        dollList.add(new Doll(96,96,1));
        dollList.add(new Doll(94,94,1));
        dollList.add(new Doll(92,92,1));
        dollList.add(new Doll(90,90,1));
        dollList.add(new Doll(88,88,1));
        dollList.add(new Doll(86,86,1));
        dollList.add(new Doll(84,84,1));
        return dollList;
    }
    public List<Doll> testCase2(){
        List<Doll> dollList = new ArrayList<>();
        dollList.add(new Doll(100,100,3));
        dollList.add(new Doll(97,97,3));
        dollList.add(new Doll(94,94,3));
        dollList.add(new Doll(91,91,3));
        dollList.add(new Doll(88,88,3));
        dollList.add(new Doll(85,85,3));
        return dollList;
    }

    public List<Doll> testCase3(){
        List<Doll> dollList = new ArrayList<>();
        dollList.add(new Doll(20,20,3));
        dollList.add(new Doll(19,19,2));
        dollList.add(new Doll(14,14,2));
        dollList.add(new Doll(15,15,2));
        dollList.add(new Doll(11,11,3));
        dollList.add(new Doll(10,10,2));
        return dollList;
    }
    public List<Doll> testCase4(){
        List<Doll> dollList = new ArrayList<>();
        dollList.add(new Doll(20,20,2));
        dollList.add(new Doll(16,16,2));
        dollList.add(new Doll(18,18,2));
        dollList.add(new Doll(14,14,2));
        dollList.add(new Doll(12,12,2));
        dollList.add(new Doll(10,10,2));
        return dollList;
    }
    public List<Doll> testCase5(){
        List<Doll> dollList = new ArrayList<>();
        dollList.add(new Doll(100,100,2));
        dollList.add(new Doll(95,95,1));
        dollList.add(new Doll(96,96,2));
        dollList.add(new Doll(93,93,2));
        dollList.add(new Doll(92,92,2));
        dollList.add(new Doll(89,89,2));
        return dollList;
    }
    public List<Doll> testCase6(){
        List<Doll> dollList = new ArrayList<>();
        dollList.add(new Doll(100,100,1));
        dollList.add(new Doll(98,98,2));
        dollList.add(new Doll(97,97,1));
        dollList.add(new Doll(95,95,1));
        dollList.add(new Doll(94,94,2));
        dollList.add(new Doll(93,93,1));
        dollList.add(new Doll(90,90,2));
        dollList.add(new Doll(89,89,2));
        dollList.add(new Doll(86,86,2));
        dollList.add(new Doll(85,85,2));
        return dollList;
    }
    public List<Doll> testCase7(){
        List<Doll> dollList = new ArrayList<>();
        dollList.add(new Doll(100,100,2));
        dollList.add(new Doll(99,99,3));
        dollList.add(new Doll(96,96,2));
        dollList.add(new Doll(93,93,2));
        dollList.add(new Doll(92,92,2));
        dollList.add(new Doll(88,88,2));
        return dollList;
    }
    public List<Doll> testCase8(){
        List<Doll> dollList = new ArrayList<>();
        dollList.add(new Doll(100,100,2));
        dollList.add(new Doll(99,99,3));
        dollList.add(new Doll(96,96,2));
        dollList.add(new Doll(93,93,2));
        dollList.add(new Doll(92,92,2));
        dollList.add(new Doll(89,89,2));
        dollList.add(new Doll(88,88,2));
        dollList.add(new Doll(82,82,2));
        dollList.add(new Doll(75,75,2));
        dollList.add(new Doll(65,65,2));
        return dollList;
    }

    //Present result
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
                /*
                System.out.println(dollResult1);
                System.out.println();
                System.out.println(dollResult2);
                 */
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
