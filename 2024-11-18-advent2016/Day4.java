import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

public class Day4{
  public static void main(String[] args){
    try{
      File day4 = new File("day4.txt");
      Scanner sc = new Scanner(day4);

      int sum = 0;
      while(sc.hasNext()){
        String input = sc.next();
        System.out.println(input);
      }
      sc.close();

    }catch(FileNotFoundException e){
      System.out.println("FileNotFoundException");
      return;
    }
  }
}