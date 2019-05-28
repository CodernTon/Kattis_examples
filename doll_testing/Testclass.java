import java.util.*;
import java.util.ArrayList;
import java.util.Comparator;

/*
Lagra all input i en lista

Sortera listan i sjunkande ordning efter första värdet

Sortera lista så att det skiljer åtminstonde värdet av 3:e värdet
mellan varje docka, detta ska göras i två olika listor.
Så använd deletefunktion när värdet är använt.
Dessa två listor presenteras sedan efter varande med "-" emellan
Gör sedan så programmet kan ta in mer än en dockomgång
Presentera i form av två listor med olika output
*/
public class Testclass{
  List <Doll> dollResult1;
  List <Doll> dollResult2;
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    List <Doll> dollList = new ArrayList<Doll>();
    List <Doll> finalList = new ArrayList<Doll>();
    List <Integer> dollsinList = new ArrayList<Integer>();

    Testclass Player = new Testclass();

    int numOfDolls=0;
    int [] value = new int[3];
    int [] dollsInList = new int[5];
    int counter = 0;

    Comparator<Doll> compHeight = (aHeight, bHeight) ->
        bHeight.getHeight().compareTo(aHeight.getHeight());

    System.out.println("Type testcase(0 to quit): ");
    while ((numOfDolls=sc.nextInt())!=0 && counter<5){
      //Insert function here
      /*
      for (int i =0; i<(numOfDolls*2); i++){
        value[0]=sc.nextInt();
        value[1]=sc.nextInt();
        value[2]=sc.nextInt();
        dollList.add(new Doll(value[0],value[1],value[2]));
      }*/

      if (numOfDolls==1){
        //TESTCASE
        numOfDolls=5;
        dollList=Player.testCase1();
      }
      if (numOfDolls==2){
        //TESTCASE
        numOfDolls=3;
        dollList=Player.testCase2();
      }
      if (numOfDolls==3){
        //TESTCASE
        numOfDolls=3;
        dollList=Player.testCase3();
      }
      if (numOfDolls==4){
        //TESTCASE
        numOfDolls=3;
        dollList=Player.testCase4();
      }



      //Sort the list in natural order
      Collections.sort(dollList, compHeight);

      //Code that sort the list correctly
      dollList=Player.sortTheList(dollList, numOfDolls);

      finalList.addAll(dollList);
      dollsinList.add(numOfDolls);

      dollList.clear();
      if (counter==4){
        break;
      }
      counter++;
    } //Outside loop
    Player.presentResult(finalList, dollsinList);
  }
  //Make a testcase
  public List<Doll> testCase1(){
    List<Doll> dollList = new ArrayList<Doll>();
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
    List<Doll> dollList = new ArrayList<Doll>();
    dollList.add(new Doll(100,100,3));
    dollList.add(new Doll(97,97,3));
    dollList.add(new Doll(94,94,3));
    dollList.add(new Doll(91,91,3));
    dollList.add(new Doll(88,88,3));
    dollList.add(new Doll(85,85,3));
    return dollList;
  }

  public List<Doll> testCase3(){
    List<Doll> dollList = new ArrayList<Doll>();
    dollList.add(new Doll(20,20,3));
    dollList.add(new Doll(19,19,2));
    dollList.add(new Doll(14,14,2));
    dollList.add(new Doll(15,15,2));
    dollList.add(new Doll(11,11,3));
    dollList.add(new Doll(10,10,2));
    return dollList;
  }

  public List<Doll> testCase4(){
    List<Doll> dollList = new ArrayList<Doll>();
    dollList.add(new Doll(20,20,2));
    dollList.add(new Doll(16,16,2));
    dollList.add(new Doll(18,18,2));
    dollList.add(new Doll(14,14,2));
    dollList.add(new Doll(12,12,2));
    dollList.add(new Doll(10,10,2));
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
    //Test if list is okey
    Doll dollTemp1;
    Doll dollTemp2;
    dollResult1 = new ArrayList<Doll>();
    dollResult2 = new ArrayList<Doll>();

    int temp1a = 0;
    int temp1b = 0;
    int temp3 = 0;

    int counter = 0;
    int dollResult1Counter=0;
    int dollResult2Counter=0;

    //add first value to both list
    dollResult1.add(dollList.get(0));
    dollResult2.add(dollList.get(1));
    dollList.remove(0);
    dollList.remove(0);

    while( dollList.size() > 0 && (counter<=numOfDolls*2)){
      dollTemp1 = dollList.get(0);

      dollTemp2 = dollResult1.get(dollResult1Counter);
      temp1a = dollTemp2.getHeight();
      //System.out.println(temp1a);
      temp1b = dollTemp1.getHeight();
      temp3 = dollTemp2.getWidth();
      temp3= temp3*2;
      temp1a = temp1a-temp3;
      //System.out.println(temp1a);
      //System.out.println(temp1b);
      //
      if(temp1a >= temp1b && dollResult1.size()<(numOfDolls)){
        //System.out.println("Added to list 1");
        dollResult1.add(dollTemp1);
        dollList.remove(0);
        dollResult1Counter++;
      }
      else {
        //System.out.println("Added to list 2");
        dollResult2.add(dollTemp1);
        dollList.remove(0);
        dollResult2Counter++;
      }
      counter++;
    }
    dollResult1.addAll(dollResult2);
    return dollResult1;
  }
}

class Doll{
  int height;
  int diameter;
  int width;

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
