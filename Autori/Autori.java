import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;

public class Autori{
  public static void main(String [] args ) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    try{
      String [] input = br.readLine().split("-");
      StringBuilder sb = new StringBuilder();
      for (int i =0; i<input.length; i++){
        sb.append(input[i].substring(0,1));
      }
      bw.append(sb+"\n");

      bw.flush();
      bw.close();
      br.close();
    } catch (IOException e){
      System.out.println("Smth went wrong:");
    }
  }
}
