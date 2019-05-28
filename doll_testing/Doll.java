public class Dosll{
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
