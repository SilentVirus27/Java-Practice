/*
 * Ask user for age,gen(M or F) marital status (T or N) then use following rule to print their place of service
 * if female,thenwork only in urban areas.
 * if male & age in between 20 - 40 then he may work in anyware
 * if male,age 40-60 work in urban areas only
 * other input age print error 
 */
import java.util.Scanner;
 class WorkBasedEmployeeAgeGen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age:");
        int age=sc.nextInt();
        System.out.println("Enter Gender(M or F):");
        String gen=sc.next().trim().strip().toUpperCase();
        System.out.println("Enter marital Status(Y or N):");
        String mStat=sc.next().trim().strip().toLowerCase();

        if(gen.equals("F")){
            System.out.println("employee can work only in urban areas.");
        }else if(gen.equals("M") && (age>=20 && age <40)){
            System.out.println("Employee can work from anyware.");
        }else if(gen.equals("M") && (age>=40 && age <60)){
            System.out.println("Employee can work in urban areas only.");
        }else {
            System.out.println("ERROR");
        }
    }
}
