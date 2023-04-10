//wajp to display following pattern:
/*
*                  * 
 *                *  
  *              *   
   *            *    
    *          *     
     *        *      
      *      *       
       *    *        
        *  *
         *
        *  *
       *    *        
      *      *       
     *        *      
    *          *     
   *            *
  *              *
 *                *
*                  *
 */
class Pattern23 {
public static void main(String[] args) {
    int n=10;
    int k=n*2-1;
	for(int i=1;i<=k;i++){
	    for(int j=1;j<=k;j++){
                  if(j==i || j==k-i+1)
                   System.out.print("*");
                   System.out.print(" ");
            }
	    System.out.println();
    }    
}    
}
