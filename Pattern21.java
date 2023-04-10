/*write a java program to display cross pattern?
s
ss
sss
ssss
sssss
ssssss
sssssss
ssssssss
sssssssss
ssssssssss
sssssssss
ssssssss
sssssss
ssssss
sssss
ssss
sss
ss
s
*/
import java.util.Scanner;
class Pattern21{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //int num=sc.nextInt();
        int num=10;
        int iteration=num+(num-1);
        for (int i=1; i<=iteration;i++){
            if (i<=num) {
                for(int k=1;k<=i;k++){
                    System.out.print("s");
                }
                System.out.println();
            }else {
                 for (int j = num-(i-num); j!=0; j--) {
                     System.out.print("s");
                 }
                System.out.println();
            }
        }
    }
}