public class Fib{
  public static int fib(int num){
    if(num < 2){
      return num;
    }
    else{
      return fib(num - 2) + fib(num - 1);
    }
  }
}
