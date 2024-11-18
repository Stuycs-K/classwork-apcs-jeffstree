import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day1{
  public static void main(String[] args){
    try{
      File day1 = new File("day1.txt");
      Scanner sc = new Scanner(day1);

      int xcoor = 0;
      int ycoor = 0;

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
