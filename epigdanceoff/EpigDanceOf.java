import java.util.Scanner;

public class EpigDanceOf{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int numberOfRows = sc.nextInt();
    int numberOfColumns = sc.nextInt();
    String [] addingAllCharacters = new String[numberOfColumns];
    String [] input = new String [numberOfRows];
    int counter1 = 0;
    for(int i = 0; i<numberOfRows; i++){
      input[i] = sc.next();
    }
    for(int i = 0; i<numberOfRows; i++){
      for (int j = 0; j<numberOfColumns; j++) {
        addingAllCharacters[j] += input[i].charAt(j);
      }
    }
    for(int i = 0; i < numberOfColumns; i++){
      if(!addingAllCharacters[i].contains("$")){
        counter1++;
      }
    }
    System.out.println(counter1+1);
  }
}
