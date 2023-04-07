import java.util.Scanner;

//wajp to create simple calculator and take input from user (input>1)
class Calculator {
    public static void main(String[] args) {
        System.out.println("Enter value1:");
        try (Scanner sc = new Scanner(System.in)) {
            int a= sc.nextInt();
            System.out.println("Enter value2:");
            int b= sc.nextInt();
            int res1=a+b;
            int res2=a-b;
            int res3=a*b;
            int res4=a/b;
            System.out.println("Calculations:");
            System.out.println("Addition:"+res1+" Substraction:"+res2+ " Multiplication:"+res3+" Division:"+res4 );
        }
    }
}
