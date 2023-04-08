//find reverse of number
import java.util.Scanner;
class ReverseOfNumber {
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter Number");
    int num=sc.nextInt();
    int temp=num;
    int rev=0;
    
    for(;temp!=0;temp=temp/10){
        int digit=temp%10;
        rev=rev*10+digit;
    }
    System.out.println("Resverse of num:"+rev);
}    
}
