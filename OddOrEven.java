import java.util.*;
class OddOrEven 
{
    public static void main(String args[])
    {

    
    try (Scanner sr = new Scanner(System.in)) {
        System.out.println("Enter a Number:");
        int a=sr.nextInt();
        if(a%2==0)
        {
            System.out.println("Even Number="+a);

        }   
        else
        System.out.println("Odd Number:"+a);
    } 
}
}
