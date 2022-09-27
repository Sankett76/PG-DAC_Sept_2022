
class p6{

	public static void main (String args []){
	
	int i,j,k;
	
		for(i=1 ; i<=9 ; i++){
			
			for(j=1 ; j<i ; j++){					//just by writing j<i, 1st iteration of nested for loop got skipped and the first space problem got solved
			System.out.print(" ");		
			}
			
			for(k=10-i ; k>=1 ; k--){
			System.out.print("* ");
			}
			
			System.out.println();		
		}
		
	}
}

/*
op -
* * * * * * * * *
 * * * * * * * *
  * * * * * * *
   * * * * * *
    * * * * *
     * * * *
      * * *
       * *
        *

*/
