public class MyArrays{
  public static void main(String[] args){
    System.out.println("Test Cases for arytoString():");

    System.out.println("[1, 2, 3, 4, 5] vs my " + aryToString(new int[]{1, 2, 3, 4, 5}));
    System.out.println("[0] vs my " + aryToString(new int[]{0}));
    System.out.println("[] vs my " + aryToString(new int[]{}));
// ----------------------------------------------------------------------------------------------
    System.out.println("\nTest Cases for returnCopy():"); 

    int[] ary = new int[]{0};
    boolean matchAry = (aryToString(ary).equals(aryToString(returnCopy(ary))));
    boolean Address = (ary != returnCopy(ary));
    System.out.println("Matching Arrays: " + matchAry + " / Different Addresses: " + Address + " / " + aryToString(ary));

    ary = new int[]{1};
     matchAry = (aryToString(ary).equals(aryToString(returnCopy(ary))));
     Address = (ary != returnCopy(ary));
    System.out.println("Matching Arrays: " + matchAry + " / Different Addresses: " + Address + " / " + aryToString(ary));

    ary = new int[]{1, 2, 3, 4, 5};
     matchAry = (aryToString(ary).equals(aryToString(returnCopy(ary))));
     Address = (ary != returnCopy(ary));
    System.out.println("Matching Arrays: " + matchAry + " / Different Addresses: " + Address + " / " + aryToString(ary));

    ary = new int[]{23, 54, 0, 11, 2};
     matchAry = (aryToString(ary).equals(aryToString(returnCopy(ary))));
     Address = (ary != returnCopy(ary));
    System.out.println("Matching Arrays: " + matchAry + " / Different Addresses: " + Address + " / " + aryToString(ary));

    ary = new int[]{};
     matchAry = (aryToString(ary).equals(aryToString(returnCopy(ary))));
     Address = (ary != returnCopy(ary));
    System.out.println("Matching Arrays: " + matchAry + " / Different Addresses: " + Address + " / " + aryToString(ary));

//-----------------------------------------------------------------------------------------------
    System.out.println("\nTest Cases for concatArray():");

    int[] ary1 = new int[]{1};
    int[] ary2 = new int[]{2};
    System.out.println("[1, 2] vs my " + aryToString(concatArray(ary1, ary2)));

    ary1 = new int[]{1};
    ary2 = new int[]{1};
    System.out.println("[1, 1] vs my " + aryToString(concatArray(ary1, ary2)));

    ary1 = new int[]{1, 20, 3};
    ary2 = new int[]{4, 50, 6};
    System.out.println("[1, 20, 3, 4, 50, 6] vs my " + aryToString(concatArray(ary1, ary2)));

    ary1 = new int[]{10, 20, 30};
    ary2 = new int[]{40, 50};
    System.out.println("[10, 20, 30, 40, 50] vs my " + aryToString(concatArray(ary1, ary2)));

    ary1 = new int[]{60, 70};
    ary2 = new int[]{80, 90, 100};
    System.out.println("[60, 70, 80, 90, 100] vs my " + aryToString(concatArray(ary1, ary2)));

    ary1 = new int[]{};
    ary2 = new int[]{10, 20, 30};
    System.out.println("[10, 20, 30] vs my " + aryToString(concatArray(ary1, ary2)));

    ary1 = new int[]{40, 50, 60};
    ary2 = new int[]{};
    System.out.println("[40, 50, 60] vs my " + aryToString(concatArray(ary1, ary2)));

    ary1 = new int[]{};
    ary2 = new int[]{};
    System.out.println("[] vs my " + aryToString(concatArray(ary1, ary2)));


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
