package Java_Task.Find_the_LargestofThreeNumbers;

import java.util.Scanner;

public class Calculate_Employee_Net_Salary_30thJan_20 {
    public static void main(String[] args) {
        //*1️⃣ Take input for:
        //
        //Basic Pay (fixed salary)
        //HRA (House Rent Allowance) (e.g., 20% of Basic Pay)
        //DA (Dearness Allowance) (e.g., 10% of Basic Pay)
        //Tax Deductions (e.g., 5% of Gross Salary)

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Employees fixed salary...");
        double BasicPay = sc.nextInt();

        double HRA = BasicPay *0.20;
        double DA = BasicPay * 0.10;
        double taxDeductions = BasicPay * 0.05;

        double Emp_net_Salary = BasicPay + HRA + DA;
        System.out.println("Emp_net_Salary"+Emp_net_Salary);
     //   double Taxdeduction = (taxDeductions/100.0)*Emp_net_Salary;
       // System.out.println("Tax"+Taxdeduction);
        double GrossSalary = Emp_net_Salary - taxDeductions ;
        System.out.println("Dude your monthly salary is:"+GrossSalary);
sc.close();
    }
}
