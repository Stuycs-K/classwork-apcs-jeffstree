public class MyArrays{
  public static void main(String[] args){
    System.out.println("Test Cases for arytoString():");

    System.out.println("[1, 2, 3, 4, 5] vs my " + aryToString(new int[]{1, 2, 3, 4, 5}));
    System.out.println("[0] vs my " + aryToString(new int[]{0}));
// ----------------------------------------------------------------------------------------------
    System.out.println("\nTest Cases for returnCopy():"); 

    int[] ary = new int[]{1};
    boolean matchAry = (aryToString(ary).equals(aryToString(returnCopy(ary))));
    boolean Address = (ary != returnCopy(ary));
    System.out.println(aryToString(ary) + " Matching Arrays: " + matchAry + " / Different Addresses: " + Address);
//-----------------------------------------------------------------------------------------------
    System.out.println("\nTest Cases for concatArray():");

    int[] ary1 = new int[]{1};
    int[] ary2 = new int[]{2};
    System.out.println("[1, 2] vs my " + aryToString(concatArray(ary1, ary2)));
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

  public static int[] concatArray(int[]ary1, int[]ary2){
    return new int[1];
  }
}
