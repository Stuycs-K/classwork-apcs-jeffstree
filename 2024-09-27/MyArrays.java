public class MyArrays{
  public static void main(String[] args){
    System.out.println("Test Cases for arytoString():");
    System.out.println("[1, 2, 3, 4, 5]" + " vs my " + aryToString(new int[]{1, 2, 3, 4, 5}));

    System.out.println("\nTest Cases for returnCopy():"); //do test cases for this first!!!

    int[] ary = [0];
    System.out.println("Same content? " + CHECK IF SAME THINGS IN BOTH + " Different addresses? " + ary == returnCopy(ary));
  }

  public static String aryToString(int[] nums){
    String str = "[";
    for (int i = 0; i < nums.length; i++){
      str += nums[i] + ", ";
      if (i == nums.length - 1){
        str = str.substring(0, str.length() - 2);
      }
    }
    return str + "]";
  }

  public static int[] returnCopy(int[] ary){
    return new int[1]; //insert cool code here
  }
}
