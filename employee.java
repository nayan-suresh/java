import java.util.*;
class employeedetails
{
    String Employeename;
    int Employeenumber;
    float BasicPay,DA,HRA,GrossSalary;
 void details(String Employeename,int Employeenumber,float BasicPay)
    {
        this.Employeename=Employeename;
        this.Employeenumber=Employeenumber;
        this.BasicPay=BasicPay;
    }
    void calculate()
    {
        DA=0.2f*BasicPay;
        HRA=0.5f*BasicPay;
        GrossSalary=BasicPay+DA+HRA;
    }
    void print()
    {
        System.out.println("Employee name:"+Employeename);
        System.out.println("Employee Number:"+Employeenumber);
        System.out.println("BasicPay:"+BasicPay);
        System.out.println("DA="+DA);
        System.out.println("HRA="+HRA);
        System.out.println("Gross Salary:"+GrossSalary);
    }
}
public class employee
{
    public static void main(String args[])
    {
        try (Scanner sr = new Scanner(System.in)) {
            System.out.println("Enter Employee name:");
            String Employeename=sr.nextLine();
            System.out.println("Employee Number:");
            int Employeenumber=sr.nextInt();
            System.out.println("Basicpay=");
            float BasicPay=sr.nextFloat();
            employeedetails e1=new employeedetails();
            e1.details(Employeename,Employeenumber,BasicPay);
            e1.calculate();
            e1.print();
        }
    }
}
