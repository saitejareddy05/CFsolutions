import java.util.Scanner;

public class PrefixMax{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0)
        {
            int n=sc.nextInt();
            int sum=0;
            for(int i=0;i<n;i++)
            {
                sum=Math.max(sum,sc.nextInt());
            }
            System.out.println(sum*n);
        }
    }
}