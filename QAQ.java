import java.util.*;
public class QAQ{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans=0;
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == 'Q')
            {
                for(int j = i + 1; j < s.length(); j++)
                {
                    if(s.charAt(j) == 'A')
                    {
                        for(int k = j + 1; k < s.length(); k++)
                        {
                            if(s.charAt(k) == 'Q')
                            {
                                ans++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(ans);
        sc.close();
    }
}