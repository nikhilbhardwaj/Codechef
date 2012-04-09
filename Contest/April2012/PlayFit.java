import java.io.*;
import java.util.StringTokenizer;

public class PlayFit
{
  public static void main(String [] args) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int totalTestCases, numGames;
    totalTestCases = Integer.parseInt(br.readLine());
    for(int i = 0; i < totalTestCases; ++i)
    {
      //Process each test case
      int goalDiff, minGoals, currentVal;
      goalDiff = 0;
      numGames = Integer.parseInt(br.readLine());
        String line = br.readLine();
        StringTokenizer strtok = new StringTokenizer(line);
        minGoals = Integer.parseInt(strtok.nextToken());
        for(int j=1; j<numGames; ++j)
        {
          currentVal = Integer.parseInt(strtok.nextToken());
          if(currentVal < minGoals)
          {
            minGoals = currentVal;
          }
          else
          {
            if(currentVal - minGoals > goalDiff)
            {
              goalDiff = currentVal - minGoals;
            }
          }
        }
        if(goalDiff > 0)
        {
          System.out.println(goalDiff);
        }
        else
        {
          System.out.println("UNFIT");
        }
    }
  }
}
