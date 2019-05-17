import java.util.List;
import java.util.Arrays;
import java.util.Comparator;


public class StreamEx01{
  public static void main(String[]args){
    List<Person> people = Arrays.asList(
      new Person("Anton", "Lyngfelt",23),
      new Person("Erik", "Oscarsson",45),
      new Person("Carl","Davidsson",15)
      );

    System.out.println("\nSort reverse by age:");
    Comparator<Person> comp = (aName, bName) ->
        aName.getAge().compareTo(bName.getAge());
    //Make a stream
    people.stream()
        .sorted(comp.reversed())
        .forEach(System.out::println);

  }
}
