/* wajp to display pattern : 
"-" is Space
-----*-----
----* *----
---*   *---
--*     *--
-*       *-
***********

*/
class Pattern18 {
    public static void main(String[] args) {
        for (int i=1; i<=5; i++){
            for(int k=5;k>=i;k--){
                System.out.print("  ");
              }
            for(int j=1;j<=i*2-1;j++){
                if(i==1 || i==5 || j==2*(5-1)+1){
                    System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
            }
            System.out.println();
        }  

        
    }
} 
