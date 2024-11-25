import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
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

      //turns rows into columns
      ArrayList<String> columns = new ArrayList<String>();
      for(int i = 0; i < rows.get(0).length(); i++){
        String columnValue = "";
        for(int j = 0; j < rows.size(); j++){
          columnValue += rows.get(j).charAt(i);
        }
        columns.add(columnValue);
      }

      String message = "";
      String alpha = "abcdefghijklmnopqrstuvwxyz";
      String[] alphabet = alpha.split("");
      for(int eachColumn = 0; eachColumn < columns.size(); eachColumn++){ //goes through each column
        String columnValue = columns.get(eachColumn);
        String[] columnValues = columnValue.split("");
        int[] count = new int[26];
        for(int eachLetter = 0; eachLetter < 26; eachLetter++){ //goes through each letter of the alphabet
          for(int i = 0; i < columnValues.length; i++){ //goes through the string
            if (columnValues[i].equals(alphabet[eachLetter])){
              count[eachLetter] ++;
            }
          }
        }
        int mostCommonAmt = 0;
        String mostCommonLetter = "";
        for(int j = 0; j < count.length; j++){
          if (count[j] > mostCommonAmt){
            mostCommonAmt = count[j];
            mostCommonLetter = alphabet[j];
          }
        }
        message += mostCommonLetter;
      }
      System.out.println(message);
      sc.close();

    }catch(FileNotFoundException e){
      System.out.println("FileNotFoundException");
      return;
    }
  }
}
