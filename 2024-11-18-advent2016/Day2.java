import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

public class Day2{
  public static void main(String[] args){
    try{
      File day2 = new File("day2.txt");
      Scanner sc = new Scanner(day2);
      int[][] keypad = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
      while(sc.hasNext()){
        String input = sc.next();
        String[] movement = input.split("");
        System.out.println(Arrays.toString(movement));
        int x = 1, y = 1;
        

      }
      
      sc.close();

    }catch(FileNotFoundException e){
      System.out.println("FileNotFoundException");
      return;
    }
  }
}
