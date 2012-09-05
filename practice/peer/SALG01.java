import java.io.*;
import java.util.StringTokenizer;

public class SALG01
{
  public static void main(String [] args)
    throws Exception
    {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int test_cases = Integer.parseInt( br.readLine() );
      for( int i = 0; i < test_cases; i++)
      {
        int num_elements = Integer.parseInt( br.readLine() );
        int [] elements = new int[num_elements];
        StringTokenizer strtok = new StringTokenizer(br.readLine());
        int j = 0;
        while( strtok.hasMoreTokens() )
        {
          elements[j] = Integer.parseInt( strtok.nextToken() );
          j++;
        }
        //now to locate the index of the largest element
        int maxIndex = 1;
        int maxVal = elements[0];
        for( j = 0; j<num_elements;j++)
        {
          if( elements[j] > maxVal )
          {
            maxVal = elements[j];
            maxIndex = j + 1;
          }
        }
        System.out.println(maxIndex);
      }
    }
}
