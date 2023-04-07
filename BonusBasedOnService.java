//a Company decides to give bonus of 5% for employee based on service greater than 5 year
//ask user for their salary and year of service 
//print net bonus amount.
//else not Applicable.
import java.util.Scanner;
class BonusBasedOnService {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Salary:");
        int sal=sc.nextInt();
        System.out.println("Enter Service Year:");
        int service=sc.nextInt();
        if (service>5){
            double netBonus=sal+((sal/100)*5);
            System.out.println("Employee's Bonus: "+ netBonus);
        }else System.out.println("Not Applicable");
    }
}
