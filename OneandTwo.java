import java.util.Scanner;

public class OneandTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        while(tc--!=0)
        {
            int n=sc.nextInt();
            int t=0,a[];
            a=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                if(a[i]==2)
                {
                    t++;
                }
            }
            if(t%2==0)
            {
                int sum=0;
                for(int i=0;i<n;i++)
                {
                    if(a[i]==2)
                    {
                        sum++;
                    }
                    if(sum==t/2)
                    {
                        System.out.println(i+1);
                        break;
                    }
                }
            }
            else
            {
                System.out.println("-1");
            }
        }
    }
}
