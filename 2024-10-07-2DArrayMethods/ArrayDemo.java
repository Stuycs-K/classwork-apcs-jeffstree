import java.util.Arrays;
public class ArrayDemo{
  public static void main(String[]args){
    //You can now use Arrays.toString(yourArray) instead of writing arrayToString again.
    int[] ary1D;
    int[][] ary;

    System.out.println("Testing arrToString (1D)");

    ary1D = new int[]{1, 2, 3};
    System.out.println("My " + arrToString(ary1D) + " vs " + Arrays.toString(ary1D));
    //------
    System.out.println("\nTesting arrToString (2D)");

    ary = new int[][]{{1, 2, 3}, {4, 5, 6}};
    System.out.println("My [[1, 2, 3], [4, 5, 6]] vs " + arrToString(ary));
    //------
    System.out.println("\nTesting countZeros2D");
    
    ary = new int[][]{{1, 2, 3}, {0, 5}};
    System.out.println("My 1 vs " + countZeros2D(ary));

    ary = new int[][]{{1, 2, 3}, {4, 5}};
    System.out.println("My 0 vs " + countZeros2D(ary));

    ary = new int[][]{{0, 0, 0}, {-1, 0}};
    System.out.println("My 4 vs " + countZeros2D(ary));

    ary = new int[][]{{0, 0, 0}, {0, 0}};
    System.out.println("My 5 vs " + countZeros2D(ary));

    ary = new int[][]{{}};
    System.out.println("My 0 vs " +countZeros2D(ary));
    //------
    System.out.println("\narr2Dsum");

    ary = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9, 10}};
    System.out.println("Expected: 55; Result: "  + arr2DSum(ary));

    ary = new int[][]{{}, {}, {}};
    System.out.println("Expected: 0; Result: "  + arr2DSum(ary));

    ary = new int[][]{{2}, {5}, {-1}};
    System.out.println("Expected: 6; Result: "  + arr2DSum(ary));
    //------
    System.out.println("\nreplaceNegative");

    ary = new int[][]{{1, -2, 3}, {-4, -5, -6}, {7, -8, -9}};
    System.out.print("Original: " + arrToString(ary) +"; Result: ");
    replaceNegative(ary);
    System.out.print(arrToString(ary));

    ary = new int[][]{{}, {-4, 5}, {7, -8, -9}};
    System.out.print("\nOriginal: " + arrToString(ary) +"; Result: ");
    replaceNegative(ary);
    System.out.println(arrToString(ary));
    //------
      System.out.println("\ncopy");

    ary = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    boolean matchAry = (arrToString(ary).equals(arrToString(copy(ary))));
    boolean Address = (ary != copy(ary));
    System.out.println("Matching Arrays: " + matchAry + " / Different Addresses: " + Address + " / " + arrToString(ary));
    
    ary = new int[][]{{1}, {-2, 3}, {4, 0, 6}};
    matchAry = (arrToString(ary).equals(arrToString(copy(ary))));
    Address = (ary != copy(ary));
    System.out.println("Matching Arrays: " + matchAry + " / Different Addresses: " + Address + " / " + arrToString(ary));

    ary = new int[][]{{}, {}, {}};
    matchAry = (arrToString(ary).equals(arrToString(copy(ary))));
    Address = (ary != copy(ary));
    System.out.println("Matching Arrays: " + matchAry + " / Different Addresses: " + Address + " / " + arrToString(ary));

    ary = new int[][]{{1, 2, 3}};
    matchAry = (arrToString(ary).equals(arrToString(copy(ary))));
    Address = (ary != copy(ary));
    System.out.println("Matching Arrays: " + matchAry + " / Different Addresses: " + Address + " / " + arrToString(ary));

    ary = new int[][]{{}};
    matchAry = (arrToString(ary).equals(arrToString(copy(ary))));
    Address = (ary != copy(ary));
    System.out.println("Matching Arrays: " + matchAry + " / Different Addresses: " + Address + " / " + arrToString(ary));
    //------
    System.out.println("\nswapRC");

    ary = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    System.out.println("Expected: [[1, 4, 7], [2, 5, 8], [3, 6, 9]]; Result: "  + arrToString(swapRC(ary)));

    ary = new int[][]{{-2, 3}, {1, 5}, {-2, 3}};
    System.out.println("Expected: [[-2, 1, -2], [3, 5, 3]]; Result: "  + arrToString(swapRC(ary)));

    ary = new int[][]{{0, 2, 3, 4}, {5, 6, 7, 8}};
    System.out.println("Expected: [[0, 5], [2, 6], [3, 7], [4, 8]]; Result: "  + arrToString(swapRC(ary)));

    ary = new int[][]{{1, 3}};
    System.out.println("Expected: [[1], [3]]; Result: "  + arrToString(swapRC(ary)));
    //------
    System.out.println("\nhtmlTable");

    ary = new int[][]{{1, 2, 3}, {4, 5}};
    System.out.println("Original: " + arrToString(ary) + "; Result: " + htmlTable(ary));

    ary = new int[][]{{1, -2, 0}};
    System.out.println("Original: " + arrToString(ary) + "; Result: " + htmlTable(ary));

    ary = new int[][]{{}, {1, 2, 3}};
    System.out.println("Original: " + arrToString(ary) + "; Result: " + htmlTable(ary));

    ary = new int[][]{{}};
    System.out.println("Original: " + arrToString(ary) + "; Result: " + htmlTable(ary));
}

  //0. Include your prior methods to help you print a 1D/2D array of ints.
  public static String arrToString(int[]ary){
    String str = "[";
    for (int i = 0; i < ary.length; i++){
      str += ary[i] + ", ";
      if (i == ary.length - 1){
        str = str.substring(0, str.length() - 2);
      }
    }
    return str + "]";
  }

  //The name of different methods can be the same,
  //as long as the parameters are different! (type and/or quantity must be different)
  //Pro tip: you should be using your 1D arrToString in this method!
  public static String arrToString(int[][]ary){
    String s = "[";
    for (int i = 0; i < ary.length; i++) {
      if (i == ary.length - 1) {
        s += arrToString(ary[i]);
      } else {
        s += arrToString(ary[i]) + ", ";
      }
    }
    return s + "]";
  }

  //1. Calculate and return how many elements equal zero in the 2D array.
  public static int countZeros2D(int[][] nums){
    int count = 0;
    for (int i = 0; i < nums.length; i++){
      for (int x = 0; x < nums[i].length; x++){
        if (nums[i][x] == 0){
          count ++;
        }
      }
    }
    return count;
  }

  //2. Calculate the sum of a 2d array
  /*Return the sum of all of the values in the 2D array
   *Use a nested loop instead of a helper method*/
  public static int arr2DSum(int[][]nums){
  int sum = 0;
  for (int i = 0; i < nums.length; i++){
    for (int x = 0; x < nums[i].length; x++){
        sum += nums[i][x];
    }
  }
  return sum;
  }

  //3. Modify a given 2D array of integer as follows:
  //Replace all the negative values:
  //-When the row number is the same as the column number replace
  //that negative with the value 1
  //-All other negatives replace with 0
  public static void replaceNegative(int[][] vals){
    for (int i = 0; i < vals.length; i++){
      for (int x = 0; x < vals[i].length; x++){
        if (i == x && vals[i][x] < 0){
          vals[i][x] = 1;
        }
        else if (vals[i][x] < 0){
          vals[i][x] = 0;
        }
    }
  }
  }

  //4. Make a copy of the given 2d array.
  //When testing : make sure that changing the original does NOT change the copy.
  //DO NOT use any built in methods that "copy" an array.
  //You SHOULD write a helper method for this.
  //If you don't see a good way to do that, you should stop and look at prior methods.
  public static int[] returnCopy(int[] ary){
    int[] newAry = new int[ary.length];
    for (int i = 0; i < ary.length; i++){
      newAry[i] = ary[i];
    }
    return newAry;
  }

  public static int[][] copy(int[][] nums){
    int [][] newAry = new int[nums.length][];
    for (int i = 0; i < nums.length; i++){
      newAry[i] = new int[nums[i].length];
      for (int x = 0; x < nums[i].length; x++){
        newAry[i][x] = nums[i][x];
      }
    }
  return newAry;
}

  //5. Rotate an array by returning a new array with the rows and columns swapped.
  //   You may assume the array is rectangular and neither rows nor cols is 0.
  //   e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  public static int[][] swapRC(int[][]nums){
    int[][] newNums = new int[nums[0].length][nums.length];
    for (int i = 0; i < nums.length; i++){
      for (int x = 0; x < nums[i].length; x++){
        newNums[x][i] = nums[i][x];
    }
  }
  return newNums;
  }

  //6. Make an HTML table by putting a table tag around the entire 2d array,
  //   tr tags around each row, and td tags around each value.
  //   You may use a helper method
  //   Note there is no whitespace in the string, it all one line with no spaces/tabs.
  //   e.g. htmlTable(new int[][]{{1,2},{3}})  returns:
  // "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>"
  public static String htmlTable(int[][]nums){
    String str = "<table>";
    for (int i = 0; i < nums.length; i++){
      str += "<tr>";
      for (int x = 0; x < nums[i].length; x++){
        str += "<td>" + nums[i][x] + "</td>";
      }
      str += "</tr>";
    }
    return str + "</table>";
  }
}
