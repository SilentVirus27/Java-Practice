//find Given power of given number
import java.util.Scanner;
class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number to find Power");
        int base = sc.nextInt();
        System.out.println("Enter Number to Which power you want ");
        int power= sc.nextInt();
        int res=1;
        for(int i=1;i<=power;i++)
        {
            res*=base;
        }
        System.out.println("Power of given Number:"+res);
    }
}
