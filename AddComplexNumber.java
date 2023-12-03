import java.util.*;
class ComplexNumber
{ 
    int real;
    int image;
    ComplexNumber ( int real,int image)
    {
        this.real=real;
        this.image=image;
    }
    void showc()
    {
        System.out.print("(" + real + " + " + image + "i" + ")");
    }
    ComplexNumber add(ComplexNumber n2)
    {
        ComplexNumber res=new ComplexNumber(0,0);
        res.image=image+n2.image;
        res.real=real+n2.real;
        return res;
    }
}

public class AddComplexNumber
{
    public static void main(String args[])
    {
        try (Scanner sr = new Scanner(System.in)) {
            System.out.println("Enter the real and imaginary part of First Complex Number:");
            int real1=sr.nextInt();
            int imag1=sr.nextInt();
            ComplexNumber c1=new ComplexNumber(real1, imag1);
            System.out.println("Enter the real and imaginary part of Second Complex Number:");
            int real2=sr.nextInt();
            int imag2=sr.nextInt();
            ComplexNumber c2=new ComplexNumber(real2, imag2);
            System.out.println("First  Complex Number:");
            c1.showc();
            System.out.println("Second Complex Number:");
            c2.showc();
            ComplexNumber res=c1.add(c2);
            System.out.println("Resultant:");
            res.showc();
        }
    }
}