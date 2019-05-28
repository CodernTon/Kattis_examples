package passwordgenerator;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class Passwordgenerator{

  private static final Random RANDOM = new SecureRandom();
  private static final String ALPHABET =
      "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

  public static void main(String[]args){

    int passwordLength = getInput();
    Boolean ifSpecialSigns = askForSigns();

    // Generate Secure Password
    String password = generatePassword(passwordLength,ifSpecialSigns);

    // Print out password value
    System.out.println("Secure password: " + password);
  }
  public static String generatePassword(int length, boolean ifSpecialSigns) {
    StringBuilder returnValue = new StringBuilder(length);

    for (int i = 0; i < length; i++) {
      returnValue.append(ALPHABET.charAt(RANDOM.nextInt(ALPHABET.length())));
    }
    return new String(returnValue);
  }

  public static int getInput(){
    Scanner sc = new Scanner(System.in);
    System.out.println("How many characters do you want in your password? ");
    // Define desired password length
    int passwordLength = sc.nextInt();
    return passwordLength;
  }

  public static Boolean askForSigns(){
    Scanner sc = new Scanner(System.in);
    boolean value;
    System.out.println("Do you want to add specialsigns? (y/n)");
    char decision = sc.next().charAt(0);
    while(true){
      if (decision == 'y'){
        value = true;
        break;
      }
      else{
        value = false;
        break;
      }
    }
    return value;
  }
}
