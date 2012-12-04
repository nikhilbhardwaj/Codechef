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
      String [] lines = br.readLine().split(" ");
      int N = Integer.parseInt(lines[0]), M = Integer.parseInt(lines[1]);
      Map<Integer, Long> ints, floats;
      ints = new TreeMap<Integer,Long>(); floats = new TreeMap<Integer, Long>();
      // Read in the ints and floats
      for(int i=0; i<N; ++i)
      {
        lines = br.readLine().split(" ");
        long chakra = Integer.parseInt(lines[0]); int level = Integer.parseInt(lines[1]);
        if(ints.containsKey(level))
        {
          long newChakra = ints.get(level) + chakra;
          ints.put(level, newChakra);
        }
        else
        {
          ints.put(level, chakra);
        }
      }

      for(int i=0; i<M; ++i)
      {
        lines = br.readLine().split(" ");
        long chakra = Integer.parseInt(lines[0]); int level = Integer.parseInt(lines[1]);
        if(floats.containsKey(level))
        {
          long newChakra = floats.get(level) + chakra;
          floats.put(level, chakra + newChakra);
        }
        else
        {
          floats.put(level, chakra);
        }
      }
      // Read through the maps and determine the additional chakra
      long additionalChakra = 0;
      for(int level : ints.keySet())
      {
        long soint = ints.get(level), sofloat = floats.get(level);
        if(sofloat > soint) { additionalChakra += sofloat - soint; }
      }

      System.out.println(additionalChakra);
    }
  }
}
