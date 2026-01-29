import java.util.Scanner;
public class altprime{
    static boolean isprime(int num)
    {
        if(num<=1)
            return false;
        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=50;
        System.out.println("Alternative prime numbers until 50");
        int count=0;
        for(int i=2;i<=n;i++)
        {
            if(isprime(i)){
                count++;
                if(count%2==1)
                {
                    System.out.print(i+" ");
                }
            }
        }
    }
}