import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

public class Day6{
  public static void main(String[] args){
    try{
      File day6 = new File("day6.txt");
      Scanner sc = new Scanner(day6);
      while(sc.hasNext()){
        System.out.println(sc.next());
      }
      sc.close();

    }catch(FileNotFoundException e){
      System.out.println("FileNotFoundException");
      return;
    }
  }
}
