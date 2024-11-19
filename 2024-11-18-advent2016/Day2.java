import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

public class Day2{
  public static void main(String[] args){
    try{
      File day2 = new File("day2.txt");
      Scanner sc = new Scanner(day2);
      
      sc.close();

    }catch(FileNotFoundException e){
      System.out.println("FileNotFoundException");
      return;
    }
  }
}
