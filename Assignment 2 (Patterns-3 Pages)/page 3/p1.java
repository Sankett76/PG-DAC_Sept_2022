
class p1{

	public static void main (String args []){
	
	int i,j,k;
	
		for(i=1 ; i<=9 ; i++){
			
			for(j=9-i ; j>=1 ; j--){			
			System.out.print(" ");		
			}
			
			for(k=1 ; k<=i ; k++){
			System.out.print(i+" ");
			}
			
			System.out.println();
		
		}
	}
}

/*
op - 
        1
       2 2
      3 3 3
     4 4 4 4
    5 5 5 5 5
   6 6 6 6 6 6
  7 7 7 7 7 7 7
 8 8 8 8 8 8 8 8
9 9 9 9 9 9 9 9 9

*/
