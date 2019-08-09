package scalingrecipes;

import java.util.Scanner;
import java.util.Locale;
import java.util.List;
import java.util.ArrayList;

public class ScalingRecipes{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    List <Ingredient> ingredientList = new ArrayList<Ingredient>();
    int numberOfCases = sc.nextInt();
    int [] numberOfIngredients = new int [numberOfCases];
    int [] numberOfPortionsWrittenFor = new int [numberOfCases];
    int [] numberOfDesiredPortions = new int [numberOfCases];
    int counter = 1;
    for (int i = 0; i<numberOfCases; i++){
      numberOfIngredients[i]=sc.nextInt();
      numberOfPortionsWrittenFor[i]=sc.nextInt();
      numberOfDesiredPortions[i]= sc.nextInt();

      for (int j = 0; j<numberOfIngredients[i]; j++){
        String name = sc.next();
        float weight = sc.nextFloat();
        float percentage = sc.nextFloat();
        ingredientList.add(new Ingredient(name, weight, percentage));
      }
    }
    List<Ingredient> tempLista = new ArrayList<>();
    tempLista.addAll(ingredientList);
    calculateResult(ingredientList, numberOfCases, numberOfIngredients, numberOfPortionsWrittenFor, numberOfDesiredPortions);
    //System.out.println(tempLista.toString());
    printResult(tempLista, numberOfCases, numberOfIngredients);
  }
  public static void printResult(List<Ingredient> resultList, int numberOfCases, int [] numberOfIngredients){
    int counter = 1;
    for (int j = 0; j < numberOfCases; j++){
      System.out.println("Recipe # "+ counter);
      for (int i = 0; i<numberOfIngredients[j]; i++){
        String name = resultList.get(0).getNameOfDish();
        float weight = resultList.get(0).getWeightOfIngredients();
        System.out.println(name+" "+weight);
        resultList.remove(0);
      }
      System.out.println("----------------------------------------");
      counter++;
    }
  }
  //What to do:
  // scaling factor equals numberOfDesiredPortions divided by numberOfPortionsWrittenFor
  // multiply the weight of the main (100%) ingredient by the scaling factor to get scaled weight
  // get scaled weight of every other ingredient by multiplying its bakers
  //precentage by the scaled weight of main ingredient.
  public static void calculateResult(List <Ingredient> ingredientList, int numberOfCases, int [] numberOfIngredients, int [] numberOfPortionsWrittenFor, int [] numberOfDesiredPortions){
    List <Ingredient> tempList = new ArrayList<>();
    for (int j = 0; j < numberOfCases; j++){
      float scalingFactor = (float) numberOfDesiredPortions[j]/numberOfPortionsWrittenFor[j];
      for (int i = 0; i<numberOfIngredients[j]; i++){
        if (ingredientList.get(i).getBakersPrecentage()==100.0){
          float weight = ingredientList.get(i).getWeightOfIngredients();
          Ingredient ingredient = ingredientList.get(i);
          ingredient.setWeightOfIngredients(scalingFactor*weight);
          tempList.add(ingredient);
        }
      }
      for (int i = 0; i<numberOfIngredients[j]; i++){
        if (ingredientList.get(0).getBakersPrecentage()==100.0){
          ingredientList.remove(0);
        }
        else {
          Ingredient ingredient = ingredientList.get(0);
          double tempVar = (ingredientList.get(0).getBakersPrecentage()*tempList.get(0).getWeightOfIngredients());
          tempVar = tempVar/100;
          double roundedToOneDigit = Math.round(tempVar * 10)/10.0;
          float temps = (float) roundedToOneDigit;
          ingredient.setWeightOfIngredients(temps);
          ingredientList.remove(0);
        }
      }
      tempList.remove(0);
    }
  }
}
class Ingredient{
  public String nameOfDish;
  public float weightOfIngredient;
  public float bakersPrecentage;

  public Ingredient(String nameOfDish, float weightOfIngredient, float bakersPrecentage){
    this.nameOfDish = nameOfDish;
    this.weightOfIngredient = weightOfIngredient;
    this.bakersPrecentage = bakersPrecentage;
  }

  public String getNameOfDish(){
    return this.nameOfDish;
  }
  public float getWeightOfIngredients(){
    return this.weightOfIngredient;
  }
  public float getBakersPrecentage(){
    return this.bakersPrecentage;
  }
  public void setWeightOfIngredients(float weightOfIngredient){
    this.weightOfIngredient = weightOfIngredient;
  }

  @Override
  public String toString(){
    return nameOfDish+" "+weightOfIngredient;
  }
}
