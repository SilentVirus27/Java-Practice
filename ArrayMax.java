// wajp to find max of user given integer array
import java.util.Scanner;
class ArrayMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many element:");
        int n = sc.nextInt();
        System.out.println("Enter Element:");
        int[] a = new int[n];
        int max;
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
            }
        max = a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }

        System.out.println("Max of Aarray:"+max);
    }
}
