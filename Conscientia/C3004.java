import java.io.*;
import java.util.*;

public class C3004
{
  public static void main(String [] args) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line = br.readLine();
    StringTokenizer strtok = new StringTokenizer(line,"!*/^",true);
    int input1,input2;
    String operator;
    input1 = Integer.parseInt(strtok.nextToken());
    operator = strtok.nextToken();
    input2 = Integer.parseInt(strtok.nextToken());
    if(operator.equals("!"))
    {
      System.out.println(FactorialDigits(input1));
    }else if(operator.equals("*"))
    {
    }else if(operator.equals("/"))
    {
    }else if(operator.equals("^"))
    {
    }

  }

  private static int FactorialDigits(int number)
  {
    int num_digits = 0;
    for(int i=1;i<=number;++i)
    {
      num_digits += (int)Math.log10(i);
    }
    return num_digits;
  }
}
