import java.io.*;
import java.util.*;

class SQREASY
{
  public int eatChocolate(int height, int width)
  {
    if(width > height)
    {
      return eatChocolate(width,height);
    }
    else if(width == 1)
    {
      return height;
    }
    else
    {
      return 1 + eatChocolate(height - width, width);
    }
  }
}

class Main
{
  public static void main(String [] args) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int numTests = Integer.parseInt(br.readLine());
    SQREASY johnny = new SQREASY();
    //iterate test cases times
    for(int i=0; i<numTests; ++i)
    {
      StringTokenizer strtok = new StringTokenizer(br.readLine());
      int h = Integer.parseInt(strtok.nextToken());
      int w = Integer.parseInt(strtok.nextToken());
      System.out.println(johnny.eatChocolate(h,w));
    }
  }
}
