import java.io.*;
import java.util.*;

class Main
{
  static long calculateMinimumDifferenceBetweenFactors(long num)
  {
    long minDiff = num - 1;
    for(long i=2L; i<= Math.sqrt(num); ++i)
    {
      if(num % i == 0)
      {
        long tmpDiff = Math.abs(i - num/i);
        if(tmpDiff < minDiff)
        {
          minDiff = tmpDiff;
        }
      }
    }
    return minDiff;
  }
  public static void main(String [] args) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer strtok = null;
    int numTests = Integer.parseInt( br.readLine() );
    while(numTests-- > 0)
    {
      long input = Long.parseLong(br.readLine());
      System.out.println(calculateMinimumDifferenceBetweenFactors(input));
    }
  }
}

