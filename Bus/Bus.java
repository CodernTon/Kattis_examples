import java.io.*;

public class Bus {
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out));

        int cases = Integer.parseInt(br.readLine());
        while(cases-- > 0){
            int times = Integer.parseInt(br.readLine());
            double sum = 0;
            for(int x = 0; x<times; x++){
                sum = 2*(sum+.5);
            }
            bw.write((int) sum + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
