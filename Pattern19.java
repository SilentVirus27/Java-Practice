/* wajp to display pattern : 
"-" is Space

***********
-*       *-
--*     *--
---*   *---
----* *----
-----*-----
*/
class Pattern19 {
    public static void main(String[] args) {
        for (int i=1; i<=5; i++){
            for(int k=1;k<=i;k++){
                System.out.print("  ");
              }
            for(int j=9;j>=i*2-1;j--){
                if(i==1 || j==9 || i==5 || j==(i*2)-1){
                    System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
            }
            System.out.println();
        }  

        
    }
} 
