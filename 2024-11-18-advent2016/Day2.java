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

        int x = 1, y = 1;
        for (int i = 0; i < movement.length; i++){
          if (movement[i].equals("U"))y++;
          if (movement[i].equals("R"))x++;
          if (movement[i].equals("D"))y--;
          if (movement[i].equals("L"))x--;

          if (x < 0) x = 0;
          if (x > 2) x = 2;
          if (y < 0) y = 0;
          if (y > 2) y = 2;
        }
        System.out.println(x + ", " + y);

      }
      
      sc.close();

    }catch(FileNotFoundException e){
      System.out.println("FileNotFoundException");
      return;
    }
  }
}