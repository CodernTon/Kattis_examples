import java.util.Scanner;
import java.math.BigInteger;

public class AnagramCounting{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String inputWord= sc.nextLine();
    long numberOfDistinctCharacters=0, numberUniqueAnagrams=0, numberOfDubbelLetters;
    BigInteger C = new BigInteger("1");
    while (!inputWord.isEmpty()){

      numberOfDistinctCharacters = countNumberOfDistinctLetters(inputWord);
      numberOfDubbelLetters=inputWord.length()-numberOfDistinctCharacters;

      C = calculateUniqueAnagrams(numberOfDistinctCharacters, numberOfDubbelLetters);
      inputWord = sc.nextLine();
    }
    System.out.println(C);
  }

  public static BigInteger calculateUniqueAnagrams(long numberOfDistinctCharacters, long numberOfDubbelLetters){

    BigInteger A = new BigInteger("1");
    BigInteger B = new BigInteger("1");

    //long numberUniqueAnagramsT = 1;
    //long numberUniqueAnagramsN = 1;
    long totalNumberOfLetters = numberOfDistinctCharacters+numberOfDubbelLetters;
    for (int i = 1; i<numberOfDistinctCharacters+1+numberOfDubbelLetters; i++){
      A = A.multiply(BigInteger.valueOf(i));
      //numberUniqueAnagramsT*=i;
    }
    for (int i = 1; i<numberOfDubbelLetters+2; i++){
      B = B.multiply(BigInteger.valueOf(i));
      //numberUniqueAnagramsN*=i;
    }

    for (int i = 0; i<numberOfDistinctCharacters; i++){
      BigInteger counter = BigInteger.ZERO;
      for (int j = 0; j < totalNumberOfLetters; j++ ){
        if (numberOfDistinctCharacters.charAt(i)==totalNumberOfLetters.charAt(j)){
          counter = counter.add(BigInteger.ONE);
        }
      }
      A = A.divide(factorial(counter));
    }

    //long numberUniqueAnagrams=(numberUniqueAnagramsT/numberUniqueAnagramsN);
    return A;
  }

  public static long countNumberOfDistinctLetters(String word){
    return word.chars()
               .distinct()
               .count();
  }

  private static BigInteger factorial(BigInteger s) {
      if (s.equals(BigInteger.ZERO))
          return BigInteger.ONE;
      else
          return s.multiply(factorial(s.subtract(BigInteger.ONE)));
  }
}
