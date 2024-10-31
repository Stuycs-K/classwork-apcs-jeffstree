public class TriangleTester{
  public static int countTrianglesA(String filename){
    int[] currentLine = new int[3];
    int count = 0;
    while (filename.hasNextLine()){
      for (int i = 0; i < 3; i++){
        currentLine[i] = filename.nextInt();
      }

      a = currentLine[0];
      b = currentLine[1];
      c = currentLine[2];

      if (a + b > c || a + c > b)
      {
        continue;
      }
      else{
        count += 1;
      }

    }
    return count;
  }
}
