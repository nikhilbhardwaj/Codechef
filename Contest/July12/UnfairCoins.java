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
      int N = Integer.parseInt(br.readLine());
      if(N == 1)
      {
        System.out.println("1");
      }
      else
      {
        Matrix mat = new Matrix(2,2,1,0).exponentiate(N - 1);
        System.out.println(mat.getAnswer());
      }
    }
//    System.out.println(new Matrix(2,2,1,0).exponentiate(2L));
  }
}

// This is an ugly implementation of a 2X2 matrix
// I wrote this so as to avoid doing actual matrix multiplication
// The time it takes is still awfully high but we can reduce that with memoization
class Matrix
{
  public long a, b, c, d;
  static long MOD = 1000000007;
  public Matrix(long a, long b, long c, long d)
  {
    this.a = a; this.b = b; this.c = c; this.d = d;
  }

  public Matrix exponentiate(long n)
  {
    if(n == 1 || n == 0) { return this; }
    else if(n == 2)
    {
      long new_a, new_b, new_c, new_d;
      new_a = ((((a % MOD) * (a % MOD)) % MOD) + ((b % MOD) * (c % MOD) % MOD));
      new_b = ((((a % MOD) * (b % MOD)) % MOD) + ((b % MOD) * (d % MOD) % MOD));
      new_c = ((((a % MOD) * (c % MOD)) % MOD) + ((c % MOD) * (d % MOD) % MOD));
      new_d = ((((b % MOD) * (c % MOD)) % MOD) + ((d % MOD) * (d % MOD) % MOD));
      return new Matrix(new_a,new_b,new_c,new_d);
    }
    else
    {
      if(n % 2 == 0)
      {
        Matrix tmp = this.exponentiate(n/2);
        return tmp.exponentiate(2);
      }
      else
      {
        Matrix tmp = this.exponentiate(n-1);
        long new_a, new_b, new_c, new_d;
        new_a = ((((a % MOD) * (tmp.a % MOD)) % MOD) + ((b % MOD) * (tmp.c % MOD) % MOD));
        new_b = ((((a % MOD) * (tmp.b % MOD)) % MOD) + ((b % MOD) * (tmp.d % MOD) % MOD));
        new_c = ((((tmp.a % MOD) * (c % MOD)) % MOD) + ((tmp.c % MOD) * (d % MOD) % MOD));
        new_d = ((((tmp.b % MOD) * (c % MOD)) % MOD) + ((tmp.d % MOD) * (d % MOD) % MOD));
        return new Matrix(new_a,new_b,new_c,new_d);
      }
    }
  }

  public long getAnswer()
  {
    return (((3 * c) % MOD) + (d % MOD)) % MOD;
  }

  public String toString()
  {
    return "[ " + a + ", " + b + " ]\n" + "[ " + c + ", " + d + " ]\n";
  }
}
