import java.util.*;
public class NightattheMuseum
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int ans=0;
        char prev='a';
        for(char ch:s.toCharArray())
        {
           ans+=Math.min(Math.abs(prev-ch),Math.abs(ch-prev));
        }
        System.out.println(ans);
    }
}