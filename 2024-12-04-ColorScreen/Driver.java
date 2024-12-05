public class Driver extends Text{
  public static void main(String[] args){
    System.out.print(CLEAR_SCREEN);
    System.out.print(HIDE_CURSOR);
    go(0,0);
    color(BLUE, CYAN, BRIGHT);
    border(80, 30, 'O');
    System.out.println("~");


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
}