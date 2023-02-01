import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a=1; // local variables
       int b=a;
       Main obj =new Main();
       Math obj1 = new Math ();
        Employee iv1= new Employee();
        Empid id = new Empid();
        prime num = new prime();
        Cons cd= new Cons();
        System.out.println(b);
        System.out.println("Name :" +obj.emp());
        System.out.println("EmpID :" +obj.empId());
        System.out.println("EmpID :" +obj1.getMax());
        System.out.println("EmpID :"+ iv1.getEmployeeAddress());
        System.out.println("EmpID :"+ iv1.employeenumber);
        System.out.println("EmpID :"+ id.employeeID);
        System.out.println(" Prime number :"+num.getPrime());
        System.out.println(" constructor no :"+cd.getEmpCons());
    }


    public static String emp()// static vairble
    {
        String name= "keih";
        return name;
    }

    public int empId() // instant variable
    {
       int[] c = {1,2,3,4};
       return c[3];

    }

    }

    class Math    // outside main class
    {
        public static String getMax()// need to mention return type on static variable
        {

            Scanner sc =new Scanner(System.in);
            System.out.println("Enter the employee1 value");
            int emp1 = sc.nextInt();
            System.out.println("Enter the employee2 value");
            int emp2 = sc.nextInt();
            if (emp1 >= emp2){
                return "Employee 1 has the highest value";
            } else{
                return "Employee 2 has the highest value";
            }


        }
    }

class Employee
{
    int employeenumber = 1000;
    public String getEmployeeAddress()
    {
        String Empaddress = " 24/c, Adirel Apartments,Chennai";
        return Empaddress;

    }
}

class Empid
{
    int employeeID =1979;
}

class prime
{
    public static String getPrime()

    {
      Empid emp = new Empid();
//        Scanner  prime = new Scanner(System.in);
//        System.out.println("Enter the value");
//        int a  = prime.nextInt();
         for(int i=2;i<emp.employeeID;i++) {
             if (emp.employeeID % i == 0)
        return "Number is prime";
    }
        return "number is not prime";
    }}


class Cons
{
    int a=10;
    int b=6;
    public int getEmpCons()
    {

     return a+b;

    }
}
