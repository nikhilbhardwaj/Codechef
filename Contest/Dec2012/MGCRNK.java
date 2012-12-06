// http://www.codechef.com/DEC12/problems/MGCRNK
import java.io.*;
import java.util.*;

class Main
{
  public static double round(double value, int places) {
    if (places < 0) throw new IllegalArgumentException();

    long factor = (long) Math.pow(10, places);
    value = value * factor;
    long tmp = (long) value;
    return (double) tmp / factor;
  }

  public static void main(String [] args) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int numTests = Integer.parseInt( br.readLine() );
    while(numTests-- > 0)
    {
      int N = Integer.parseInt( br.readLine() );
      int [][] judgeScores = new int [N][N];

      // Read the judge scores from stdin
      long [][] optimalTable = new long [N][N];
      for(int i=0; i<N; ++i)
      {
        String [] input = br.readLine().split(" ");
        for(int j=0; j<N; ++j)
        {
          judgeScores[i][j] = Integer.parseInt( input[j] );
        }
      }
      // Build up the optimal moves table
      // The 1'st row and column are created first
      for(int i=1; i<N; ++i)
      {
        optimalTable[0][i] = optimalTable[0][i-1] + judgeScores[0][i];
        optimalTable[i][0] = optimalTable[i-1][0] + judgeScores[i][0];
      }
      // Traverse the matrix once to determine the maximum score
      for(int i=1; i<N; ++i)
      {
        for(int j=1; j<N; ++j)
        {
          optimalTable[i][j] = judgeScores[i][j] + 
            Math.max( optimalTable[i-1][j], optimalTable[i][j-1] );
        }
      }

      double result = optimalTable[N-1][N-1] / ( 2.0 * N - 3);
      if( result >= 0 )
      {
        System.out.println(String.format("%.6f",round(result,6)));
      }
      else
      {
        System.out.println("Bad Judges");
      }
    }
  }
}
