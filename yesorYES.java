import java.util.*;
public class yesorYES {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n--!=0)
        {
            String s=sc.next().toLowerCase();
            if(s.charAt(0)=='y'&&s.charAt(1)=='e'&&s.charAt(2)=='s')
            System.out.println("YES");
            else
            System.out.println("NO");
        }
        sc.close();
    }
}
