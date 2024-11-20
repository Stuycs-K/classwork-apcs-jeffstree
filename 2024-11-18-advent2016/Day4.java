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
      String alpha = "abcdefghijklmnopqrstuvwxyz";
      String[] alphabet = alpha.split("");

      while(sc.hasNext()){
        String input = sc.next();
        String[] inputArr = input.split("-");

        String encryptedName = "";
        for (int i = 0; i < inputArr.length - 1; i++){
            encryptedName += inputArr[i];
        }
        int sectorID = Integer.parseInt(inputArr[inputArr.length - 1].substring(0, 3));
        String checksum = inputArr[inputArr.length - 1].substring(4, 9);

        int[] count = new int[26];
        for(int i = 0; i < count.length; i++){ //loops 26 times for each letter
            String[] nameArr = encryptedName.split("");
            for(int letter = 0; letter < nameArr.length; letter++){
                if (nameArr[letter].equals(alphabet[i])){
                    count[i] ++;
                }
            }
        }
        System.out.println(Arrays.toString(count));
      }
      sc.close();

    }catch(FileNotFoundException e){
      System.out.println("FileNotFoundException");
      return;
    }
  }
}