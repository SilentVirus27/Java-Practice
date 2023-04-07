//wajp to scan and print one d array with for loop
import java.util.Scanner;
class OneDArrayDemo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        
        //Create the array
        for(int i=0;i<5;i++){
            System.out.println("Enter element");
            a[i]=sc.nextInt();
        }

        //Print the array
        System.out.println("Array Element:");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        
    }
}