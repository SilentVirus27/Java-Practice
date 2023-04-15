//wajp to check given number is a prime number or not.
import java.util.Scanner;
class PrimeNumber {public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number");
    int num=sc.nextInt();
    int count=0;
    for(int i=2;i<num;i++){
        if(num%i==0){
            count++;
            break;
        }
    } 
    if(count==0){
        System.out.println("the given number is prime number");
    }else {System.out.println("not a prime number");}
}   
}
