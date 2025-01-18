package My_Learnings;
import java.nio.file.attribute.PosixFileAttributes;

//*Create a class "Employee" with methods to calculate and display the employee's salary
public class Learning003 {
String Employee_name;
int Employee_id;
int Employee_age;
int basicPay;
int BOA;
int PF;
int allowance;
Learning003(String Employee_name,int Employee_age,int Employee_id, int basicPay, int BOA, int PF, int allowance ){
    this.Employee_name = Employee_name;
    this.Employee_age = Employee_age;
    this.Employee_id = Employee_id;
    this. basicPay = basicPay;
    this.BOA = BOA;
    this.PF = PF;
    this.allowance = allowance;
}
double calculateSalary(){
    return basicPay+BOA+PF+allowance;
}
void output(){
    System.out.println("Employees details with salary");
    System.out.println("Employee name:"+Employee_name);
    System.out.println("Employee age"+Employee_age);
    System.out.println("Employee id"+Employee_id);
    System.out.println("Employee Salary"+calculateSalary());
}

    public static void main(String[] args) {
        Learning003 Emp1 = new Learning003("Rajesh",27,1,15000,3000,2000,1500);
        Learning003 Emp2 = new Learning003("Makesh",28,2,16000,4000,3000,1500);
        Learning003 Emp3 = new Learning003("Suresh",29,3,17000,5000,4000,1500);
        Learning003 Emp4 = new Learning003("Harish",30,4,18000,6000,4200,1500);

        Emp1.output();
        Emp2.output();
        Emp3.output();
        Emp4.output();

    }
}
