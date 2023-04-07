//scool has following rule for greading system
//below 25 -F
// 25-45 E
// 45-50 D
// 50-60 C
// 60-80 B
// Above 80 A
//Ask Marks And print Grade
import java.util.Scanner;
class GradeBasedOnMarks {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Marks:");
        float marks=sc.nextFloat();
        if(marks<25){System.out.println("Grade: F");}
        else if(25<=marks && marks<45){System.out.println("Grade: E");}
        else if(45<=marks && marks<50){System.out.println("Grade: D");}
        else if(50<=marks && marks<60){System.out.println("Grade: C");}
        else if(60<=marks && marks<80){System.out.println("Grade: B");}
        else {System.out.println("Grade: A");}
    }
}
