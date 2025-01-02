//   1. Factorial
//   2. Sum of N natural numbers
//   3. Fibonacci Series
//   4. Tables
//   5. Sum of digits
//   6. Number of Digits in a Number (Count)
//   7. Palindrome
//   8. Reverse a Number
//   9. ArmStrong Number
//   10. Swapping Two Numbers
//   11. Even Number and Odd Number
//   12. Prime Number Or not
//   13. Highest Common Factor (HCF) ( Largest Common Factor Returns)
//   14. Leap Year Or Not
//   15. Least Common Multiple (LCM)
//   16. Number Rotation


//        Mathematical Algorithms :

//        Greatest Common Divisor (GCD)
//        Least Common Multiple (LCM)
//        Sieve of Eratosthenes (Prime Numbers)
//        Modular Exponentiation
//        Euclidean Algorithm
//        Floyd’s Cycle Detection Algorithm

//                                ****************************************

//                                                 Factorial

public class  Integer{
   public static void main(String[] args) {
       int num=5;
       int i=1;
       int factorial=1;
       while (i<=num){                     // 1<=5    2<=5     3<=5    4<=5      5<=5  6<=5(loop Terminates)
           factorial =factorial * i;       // 1=1*1 , 1=1*2 , 2=2*3  , 6=6*4  , 24=24*5  =120
           i++;                            //  i=1  ,  i=2 ,  i=3    ,  i=4    ,    i=5
       }
       System.out.println("Factorial of number "+num+ " is : "+factorial);    // factorial = 120
   }
}

// 1 X 1
// 1 X 2
// 1 X 2 X 3
// 1 X 2 X 3 X 4
// 1 X 2 X 3 X 4 X 5

//    Factorial of number 5 is : 120


//          *********************************************************************************************

//                                  Sum Of Natural Numbers
public class  Integer{
   public static void main(String[] args) {
       int num=10;
       int i=1;
       int sum=0;
       while (i<=num){     // 1<=10 2<=10 3<=10 4<=10 5<=10 6<=10 7<=10 8<=10 9<=10 10<=10 11<=10(loop-teminates)
           sum =sum + i;   // 0=0+1 1=1+2 3=3+3 6=6+4 10=10+5 15=15+6 21=21+7 28=28+8 36=36+9 45=45+10  =55
           i++;            // i=1    i=2   i=3   i=4    i=5    i=6      i=7     i=8    i=9      i=10
       }
       System.out.println("Sum of natural numbers "+num+ " is : "+sum);   // sum = 55
   }
}
// 0 + 1
// 0 + 1 + 2
// 0 + 1 + 2 + 3
// 0 + 1 + 2 + 3 + 4
// 0 + 1 + 2 + 3 + 4 + 5   === 15 (sum of 5 natural numbers)

//    Sum of natural numbers 10 is : 55

//      *******************************************************************************************************
//
//                                             Fibonacci Series
//
import java.util.Scanner;
public class Integer {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter a Number :");
       int num=sc.nextInt();
       System.out.print("Fibonacci Series of a number "+num+ " is : ");
       int first=0 ,second =1 , next; // 0 1 1 2 3 5 8 13 21 34     first=0   second = 1
       for (int i=1;i<=num;i++){  // i=1 1<=10 2<=10 3<=10 4<=10 5<=10 6<=10 7<=10 8<=10 9<=10 10<=10 11<=10(loop-teminates)
           if(i==1){              // if i==1  returns 0
               next=0;
           } else if (i==2) {    // if i==2  returns 1
               next=1;
           } else{
               next=first+second; // 0=0+1 1=1+1  2=1+2  3=2+3  5=3+5   8=5+8..........
               first=second;      // 0=1   1=1     1=2   2=3     3=5     5=8..............
               second=next;       // 1=1   1=2     2=3   3=5     5=8     8=13............
           }
           System.out.print(next+" ");  // return the Fibonacci  Series
       }
   }
}
//
//        Enter a Number :10
//        Fibonacci Series of a number 10 is : 0 1 1 2 3 5 8 13 21 34
//
//
//        **************************************************************************************************
//
//                                          Tables
//
public class Integer {
   public static void main(String[] args) {
       int num=5;
       int i=1;
       while(i<=10){      // i=1 1<=10 2<=10 3<=10 4<=10 5<=10 6<=10 7<=10 8<=10 9<=10 10<=10 11<=10(loop-teminates)
           System.out.println(num+" * "+i+ " = " + num*i);    // 5 * 1 = (5*1)=5.............
           i++;
       }
   }
}
//        5 * 1 = 5
//        5 * 2 = 10
//        5 * 3 = 15
//        5 * 4 = 20
//        5 * 5 = 25
//        5 * 6 = 30
//        5 * 7 = 35
//        5 * 8 = 40
//        5 * 9 = 45
//        5 * 10 = 50
//
//          **************************************************************************************************
//
//
//                                               Sum Of Digit
//
public class Integer {
   public static void main(String[] args) {
       int num=14355;
       int p=num;
       int sum=0;
       while(p != 0){        // 14355 != 0  1435 != 0   143 != 0  14 != 0 1 != 0 0 !=0(loop terminates)
           sum=sum + p % 10; // 0=0+(14355 % 10) 5 comes out sum=5  5=5+(1435 % 10) sum=10 10=10+(143%10) sum=13 sum=17 sum=18
           p= p/10;          // 14355/10  == 1435   1435/10  == 143  143/10  == 14  14/10 == 1 1/10 == 0
       }
       System.out.println(" Sum of the Digit "+num+" is : "+sum);
   }
}

