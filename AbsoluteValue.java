//wajp to print absolute value of given number
import java.util.Scanner;
class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Number:");
        int num=sc.nextInt();
        if(num<0){
            int abs=num*(-1);
            System.out.println("Absolute Number:"+abs);
        }else{
            System.out.println("Absolute number:"+num);
        }

    }
}
