import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Day6{
  public static void main(String[] args){
    try{
      File day6 = new File("day6.txt");
      Scanner sc = new Scanner(day6);

      ArrayList<String> rows = new ArrayList<String>();
      while(sc.hasNext()){
        rows.add(sc.next());
      }

      //TURN ROWS INTO COLUMNS
      ArrayList<String> columns = new ArrayList<String>();
      for(int i = 0; i < rows.size(); i++){
        String value = rows.get(i);
        //WORK HERE
      }

      String alpha = "abcdefghijklmnopqrstuvwxyz";
      String[] alphabet = alpha.split("");
      int[] count = new int[26];
      for(int i = 0; i < count.length; i++){ //loops 26 times for each letter
        for(int j = 0; j < columns.size(); j++){ //loops through every string in input
          //TURN ROWS INTO COLUMNS, THEN WORK ON THIS
        }
      }

      sc.close();

    }catch(FileNotFoundException e){
      System.out.println("FileNotFoundException");
      return;
    }
  }
}