//    Sum of the Digit 14355 is : 18

//     ******************************************************************************************************

//                                 Number of Digits in a Number (Count)
public class Integer {
   public static void main(String[] args) {
       int num=12345;
       int Count=0;
       int sum=0,p=num;

       while(num != 0){             // 12345 != 0  1234 !=0 123!=0 12!=0 1!=0 0!=0(loop terminates)
           sum=sum + num % 10;      // 0=0+(12345 % 10) sum=5 5=5+(1234%10) sum=9.........
           Count++;                 //ct=1 ct=2 ct=3 ct=4 ct=5...
           num= num/10;             // 12345/10 =1234 1234/10=123 123/10=12 12/10=1 1/10=0
       }
       System.out.println("Number Of Digits in "+p+" is : "+Count);  // return count=5
   }
}

//    Number Of Digits in 12345 is : 5

//       ********************************************************************************************************

//                                              Palindrome

public class Integer {
   public static void main(String[] args) {
       int num=12121;
       int reverse=0,p=num;
       while(num != 0){             // 12121 !=0  1212 !=0  121 !=0  12 !=0  1 !=0  0 !=0(loop terminates)
           int d =  num % 10;       // 12121 % 10=1  1212%10=2 121%10=1 12%10=2 1%10=1
           reverse =reverse *10+d;  // 0=0*10+1  1=1*10+2 12=12*10+1 121=121*10+2 1212=1212*10+1 ==12121
           num= num/10;             // 12121/10 =1212  1212/10=121 121/10=12 12/10=1 1/10=0
       }
       if(reverse==p){              // 12121==12121
           System.out.println("It is a Palindrome : "+p);
       }else{
           System.out.println("It is not a Palindrome : "+p);
       }
   }
}

//    It is a Palindrome : 12121

//         *****************************************************************************************************

//                                              Reverse a Number

public class Integer {
   public static void main(String[] args) {
       int num=123;
       int sum=0,p=num;

       while(num != 0){       // 123 !=0  12 !=0  1 !=0  0 !=0(loop terminates)
           int d =  num % 10; // 123 % 10 = 3  12 % 10 =2  1 % 10 =1
           sum =sum *10+d;    // 0=0*10+3 3=3*10+2 32=32*10+1 ==321
           num= num/10;       // 123/10 = 12  12/10 =1  1/10 =0
       }
           System.out.println("A Number Before Reversing : "+p);
           System.out.println("A Number After Reversing : "+sum);
   }
}

//        A Number Before Reversing : 123
//        A Number After Reversing : 321

//         *****************************************************************************************************

//                                                 ArmStrong Number

public class Integer {
   public static void main(String[] args) {
       int num=153;
       int sum=0,p=num;

       while(num != 0){         // 153 != 0    15 !=0 1   1!=0     0 !=0(loop terminates)
           int d =  num % 10;   //  153 %10=3 15 %10=5  1%10=1
           sum =sum +d*d*d;     // 0=0+3*3*3  27=27+5*5*5  152=152+1*1*1 ==153
           num= num/10;         // 153/10=15  15/10=1  1/10=0
       }
       if(sum==p){              // 153 == 153
           System.out.println("It is a ArmStrong Number : "+p);
       }else{
           System.out.println("It is not a ArmStrong Number : "+p);
       }
   }
}

//    It is a ArmStrong Number : 153

//           *******************************************************************************************

//                                      Swapping Two Numbers

public class Integer {
   public static void main(String[] args) {
       int a=5, b=10;
       System.out.println("Before Swapping a = "+a+" , b = "+b);
       int temp;  // temp=0  temporary memory
       temp=a;    // temp=5
       a=b;       // a=10
       b=temp;    // b=5
       System.out.println("After Swapping a = "+a+" , b = "+b);   // O(1) time complexity
   }
}

