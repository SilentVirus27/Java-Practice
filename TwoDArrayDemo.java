//wajp to demonstrate 3d array
import java.util.Scanner;
class TwoDArrayDemo {
    public static void main(String[] args) {
        int a[][][]=new int[3][3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array element 3x3x3: ");
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length; k++) {
                    a[i][j][k]=sc.nextInt();
                }
            }
        }
        System.out.println("Array element 3x3x3: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length; k++) {
                    System.out.print(a[i][j][k] +" ");
                }
                System.out.println();
            }
            System.out.println("-----");
        }
    }
}
