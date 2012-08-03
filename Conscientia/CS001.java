import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class CS001
{
  public static void main(String [] args)
    throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line = br.readLine();
    StringTokenizer strtok = new StringTokenizer(line);
    int input1,input2;
    input1 = Integer.parseInt(strtok.nextToken());
    input2 = Integer.parseInt(strtok.nextToken());
    final String exponentialNo = BigInteger.valueOf(input1).pow(input2).toString(10);
    System.out.println(exponentialNo);
    long result = 0;
    for (int i = 0; i < exponentialNo.length(); i++) {
      result += Integer.valueOf(String.valueOf(exponentialNo.charAt(i)));
    }
    System.out.println(result);

  }
}
