/*
wajp to allow student for exam if their attendance is greater than 75%.
input: num of classes and number of attended classes.
print: attendance percentage ,Student allow or not.

Modify above and check if student have medical cause for absent if Y allow to exam
 */
import java.util.Scanner;
class AllowStudBasedOnAttendancePercentage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Total no of Classes:");
        float totClass=sc.nextInt();
        System.out.println("Enter no of attended Classes Less than total class:");
        float totAttend=sc.nextInt();
        float per=(totAttend/totClass)*100;
        System.out.println("Attendance Percentage:"+per);

        if (per<75){
            System.out.println("Did you Absent Due to Meadical cause ?('Y','N')");
            String ans=sc.next();
            String answer=ans.trim().strip();
            if(answer.equals("Y")){
                System.out.println("Allow to exam");
            }
            else {
                System.out.println("Not Allow to Exam");
            }
        }
        else System.out.println("Allow to exam");
    }
}