//        Before Swapping a = 5 , b = 10
//        After Swapping a = 10 , b = 5

//     **************************************************************************************************

//                                 Even Number and Odd Number

//import java.util.Scanner;
public class Integer {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter a Number : ");
       int num=sc.nextInt();     // num=2
       if(num % 2 ==0){          // 2 % 2 == 0 true
           System.out.println("It is a Even Number : "+num);
       } else if (num % 2 !=0) {  // 2 % 2 != 0  false
           System.out.println("It is an Odd Number : "+num);
       } else{
           System.out.println("Please Enter a Number.........");
       }
   }
}

//        Enter a Number : 1
//        It is an Odd Number : 1

//         ***********************************************************************************************

//                                     Prime Number Or not

//import java.util.Scanner;
public class Integer {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter a Number : ");
       int num=sc.nextInt();   // num = 7  , num = 2
       if(isPrime(num)){
           System.out.println(num+" is a Prime Number.");
       }else{
           System.out.println(num+" is not a Prime Number.");
       }
   }
   public static boolean isPrime(int n){  // n=7  , n=2
       if(n<=1){                          // 7<=1 ,  2<=1  false
           return false;
       }
       for (int i=2;i<Math.sqrt(n);i++){   // i=2 ,  2<2.64575   2<1.41416
           if(n%i==0){                     // 7 % 2 == 0  (It will come 1) so, it is false  , 2 % 2 ==0 true
               return false;
           }
       }
       return true;
   }
}

//        Enter a Number : 7
//        7 is a Prime Number.

//        **************************************************************************************************

//                         Highest Common Factor (HCF) ( Largest Common Factor Returns)

//import java.util.Scanner;
public class Integer {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter a Number A :");
       int num1=sc.nextInt();
       System.out.print("Enter a Number B :");
       int num2=sc.nextInt();

       int temp ,p1=num1,p2=num2;  // num1=36   num2=60
       while(num2>0){              // 60>0             6>0               6>0
           temp = num2;            // temp = 60        temp = 6          temp = 6
           num2 = num1 % num2;     // num2 = 36 % 60   num2 = 60 % 6     num2 = 6 % 6
           num1 = temp;            // num1 = 60        num1 = 6          num1 = 6
       }
       System.out.println("HCF of "+p1+ " and "+p2+" is : "+num1);
   }
}

//        Enter a Number A :36
//        Enter a Number B :60
//        HCF of 36 and 60 is : 12

//         ************************************************************************************************

//                                                 Leap Year Or Not

//import java.util.Scanner;
public class Integer {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter a Year : ");
       int year=sc.nextInt();
       if(year % 4 ==0 && year % 100 !=0){
           System.out.println(year+" it is a Leap Year");
       } else if (year % 100 ==0 && year % 400 ==0) {
           System.out.println(year+" it is a Leap Year");
       }else {
           System.out.println(year+" it is a not Leap Year");
       }
   }
}

//        Enter a Year : 2028
//        2028 it is a Leap Year

//       ***************************************************************************************************

//                                           Least Common Multiple (LCM)

//import java.util.Scanner;
public class Integer {
   public static int gcd(int a,int b){
       while(b > 0){
           int temp = b;
           b = a % b;
           a = temp;
       }
       return a;
   }
   public static int lcm(int a,int b){
       return (a*b)/gcd(a,b);
   }
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter a Number A :");
       int num1=sc.nextInt();
       System.out.print("Enter a Number B :");
       int num2=sc.nextInt();
       int lcm=lcm(num1,num2);

       System.out.println("LCM of "+num1+ " and "+num2+" is : "+lcm);
   }
}

//        Enter a Number A :12
//        Enter a Number B :18
//        LCM of 12 and 18 is : 36

//           *************************************************************************************************

//                                            Number Rotation

//import java.util.Scanner;
public class Integer {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter a Number :");
       int num1=sc.nextInt();
       System.out.print("Number of Rotations :");
       int num2=sc.nextInt();

       int p=num1, ct=0;
       while (num1> 0){
           int d=num1 %10;
           ct++;
           num1=num1/10;
       }
       num2=num2 % ct;
       num1=p;
       if(num2<0){
           num2 +=ct;
       }
       int f= num1 / (int)Math.pow(10,num2);
       int s=num1 % (int)Math.pow(10,num2);
       num1=s * (int)Math.pow(10,ct-num2)+f;
       System.out.println(num1);
   }
}

//        Enter a Number :2345
//        Number of Rotations :5
//        5234