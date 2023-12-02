import java.util.*;
public class Armstrong 
{
    public static void main(String args[])
    {
     try (Scanner sr = new Scanner(System.in)) {
        System.out.println("Enter a Number:");
        int n=sr.nextInt();
        int org=n;
        int rev=0;
        while(n>0)
        {
            int temp=n%10;
            rev=rev+(temp*temp*temp);
            n=n/10;
        }
        if(org==rev)
        System.out.println(+org+"is Armstrong.");
        else
        System.out.println(+org+"is not Armstrong");
    }
    }
}
