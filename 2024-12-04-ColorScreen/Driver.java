public class Driver extends Text{
  public static void main(String[] args){
    System.out.print(CLEAR_SCREEN);
    System.out.print(HIDE_CURSOR);

    go(0,0);
    color(BLUE, background(CYAN), BRIGHT);
    border(80, 30, 'O'); //Step 5

    int[] randInts = new int[3]; //Step 6
    for(int i = 0; i < 3; i++){
      randInts[i] = (int)(Math.random() * 100);
    }

    for(int i = 0; i < 3; i++){
      go(2, 20 * (i + 1));
      printIntColor(randInts[i]); //Step 8
      System.out.println(randInts[i]); //Step 7
    }

    color(YELLOW, ITALICS);
    seperator(80, 2, '-'); //Step 9

    go(31, 0);
    System.out.println(RESET);
  }

  public static void border(int row, int col, char character){
    for(int i = 0; i < row; i++){
      System.out.print(character);
    }
    for(int colIndex = 0; colIndex < col; colIndex++){
      System.out.print("\n" + character);
      go(colIndex, row);
      System.out.print(character);
    }
    System.out.println();
    for(int i = 0; i < row; i++){
      System.out.print(character);
    }
  }

  public static void seperator(int row, int col, char character){
    go(col + 1, 2);
    for(int i = 0; i < row - 2; i++){
      System.out.print(character);
    }
  }

  public static void printIntColor(int num){
    if (num < 25){
      color(RED, BRIGHT);
    }
    else if (num > 75){
      color(GREEN, BRIGHT);
    }
    else{
      color(WHITE);
    }
  }
}