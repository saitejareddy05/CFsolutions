import java.util.*;


public class ForbiddenInteger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int x=sc.nextInt();
            List<Integer>li=new ArrayList<>();
            for(int i=1;i<=k;i++)
            {
                if(i!=x)
                    li.add(i);
            }
            Map<Integer,Integer>mp=new HashMap<>();
            int idx=li.size()-1;
            int ans=0;
            while(n>0)
            {
                if(n/li.get(idx)>0)
                {
                    mp.put(li.get(idx),n/li.get(idx));
                    ans+=mp.get(li.get(idx));
                    n=n%li.get(idx);
                }
                
                idx--;
            }
            if(n==0)
            {
                System.out.println("YES");
                System.out.println(ans);
                for(int el:mp.keySet())
                {
                    for(int i=0;i<mp.get(el);i++)
                    {
                        System.out.print(el+" ");
                    }
                }
                System.out.println();
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}
