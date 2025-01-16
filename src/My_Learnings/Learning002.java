package My_Learnings;
//* Create a class "Student" with attributes name, age, and roll number. Initialize these attributes
//using a parameterized constructor.
public class Learning002 {
    String name;
    int age;
    int roll_number;
    Learning002(String name, int age, int roll_number){
        this.name = name;
        this. age = age;
        this. roll_number = roll_number;
    }
    void display(){
        System.out.println("Student Details");
        System.out.println("Student name is:"+ name);
        System.out.println("Student age is:"+age);
        System.out.println("Studnet roll number is:"+ roll_number);
    }

    public static void main(String[] args) {
        Learning002 student1 =  new Learning002("Murali",24,6);
        Learning002 student2 = new Learning002("Rahul",24,7);
        Learning002 student3 = new Learning002("Gurkesh",24,8);
student1.display();
student2.display();
    }
}
