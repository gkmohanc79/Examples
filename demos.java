import javax.swing.*;
import java.util.Scanner;

public class demos



{
    public static void main(String[] args) {

        Scanner val1 = new Scanner(System.in);
        System.out.println(" Enter the first value: ");
        int a= val1.nextInt();
        Scanner val2 = new Scanner(System.in);
        System.out.println(" Enter the first value: ");
        int b = val2.nextInt();
        Scanner val3 = new Scanner(System.in);
        System.out.println(" Enter the first value: ");
        int c = val2.nextInt();


        Final val = new Final();

            val.add(a,b);
            val.div(a,b);
            val.mul(a,b);
            val.sub(a,b);
         //   val.table(b);



    }
}

abstract class Calc

{
    abstract void add(int a, int b );
    abstract void sub(int a, int b);
    abstract void mul(int a , int b);
    abstract void div(int a , int b);

//    abstract void table(int a,int b);

}
class Final extends Calc
{

    @Override
    void add(int a, int b) {
    int c = a + b;
    System.out.println("Addition of given numbers is :" + c);
    }

    @Override
    void sub(int a, int b) {
       // int c = a - b;
        System.out.println("Addition of given numbers is :" + (a-b));
    }

    @Override
    void mul(int a, int b) {
        int c = a * b;
        System.out.println("Addition of given numbers is :" + c);
    }

    @Override
    void div(int a, int b) {
        int c = a / b;
        System.out.println("Addition of given numbers is :" + c);
    }

//    @Override
//    void table (int a, int b) {
//         for (int i=0;i<=10;i++)
//
//        System.out.printf(" %d * %d =%d " +a,i,(b=a*i)).println();
//    }

}