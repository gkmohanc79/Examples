import java.util.Scanner;
import java.math.BigInteger;
import java.util.*;

public class Example {

    public static void main(String[] args) {


        //Print reverse string in java Program
//
//        String original, reverse = "";
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter a string to reverse");
//        original = in.nextLine();
//        int length = original.length();
//        for ( int i = length - 1 ; i >= 0 ; i-- )
//            reverse = reverse + original.charAt(i);
//        System.out.println("Reverse of entered string is: "+reverse);
//    }
//}
////Using Internal java Methog
//class InvertString
//{
//    public static void main(String args[])
//    {
//        StringBuffer a = new StringBuffer("Java programming is fun");
//        System.out.println(a.reverse());
        // Print Floyd’s Triangle

//        int n, num=1, i, j;
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the number of rows of floyd's triangle you want");
//                n = in.nextInt();
//        System.out.println("Floyd's triangle :-");
//        for ( i = 1 ; i <= n ; i++ ) {
//            for (j = 1; j <= i; j++) {
//                System.out.print(num + " ");
//                num++;
//            }
//            System.out.println();





        // Print prime no Program

//            int n, status=1, num=3;
//            Scanner sc = new Scanner(System.in);
//             System.out.println("Enter the number of prime numbers you want");
//            n= sc.nextInt();
//
//            if (n>=1)
//            {
//                System.out.println("First "+n+ " prime numbers are: ");
//
//            }
//            for (int count =2; count <=n;)
//            {
//                for (int j = 2; j<= java.lang.Math.sqrt( num ); j++)
//                {
//                    if (num%j == 0)
//                    {
//                      status=0;
//                      break;
//                    }
//                }
//                if (status!=0)
//                {
//                    System.out.println(num);
//                    count++;
//                }
//                status =1;
//                num++;
//            }
// range of  multiplication table
//            int a, b, c,d;
//            System.out.println("Enter range of numbers to print their multiplication table");
//                    Scanner in = new Scanner(System.in);
//            a = in.nextInt();
//            b = in.nextInt();
//            for (c = a; c <= b; c++) {
//                System.out.println("Multiplication table of "+c);
//                for (d = 1; d <= 10; d++) {
//                    System.out.println(c+"*"+d+" = "+(c*d));
//                }
//            }

            // Print Multiplication table

//            int n,c;
//            System.out.println("Enter an integer to print it's multiplication table");
//                    Scanner in = new Scanner(System.in);
//                      n=in.nextInt();
//                  // System.out.println("Multiplication Table of "+n+" is :-" );
//            for (c=1;c<=10;c++)
//            System.out.println(n+ "*" + c+ "=" +(n*c));

            //Print Multiplication table Program
            // Enhance loop in java Program for int and string with array OR FOR LOOP

//            int primes[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
//            for (int t: primes) {
//                System.out.println("\n" t);
//            }
//            String languages[] = { "C", "C++", "Java", "Python", "Ruby"};
//            for (String sample: languages) {
//                System.out.println(sample);
//            }
          //  Print all alphabet and number using for loop Program
//            int a;
//            char ch;
//            for( ch = 'a' ; ch <= 'z' ; ch++ )
//            {
//                System.out.println(ch); }
//            for ( a= 1; a<=6; a++)
//            {
//                System.out.println((a));
//            }


// While loop using break and continue

//            int n;
//            Scanner input = new Scanner(System.in);
//            while (true) {
//                System.out.println("Input an integer");
//                n = input.nextInt();
//                if (n != 0) {
//                    System.out.println("You entered " + n);
//                    continue;
//                }
//                else {
//                    break;
//                }
//            }


//While loop using break program in java

//            Scanner input = new Scanner(System.in);
//            while (true) {
//                System.out.println("Input an integer");
//                int n = input.nextInt();
//                if (n == 0) {
//                    break;
//                }
//                System.out.println("You entered " + n);
//            }
//Print Reverse number in java program
//            int n, reverse = 0;
//            System.out.println("Enter the number to reverse");
//            Scanner in = new Scanner(System.in);
//            n = in.nextInt();
//            while( n != 0 )
//            {
//                reverse = reverse * 10;
//                reverse = reverse + n%10;
//                n = n/10;
//            }
//            System.out.println("Reverse of entered number is "+reverse);


            // Print Star console using Loop
            int row;
            for (row = 1; row <= 10; row++) {
//                 for (int star=10; star>= row; --star)
              //  for (int stars = 1; stars <= row; stars++)
                     {

                    for (int stars = 1; stars <= row ; stars++) {
                        System.out.print("*");
                    }
                    System.out.println(); // Go to next line
              }

            }
        for (row = 10; row >= 1; row--) {
//                 for (int star=10; star>= row; --star)
            //  for (int stars = 1; stars <= row; stars++)
            {

                for (int stars = 1; stars <= row ; stars++) {
                    System.out.print("*");
                }
                System.out.println(); // Go to next line
            }

        }

  // How to complete 2 string in program
//            String s1, s2;
//            Scanner in = new Scanner(System.in);
//            System.out.println("Enter the first string");
//            s1 = in.nextLine();
//            System.out.println("Enter the second string");
//            s2 = in.nextLine();
//            if ( s1.compareTo(s2) < 0  )
//                System.out.println("First string is greater than second.");
//            else if (s1.compareTo(s2) > 0  )
//                System.out.println("First string is smaller than second.");
//            else
//                System.out.println("Both strings are equal.");



//Calculate factorial for large No


//            int n, c;
//            BigInteger inc = new BigInteger("1");
//            BigInteger fact = new BigInteger("1");
//            Scanner input = new Scanner(System.in);
//            System.out.println("Input an integer");
//            n = input.nextInt();
//            for (c = 1; c <= n; c++) {
//                fact = fact.multiply(inc);
//                inc = inc.add(BigInteger.ONE);
//            }
//            System.out.println(n + "! = " + fact);


            //  Find factorial for given no Program

//            int n,  fact = 1;
//            System.out.println("Enter an integer to calculate it's factorial");
//            Scanner in = new Scanner(System.in);
//            n = in.nextInt();
//            if ( n < 0 )
//                System.out.println("Number should be non-negative.");
//            else {
//                for (int c = 1; c <= n; c++)
//                    fact = fact * c;
//                System.out.println("Factorial of " + n + " is = " + fact);
//            }

//How to check Odd and Even Number
//            int x;
//            System.out.println("Enter an integer to check if it is odd or even ");
//            Scanner in = new Scanner(System.in);
//            x = in.nextInt();
//            if ( x % 2 == 0 )
//                System.out.println("You entered an even number.");
//            else
//                System.out.println("You entered an odd number.");

//    Nested If Else clause in java marks with grade

//            int marksObtained, passingMarks;
//            char grade;
//            passingMarks = 40;
//            Scanner input = new Scanner(System.in);
//            System.out.println("Input marks scored by you");
//            marksObtained = input.nextInt();
//            if (marksObtained >= passingMarks) {
//                if (marksObtained > 90)
//                    grade = 'A';
//                else if (marksObtained > 75)
//                    grade = 'B';
//                else if (marksObtained > 60)
//                    grade = 'C';
//                else
//                    grade = 'D';
//                System.out.println("You passed the exam and your grade is " + grade);
//            }
//            else {
//                grade = 'F';
//                System.out.println("You failed and your grade is " + grade);
//            }

// If else clause for student marks
//            int marksObtained, passingMarks;
//            passingMarks = 40;
//            Scanner input = new Scanner(System.in);
//            System.out.println("Input marks scored by you");
//            marksObtained = input.nextInt();
//            if (marksObtained >= passingMarks) {
//                System.out.println("You passed the exam.");
//            }
//            else
//                System.out.println("Unfortunately you failed to pass the exam.");

            //If Else clause in java

//                    boolean learning = true;
//                    if (learning) {
//                        System.out.println("Java programmer");
//                    }
//                    else
//                        System.out.println("What are you doing here?");

           // Find Largest no in java Program

//            int x, y, z;
//            System.out.println("Enter three integers ");
//            Scanner in = new Scanner(System.in);
//            x = in.nextInt();
//            y = in.nextInt();
//            z = in.nextInt();
//            if ( x > y && x > z )
//                System.out.println("First number is largest.");
//            else if ( y > x && y > z )
//                System.out.println("Second number is largest.");
//            else if ( z > x && z > y )
//                System.out.println("Third number is largest.");
//            else
//                System.out.println("Entered numbers are not distinct.");


//For Large Number

//            String number1, number2;
//            Scanner in = new Scanner(System.in);
//            System.out.println("Enter first large number");
//            number1 = in.nextLine();
//            System.out.println("Enter second large number");
//            number2 = in.nextLine();
//            BigInteger first = new BigInteger(number1);
//            BigInteger second = new BigInteger(number2);
//            BigInteger sum;
//            sum = first.add(second);
//            System.out.println("Result of addition = " + sum);

//How to add two number Program
//            int x, y, z;
//            System.out.println("Enter two integers to calculate their sum ");
//            Scanner in = new Scanner(System.in);
//            x = in.nextInt();
//            y = in.nextInt();
//            z = x + y;
//            System.out.println("Sum of entered integers = "+z);

//How to swap 2 no without using 3rd variable

//            int x, y;
//            System.out.println("Enter x and y");
//            Scanner in = new Scanner(System.in);
//            x = in.nextInt();
//            y = in.nextInt();
//            System.out.println("Before Swapping\nx = "+x+"\ny = "+y);
//            x = x + y;
//            y = x - y;
//            x = x - y;
//            System.out.println("After Swapping\nx = "+x+"\ny = "+y);





            //How to swap 2 no using 3rd variable string or int
//            String xi, yi, temp;
//            System.out.println("Enter x and y");
//            Scanner in = new Scanner(System.in);
//            xi = in.nextLine();
//            yi = in.nextLine();
//            System.out.println("Before Swapping\nx = "+xi+"\ny = "+yi);
//            temp = xi;
//            xi = yi;
//            yi = temp;
//            System.out.println("After Swapping\nx = "+xi+"\ny = "+yi);

            // How to convert Fahrenheit to Celsius Program

//            float temperatue;
//            Scanner in = new Scanner(System.in);
//            System.out.println("Enter temperatue in Fahrenheit");
//            temperatue = in.nextInt();
//            temperatue = ((temperatue - 32)*5)/9;
//            System.out.println("Temperatue in Celsius = " + temperatue);


            //  int c; // declaring variable

//            for (c=1; c<=10; c++) /* Using for loop to repeat instruction execution */
//            System.out.println(" welcome to new world "+ c);

//            for (String t: args){
//                System.out.println(t);

            //How to get Using input using Scanner Program
//            int a;
//            float b;
//            String s;
//            Scanner in = new Scanner(System.in);
//            System.out.println("Enter a string");
//            s = in.nextLine();
//            System.out.println("You entered string "+s);
//            System.out.println("Enter an integer");
//            a = in.nextInt();
//            System.out.println("You entered integer "+a);
//            System.out.println("Enter a float");
//            b = in.nextFloat();
//            System.out.println("You entered float "+b);



    }
}

