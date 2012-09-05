import java.io.*;
import java.util.StringTokenizer;

public class CMB01
{
  public static void main(String [] args)
    throws Exception
  {
    int test_cases;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    test_cases = Integer.parseInt( br.readLine() );
    for( int i = 0; i < test_cases;i++)
    {
      StringTokenizer strtok = new StringTokenizer(br.readLine());
      int num1 = Integer.parseInt( strtok.nextToken() );
      int num2 = Integer.parseInt( strtok.nextToken() );
      System.out.println(  reverse( reverse(num1) + reverse(num2) ) );
    }
  }

  static int reverse(int n)
  {
    int reversed = 0;
    while( n != 0 )
    {
      reversed *= 10;
      reversed += n%10;
      n = n/10;
    }
    return reversed;
  }
}
