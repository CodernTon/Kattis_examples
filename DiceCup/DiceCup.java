import java.io.*;
import java.util.Arrays;


public class DiceCup {
    public static void main (String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int [] in = Arrays.stream(input.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        if (in[0] == in[1]){
          bw.append(in[0]+1+"\n");
        }
        else {
          int numbOfAns= Math.abs(in[0]-in[1])+1;
          int startValue = Math.min(in[0],in[1])+1;

          for (int i = startValue; i < (startValue+numbOfAns);i++){
            bw.append(i + "\n");
          }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
