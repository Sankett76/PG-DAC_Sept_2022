
class p7{

	public static void main (String args []){
	
	int i,j,k,l;
	
		for(i=9 ; i>=1 ; i--){
			
			for(j=10-i ; j>1 ; j--){					//logic - 1st iteration of nested for loop got skipped resulting in first space problem got solved
			System.out.print(" ");		
			}
			
			for(k=i ; k>=1 ; k--){
			System.out.print(i+" ");
			}
			
			System.out.println();		
		}
		
	}
}

/*
op -
9 9 9 9 9 9 9 9 9
 8 8 8 8 8 8 8 8
  7 7 7 7 7 7 7
   6 6 6 6 6 6
    5 5 5 5 5
     4 4 4 4
      3 3 3
       2 2
        1

*/
