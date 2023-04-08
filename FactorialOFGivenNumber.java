//wajp to find factorial of given number (1*2*3*4*5.....)
import java.util.Scanner;
class FactorialOFGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num=sc.nextInt();
        
        int fact=1;
        for(int i=1;i<=num;i++){
            fact*=i;
        }

        System.out.println("Factorial:" +fact);
    }
}
