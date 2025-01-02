//46 is the last number before it overflows and before 10s

public class Driver{
  public static void main(String[] args){
    int n = Integer.parseInt(args[0]);
    System.out.println(Fib.fib(n));
  }
}
