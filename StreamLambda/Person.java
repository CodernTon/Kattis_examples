package StreamLambda;

public class Person{
  private String firstName;
  private String lastName;
  private Integer age;

  public Person(String firstName, String lastName, Integer age){
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }

  public String getFirstName(){
    return this.firstName;
  }
  public Integer getAge(){
    return this.age;
  }
  public String getLastName(){
    return this.lastName;
  }

  @Override
  public String toString(){
    return firstName+" "+lastName+ " Age: "+age;
  }
}
