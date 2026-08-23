import java.util.Scanner;

public class OddSet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0)
        {
            int n=sc.nextInt();
            int cnto=0,cnte=0,a=0;
            for(int i=0;i<2*n;i++)
            {
                a=sc.nextInt();
                if(a%2==0)
                {
                    cnte++;
                }
                else
                {
                    cnto++;
                }
            }
            if(cnto==cnte)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("No");
            }
        }
    }
}
