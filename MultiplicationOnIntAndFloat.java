//wajp to perform multiplication on one integer and 2 float value from user
import java.util.Scanner;
class MultiplicationOnIntAndFloat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Integer Number:");
        int num1=sc.nextInt();
        System.out.println("Enter 2 float number:");
        Float num2=sc.nextFloat();
        Float num3=sc.nextFloat();
        double res=num1*num2*num3;
        System.out.println("Multiplication of given three number is: "+res);
    }
}
