import java.util.ArrayList;

public class Driver {
  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      ArrayList<String> thing = ArrayListPractice.createRandomArray(10);
      System.out.println(thing.toString());
      ArrayListPractice.replaceEmpty(thing);
      ArrayList<String> newthing = ArrayListPractice.makeReversedList(thing);
      System.out.println(thing.toString());
      System.out.println((ArrayListPractice.makeReversedList(thing)).toString());
      System.out.println((ArrayListPractice.mixLists(thing, newthing)).toString() + "\n");

  }

  ArrayList<String> longThing = ArrayListPractice.createRandomArray(200000);
  System.out.println(longThing.size());

  longThing.add(0, "9");
  System.out.println(longThing.size());
  System.out.println(longThing.indexOf("9") == 0);

  ArrayListPractice.replaceEmpty(longThing);
  System.out.println(longThing.indexOf("") == -1);

  ArrayList<String> otherLong = ArrayListPractice.makeReversedList(longThing);
  System.out.println(otherLong.lastIndexOf("9") == 200000);

  ArrayList<String> reallyLong = ArrayListPractice.mixLists(longThing, otherLong);
  System.out.println(reallyLong.size());

}
}
