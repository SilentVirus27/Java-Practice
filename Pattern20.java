/* wajp to display pattern : 
"-" is Space
-----*-----
----* *----
---*   *---
--*     *--
-*       *-
*         *
-*       *-
--*     *--
---*   *---
----* *----
-----*-----
*/
class Pattern20 {
    public static void main(String[] args) {
        for (int i=1; i<=5; i++){
            for(int k=5;k>=i;k--){
                System.out.print("  ");
              }
            for(int j=1;j<=i*2-1;j++){
                if(i==1 || j==1  || j==(i*2)-1){
                    System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
            }
            System.out.println();
        }
        for (int i=1; i<=5; i++){  
            for(int k=1;k<=i;k++){
                System.out.print("  ");
            }
            for(int j=9;j>=i*2-1;j--){
                if( j==9 || i==5 || j==(i*2)-1){
                    System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
            }
            System.out.println();
        }

        
    }
} 
