import java.util.*;
public class MagicalSticks{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0)
        {
            int n=sc.nextInt();
            System.out.println((int)Math.ceil(n/2.0));
        }
        sc.close();
    }
}