
class p3{

	public static void main (String args []){
	
	int i,j,k;
	
		for(i=1 ; i<=9 ; i++){
			
			for(j=9-i ; j>=1 ; j--){			
			System.out.print(" ");		
			}
			
			for(k=1 ; k<=i ; k++){
			System.out.print("* ");
			}
			
			System.out.println();
		
		}
	}
}

/*
op - 
        *
       * *
      * * *
     * * * *
    * * * * *
   * * * * * *
  * * * * * * *
 * * * * * * * *
* * * * * * * * *

*/
