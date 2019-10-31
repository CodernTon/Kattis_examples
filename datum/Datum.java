import java.util.Scanner;

public class Datum{
  public static int january=3;
  public static int february=6;
  public static int mars=6;
  public static int april=5;
  public static int may=4;
  public static int juni=0;
  public static int july=2;
  public static int august=5;
  public static int september=1;
  public static int october=3;
  public static int november=6;
  public static int december=1;

  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int day = sc.nextInt();
    int month = sc.nextInt();
    int startDay=getStartDay(month);
    int currentDay=(startDay+day)%7;
    printDay(currentDay);
  }

  public static int getStartDay(int month){
    switch (month) {
      case 1:
        month=january;
          break;
      case 2:
        month=february;
          break;
      case 3:
        month=mars;
          break;
      case 4:
        month=april;
          break;
      case 5:
        month=may;
          break;
      case 6:
        month=juni;
          break;
      case 7:
        month=july;
          break;
      case 8:
        month=august;
          break;
      case 9:
        month=september;
          break;
      case 10:
        month=october;
          break;
      case 11:
        month=november;
          break;
      case 12:
        month=december;
          break;
    }
    return month;
  }
  public static void printDay(int currentDay){
    switch (currentDay) {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
          break;
      case 3:
        System.out.println("Wednesday");
          break;
      case 4:
        System.out.println("Thursday");
          break;
      case 5:
        System.out.println("Friday");
          break;
      case 6:
        System.out.println("Saturday");
          break;
      case 0:
        System.out.println("Sunday");
          break;
    }
  }
}
