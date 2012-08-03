import java.io.*;
import java.util.*;

class DUMBPROB
{
  private int xOffset, yOffset, breadth, height;
  public DUMBPROB(int x, int y, int b, int h)
  {
    xOffset = x;
    yOffset = y;
    breadth = b;
    height = h;
  }
  public boolean isInsideRectangle(int x, int y)
  {
    //We'll consider the rectangle translated to the orign
    //We translate the given point into this frame of reference
    //After that we need one comparison with the length and the breadth
    int xCo = x - xOffset;
    int yCo = y - yOffset;

    if(xCo > 0 && xCo < breadth && yCo > 0 && yCo < height)
    {
      return true;
    }
    return false;
  }
}

class Main
{
  public static void main(String [] args) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer strtok = new StringTokenizer(br.readLine());
    //Construct the object of DUMBPROB with the 4 integers
    DUMBPROB rect = new DUMBPROB(Integer.parseInt(strtok.nextToken()),Integer.parseInt(strtok.nextToken()),
        Integer.parseInt(strtok.nextToken()),Integer.parseInt(strtok.nextToken()));
    boolean flag = true;
    do
    {
      strtok = new StringTokenizer(br.readLine());
      int x = Integer.parseInt(strtok.nextToken());
      int y = Integer.parseInt(strtok.nextToken());
      if(x == 0 && y == 0){ flag = false; }

      if(flag && rect.isInsideRectangle(x,y))
      {
        System.out.println("INSIDE");
      }
      else if(flag)
      {
        System.out.println("OUTSIDE");
      }
    }while(flag);
  }
}
