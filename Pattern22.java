import java.util.Scanner;
class Pattern22{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //int num=sc.nextInt();
        int num=10;
        int iteration=num*2-1;
        for (int i=1; i<=iteration;i++){
            if (i<=num) {
                for(int k=1;k<=i;k++){
                    if(i==k){
                    System.out.print(k);
                    }
                    else System.out.print(" ");
                }

                System.out.println();
            }else {
                 for (int j = num-(i-num); j!=0; j--) {
                    if(j==1){
                     System.out.print(num-(i-num));
                    }else System.out.print(" ");
                 }
                System.out.println();
            }
        }
    }
}