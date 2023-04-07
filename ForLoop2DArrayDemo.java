import java.util.Scanner;

//wajp to scan and print 2darray
import java.util.Scanner;
class ForLoop2DArrayDemo {
    public static void main(String[] args) {
        int a[][]=new int[3][4];
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Array element 3 x 4 :");
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                a[i][j]=sc.nextInt();
            }
        }

        System.out.println("Array Element:");
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
