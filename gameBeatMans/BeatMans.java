import java.util.Scanner;

public class BeatMans{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    BeatMans beatMans = new BeatMans();
    int [][] gameBoard = new int [4][4];
    int playersMove=0;
    for (int i = 0; i<4; i++){
      for (int j =0; j<4; j++){
        gameBoard[i][j]=sc.nextInt();
      }
    }
    playersMove=sc.nextInt();

    beatMans.moveTheTiles(gameBoard, playersMove);
    beatMans.presentResult(gameBoard);
  }

  public void presentResult(int [][] gameBoard){
    for (int i = 0; i<4; i++){
      for (int j =0; j<4; j++){
        System.out.print(gameBoard[i][j]+" ");
      }
      System.out.println();
    }
  }
  public int [][] moveTheTiles(int [][] gameBoard, int playersMove){
    if (playersMove==0){
      int temp=gameBoard[0][0];
      for (int i = 1; i<4; i++){
        if (temp==gameBoard[0][i]){
          
        }
      }
    }
    else if (playersMove==1){

    }
    else if (playersMove==2){

    }
    else{

    }

    return gameBoard;
  }
}
