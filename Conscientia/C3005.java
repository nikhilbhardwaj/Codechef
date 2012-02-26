import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class C3005
{
  static BigInteger binomial(final int N, final int K) {
    BigInteger ret = BigInteger.ONE;
    for (int k = 0; k < K; k++) {
      ret = ret.multiply(BigInteger.valueOf(N-k))
        .divide(BigInteger.valueOf(k+1));
    }
    return ret;
  }

  public static void main(String [] args)
  throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line = br.readLine();
    int xCo,yCo;
    StringTokenizer strtok = new StringTokenizer(line);
    xCo = Integer.parseInt(strtok.nextToken());
    yCo = Integer.parseInt(strtok.nextToken());
    if(xCo < 0) xCo *= -1;
    if(yCo < 0) yCo *= -1;
    System.out.println(binomial(xCo+yCo,yCo));
  }
}
