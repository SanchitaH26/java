import java.util.Scanner;
public class simint{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter principal amount");
        int p=sc.nextInt();
        System.out.println("Enter rate of interest");
        int r=sc.nextInt();
        System.out.println("Enter time in years:");
        int y=sc.nextInt();
        int si=(p*r*y)/100;
        System.out.println("Simple interest="+si);
    }
}