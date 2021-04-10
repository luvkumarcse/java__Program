import java.util.Scanner;
class ArmstrongExample
{
    public static void main(String ar[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int c=0,a,temp;
        int n=s.nextInt();
        temp=n;
        while(n>0)
        {
            a=n%10;
            n=n/10;
            c=c+(a*a*a);
        }
        if(temp==c)
        System.out.println("Armstrong number");
        else
        {
            System.out.println("not Armstrong number");
        }
        }
    }
