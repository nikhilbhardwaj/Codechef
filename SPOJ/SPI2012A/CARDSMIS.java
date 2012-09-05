import java.io.*;
import java.util.*;

class CARDSMIS
{
  public static int expectedSum(int n)
  {
    return n * (n+1) / 2;
  }
}

class Main
{
  public static void main(String [] args) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int numTests = Integer.parseInt(br.readLine());
    StringTokenizer strtok;
    for(int i=0; i<numTests; ++i)
    {
      int N = Integer.parseInt(br.readLine());
      int sum = 0;
      strtok = new StringTokenizer(br.readLine());
      for(int j=0; j<N-1; j++)
      {
        sum += Integer.parseInt(strtok.nextToken());
      }
      System.out.println(CARDSMIS.expectedSum(N) - sum);
    }
  }
}
