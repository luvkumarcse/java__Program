import java.util.*;
class Number
{
    public static void main(String ar[])
    {
        int no;
        System.out.println("enter a number");
        Scanner in=new Scanner(System.in);
        no=in.nextInt();

        if(no %2 == 0)
        System.out.println("even number");
        else
            System.out.println("Odd number");
        }
    }
