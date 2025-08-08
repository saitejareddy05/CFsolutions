import java.util.Scanner;

public class watermelon {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if((a+1)%2==0)
        {
            System.out.println("NO");
        }
        else 
        {
            System.out.println("YES");
        }
        sc.close();
    }
}
