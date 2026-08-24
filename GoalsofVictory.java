import java.util.Scanner;

public class GoalsofVictory{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0)
        {
            int n=sc.nextInt();
            int sum=0;
            for(int i=0;i<n-1;i++)
            {
                sum+=sc.nextInt();
            }
            if(sum>0)
            {
                System.out.println("-"+sum);
            }
            else
            {
                System.out.println(Math.abs(sum));
            }
        }
    }
}