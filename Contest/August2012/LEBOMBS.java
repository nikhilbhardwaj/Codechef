import java.io.*;
import java.util.*;

class Main
{
  public static void main(String [] args) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int numTests = Integer.parseInt( br.readLine() );
    while(numTests-- > 0)
    {
      int numChars = Integer.parseInt(br.readLine());
      String inputString = br.readLine();
      int ans = process(inputString.toCharArray());
      System.out.println(ans);
    }
  }
  
  // Find out how many buildings are standing
  static int process(char [] array)
  {
    char [] copy = new char[array.length];
    System.arraycopy(array, 0, copy, 0, array.length);
    for(int i=1; i<array.length - 1; ++i)
    {
      if(array[i] == '1')
      {
        copy[i+1] = copy[i-1] = '1';
      }
    }
    if(array[0] == '1' && array.length > 1) copy[1] = '1';
    if(array[array.length - 1] == '1' && array.length >= 2) copy[array.length - 2] = '1';

    int zeros = 0;
    for(char c : copy)
    {
      if(c == '0') ++zeros;
    }
//System.out.println(new String(copy));
    return zeros;
  }
}
