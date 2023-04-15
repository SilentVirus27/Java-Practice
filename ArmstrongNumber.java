//wajp to check armstrong number
import java.util.Scanner;
class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        int power=String.valueOf(num).length();
        int sum=0,temp=num;
        
        for(int i=1;i<=power;i++){
            int digit=temp%10;
            sum+=Math.pow(digit,power);
            temp/=10;
            }

        // while (temp!=0) {
        //     int digit=temp%10;
        //     System.out.println(Math.pow(digit, power));
        //     sum+=Math.pow(digit, power);
        //     temp/=10;
        // }
        System.out.println(sum);
        System.out.println(num);
        System.out.println(sum==num);
        if(sum==num){
                System.out.println("Armstrong number");
        }
        else{
                System.out.println("Not Armstrong number");
        }
                
    }
}
