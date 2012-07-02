import java.io.*;
import java.util.*;

class Main
{
  public static void main(String [] args) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String [] input = br.readLine().split(" ");
    int rows = Integer.parseInt(input[0]);
    int cols = Integer.parseInt(input[1]);
    long [] col_max = new long [cols];
    long [] row_min = new long [rows];
    List<Integer> [] row_min_indices = (List<Integer>[]) new ArrayList[rows];

    //initialize the colm_max to 0
    for(int i=0; i< col_max.length; ++i) { col_max[i] = 0L; }

    while(rows-- > 0)
    {
      // System.out.println("Row #{ " + rows + "}");
      input = br.readLine().split(" ");
      row_min[rows] = Long.parseLong(input[0]);
      row_min_indices[rows] = new ArrayList<Integer>();
      row_min_indices[rows].add(new Integer(0));
      for(int i=0; i<cols; ++i)
      {
        long current_val = Long.parseLong(input[i]);
        if(row_min[rows] >= current_val)
        {
          if(current_val > row_min[rows])
          {
            row_min_indices[rows].clear();
          }
          row_min[rows] = current_val;
          row_min_indices[rows].add(new Integer(i));
        }
        if(col_max[i] < current_val)
        {
          col_max[i] = current_val;
        }
      }
    }
    // Now we are to find an element which is the row min and the colm max
    boolean found = false;
    for(int i=0; i<row_min.length; ++i)
    {
      for(int j=0; j<row_min_indices[i].size(); ++j)
      {
      if(row_min[i] == col_max[row_min_indices[i].get(j)])
      {
        found = true;
        System.out.println(row_min[i]);
        System.exit(0);
      }
      }
    }
    if(!found) { System.out.println("GUESS"); }
  }
}
