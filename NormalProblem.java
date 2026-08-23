import java.util.Scanner;

public class NormalProblem{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t--!=0)
        {
            String str=sc.next();
            StringBuilder ans=new StringBuilder();
            for(int i=str.length()-1;i>=0;i--)
                {
                    if(str.charAt(i)=='q')
                    {
                        ans.append('p');
                    }
                    else if(str.charAt(i)=='p')
                    {
                        ans.append('q');
                    }
                    else
                    {
                        ans.append('w');
                    }
                }   
                System.out.println(ans.toString()); 
        }
    }
}