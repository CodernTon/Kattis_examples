package imageprocessing;

import java.util.*;

public class ImageProcessing{
  public static void main(String [] args){
    try {Scanner sc = new Scanner(System.in);
      int heightImage = sc.nextInt(), widthImage = sc.nextInt(), heightKernel = sc.nextInt(), widthKernel = sc.nextInt();
      int [] [] image = new int [heightImage][widthImage];
      ArrayList <Integer> kernelList = new ArrayList<>();
      int [] [] result = new int [heightImage-heightKernel+1][widthImage-widthKernel+1];
      for (int i = 0; i<widthImage; i++){
        for (int j = 0; j<heightImage; j++){
          image[i][j]= sc.nextInt();
        }
      }
      for (int i = 0; i < widthKernel; i++){
        for (int j = 0; j < heightKernel; j++){
          kernelList.add(sc.nextInt());
        }
      }
      Collections.reverse(kernelList);

      for (int i = 0; i<heightImage-heightKernel+1; i++){
        for (int j = 0; j<widthImage-widthKernel+1; j++){
          result[i][j] = solve(kernelList, image, i, j, heightKernel, widthKernel);
        }
      }

      for (int i = 0; i<heightImage-heightKernel+1; i++){
        for (int j = 0; j<widthImage-widthKernel+1; j++){
          System.out.print(result[i][j]+" ");
        }
        System.out.println();
      }
    } catch (Exception e){}
    }
    public static int solve(List<Integer> kernelList, int [][]image, int x, int y, int heightKernel, int widthKernel){
      int count = 0;
      int result = 0;
      for (int i = x; i<x+heightKernel;i++){
        for (int j = y; j<y+widthKernel; j++){
          result += kernelList.get(count) * image[i][j];
          count++;
        }
      }
      return result;
    }
  }
