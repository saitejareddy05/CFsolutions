import java.util.Scanner;

public class FollowingDirections {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0)
        {
            int n=sc.nextInt();
            String s=sc.next();
            int x=0,y=0;
            boolean found=false;
            for(char ch:s.toCharArray())
            {
                if(ch=='U')
                {
                    y++;
                }
                else if(ch=='R')
                {
                    x++;
                }
                else if(ch=='D')
                {
                    y--;
                }
                else
                {
                    x--;
                }
                if(x==1&&y==1)
                {
                    found=true;
                    break;
                }
            }
            if(found)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }

        }
        sc.close();
    }
}
