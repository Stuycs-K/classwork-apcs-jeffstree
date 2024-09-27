public class MyArrays{
  public static void main(String[] args){
    System.out.println("[1, 2, 3, 4, 5]" + " vs my " + aryToString(new int[]{1, 2, 3, 4, 5}));
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
}
