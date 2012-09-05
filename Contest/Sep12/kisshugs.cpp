#include<iostream>

using namespace std;

typedef unsigned long long ull;
const ull P = 1000000007;

ull modi(ull n)
{
  if(n == 0) return 1LL;
  else if(n == 1) return 2LL;
  else
  {
    if(n % 2 == 0)
    {
      ull tmp = modi(n/2);
      return (((tmp % P) * (tmp % P)) % P);
    }
    else
    {
      return (((2 % P) * (modi(n-1) % P)) % P);
    }
  }
}

int main()
{
    ull t,n;
    cin>>t;

    while(t--)
    {
             ull count=0,temp=0,btw=0;
             ull count2=0,count3=0;

             cin>>n;
             temp=n/2;

             if(n==1)
             {
                     cout<<2<<endl;
             }
             else
             {
                 btw=modi(temp-1);
          //       cout<<btw<<"@@"<<endl;
             if(n%2==0 )
             {

                       count2 = -1 * (2* (1-(btw*2)));
                       count3 = -1 * (2* (1-btw)  );


                       count = 2 + ((count2+count3)% P);

             }
             else if(n%2==1)
             {

                       count2 = -1 * (2* (1-(btw*2)));

                       count = 2 + ((count2+count2)% P);
             }
             cout<<count<<endl;
             }
    }


return 0;
}
