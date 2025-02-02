package ex_11_WhileLoop;

public class Lab108_WhileLoop {
    public static void main(String[] args) {
      //*## **While Loop**
        //- When you are using for statement or while statement then** it verifies the condition
        //before executing the block.**
        //- So in the case of for statement and while statement, when first time condition is false
        //then the block will not be executed.
        //- for and while statement are also called as **Entry Controlled Loop.**
        //while - I, C, U
        //I - Init
        //C - Condition
        //U - Updation Increment / Decrement

        //*I
        //
        //while( C) {
        //
        //. Block of Code we want to execute
        //
        //U
        //
        //}
int i = 0;
while (i <10){ //
    System.out.println("print"+i);
    i++;
    //IQ: if we have't give increment it will execute infinity times
}
    }
}
