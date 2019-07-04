import java.io.*;

public class ClosingTheLoop {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;
        while (!(line = br.readLine()).equals("0 0 0 0")){
            String [] arr = line.split(" ");
            Player player = new Player(Integer.parseInt(arr[0]),Integer.parseInt(arr[1]),
                    Integer.parseInt(arr[2]),Integer.parseInt(arr[3]));
            int degrees = 1080;
            int makeToDegrees= 9;
            int temp=0;
            if (player.getValue1()>player.getValue0()){
                temp = player.getValue0()+40;
                player.setValue0(temp);
            }
            degrees+= (temp-player.getValue1())*makeToDegrees;

            if (player.getValue1()>player.getValue2()){
                temp = player.getValue1()-40;
                player.setValue1(temp);
            }
            degrees+= (player.getValue2()-temp)*makeToDegrees;

            if (player.getValue3()>player.getValue2()){
                temp = player.getValue2()+40;
                player.setValue2(temp);
            }
            degrees+= (player.getValue2()-player.getValue3())*makeToDegrees;
            bw.write(degrees + "\n");
        }
        bw.close();
        br.close();

    }
}

class Player{
    private int value0;
    private int value1;
    private int value2;
    private int value3;

    Player(int value0, int value1, int value2, int value3) {
        this.value0 = value0;
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    public void setValue0(int value0) {
        this.value0 = value0;
    }

    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }

    public int getValue3() {
        return value3;
    }

    public int getValue2() {
        return value2;
    }

    public int getValue1() {
        return value1;
    }

    public int getValue0() {
        return value0;
    }
}
