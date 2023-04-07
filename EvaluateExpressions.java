/* input  x=7,y=11,z=0
 * solve following exp:
 * a.x==7
 * b.x!=11
 * c.x!=11 && y>=12
 * d.z!=0||x==2
 * e.!(y<13)
 */
import java.util.Scanner;
class EvaluateExpressions {
    public static void main(String[] args) {
        int x=7,y=11,z=0;
        System.out.println("x==7: " +(x==7));
        System.out.println("x!=11: "+(x!=11));
        System.out.println("x!=11 && y>=12 : "+ (x!=11 && y>=12));
        System.out.println("z!=0||x==2: "+ (z!=0||x==2));
        System.out.println("!(y<13) : " +(!(y<13)));
    }
}
