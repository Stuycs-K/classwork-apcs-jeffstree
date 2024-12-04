public class ColorDemo{

  public static final String CLEAR_SCREEN =  "\u001b[2J";
  public static final String WATER_COLOR = "\u001b[36;44m";
  public static final String CLEAR_COLOR = "\u001b[0m";
  public static final String GREEN_TEXT = "\u001b[32m";


  public static void main(String[] args){
    System.out.print(CLEAR_SCREEN);
    System.out.println(makeWater("-~-~-~-~-~-~-~-~-~-~-~-~-~-~"));
    System.out.println(makeWater("~-~-~-~-~ ") + makeGreen("_______") + makeWater(" ~-~-~-~-~-"));
    System.out.println(makeWater("-~-~-~-~ ") + makeGreen("/       \\") + makeWater(" ~-~ ")
                       + makeGreen("(|") + makeWater(" -~"));
    System.out.println(makeWater("~-~-~-~ ") + makeGreen("/         \\") + makeWater(" ~ ") 
                       + makeGreen("/ |") + makeWater(" ~-"));
    System.out.println(makeWater("-~- ") + makeGreen("----           \\_/  |") + makeWater(" -~"));
    System.out.println(makeWater("~- ") + makeGreen("(                    |") + makeWater(" ~-"));
    System.out.println(makeWater("- ") + makeGreen(">   O         <<<     |") + makeWater(" -~"));
    System.out.println(makeWater("~- ") + makeGreen("(                    |") + makeWater(" ~-"));
    System.out.println(makeWater("-~- ") + makeGreen("------          /-\\ |") + makeWater(" -~"));
    System.out.println(makeWater("~-~-~-~-~ ") + makeGreen("\\        /") + makeWater(" - ")
                       + makeGreen("(|") + makeWater(" ~-"));
    System.out.println(makeWater("-~-~-~-~-~ ") + makeGreen("--------") + makeWater(" -~-~-~-~"));
    System.out.println(makeWater("~-~-~-~-~-~-~-~-~-~-~-~-~-~-"));
  }

/* Drawing of a fish
-~-~-~-~-~-~-~-~-~-~-~-~-~-~
~-~-~-~-~ _______ ~-~-~-~-~-
-~-~-~-~ /       \ ~-~ (| -~
~-~-~-~ /         \ ~ / | ~-
-~- ----           \_/  | -~
~- (                    | ~-
- >   O         <<<     | -~
~- (                    | ~-
-~- ------          /-\ | -~
~-~-~-~-~ \        / - (| ~-
-~-~-~-~-~ -------- -~-~-~-~
~-~-~-~-~-~-~-~-~-~-~-~-~-~-
*/

  public static String makeWater(String text){
    return WATER_COLOR + text + CLEAR_COLOR;
  }

  public static String makeGreen(String text){
    return GREEN_TEXT + text + CLEAR_COLOR;
  }
  
  
}
