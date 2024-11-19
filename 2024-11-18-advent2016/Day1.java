import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

public class Day1{
  public static void main(String[] args){
    try{
      File day1 = new File("day1.txt");
      Scanner sc = new Scanner(day1);

      int x = 0, y = 0, facing = 0;

      while(sc.hasNext()){
        String input = sc.next();
        String[] step = new String[]{input.substring(0,1), input.substring(1,input.length() - 1)};

        if (step[0].equals("L")){
          facing = (facing + 3) % 4;
        }
        else{
          facing = (facing + 1) % 4;
        }

        int distance = Integer.parseInt(step[1]);
        if (facing == 0){
          y += distance;
        }
        else if (facing == 1){
          x += distance;
        }
        else if (facing == 2){
          y -= distance;
        }
        else if (facing == 3){
          x -= distance;
        }

      }

      System.out.println(Math.abs(x) + Math.abs(y));
      sc.close();

    }catch(FileNotFoundException e){
      System.out.println("FileNotFoundException");
      return;
    }
  }
}
