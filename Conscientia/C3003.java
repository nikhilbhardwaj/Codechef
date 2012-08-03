import java.io.*;
import java.util.*;

public class C3003
{
  public static void main(String [] args)
    throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line = br.readLine();
    String input_string, waste_chars;
    StringTokenizer strtok = new StringTokenizer(line);
    input_string = strtok.nextToken();
    waste_chars = strtok.nextToken();

    TreeMap<Character,Integer> charCountMap = new TreeMap<Character,Integer>();
    for(int i = 0; i < input_string.length(); ++i)
    {
      char current_char = input_string.charAt(i);
      if(charCountMap.containsKey(current_char))
      {
        int newVal = (int)(charCountMap.get(current_char)) + 1;
        charCountMap.put(current_char,newVal);
      }
      else
      {
        charCountMap.put(current_char,1);
      }
    }

    for(int i = 0; i < waste_chars.length(); ++i)
    {
      char current_char = waste_chars.charAt(i);
      if(charCountMap.containsKey(current_char))
      {
        charCountMap.remove(current_char);
      }
    }

    Iterator entries = charCountMap.entrySet().iterator();
    while(entries.hasNext())
    {
      Map.Entry t = (Map.Entry)entries.next();
      System.out.print(t.getKey()+""+t.getValue());
    }
    System.out.println("");
  }
}
