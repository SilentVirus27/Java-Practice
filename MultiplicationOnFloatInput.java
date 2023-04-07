//wajp to perform multiplication on float values taken from user
import java.util.Scanner;
class MultiplicationOnFloatInput {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Two value to perform Multiplication:");
        Float a=sc.nextFloat();
        Float b=sc.nextFloat();
        float res=a*b;
        System.out.println("Multiplication :"+res);
    }
}
