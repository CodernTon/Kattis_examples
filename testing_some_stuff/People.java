package testing_some_stuff;


public class People{
  private String name;
  private int age;
  private Education education;
  private Work work;


  public People(String name, int age, Education education, Work work){
    this.name = name;
    this.age = age;
    this.education = education;
    this.work = work;
  }
  @Override
  public String toString(){
    return "Name: " + name + " Age: " + age;
  }
}
