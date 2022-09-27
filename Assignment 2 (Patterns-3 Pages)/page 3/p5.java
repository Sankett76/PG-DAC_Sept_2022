
class p5{

	public static void main (String args []){
	
	int i,j,k,l;
	
//-------------------------------------------------------
		System.out.println("\n Method 1 \n");
//-------------------------------------------------------
	
		for(i=1 ; i<=9 ; i++){
			
			for(j=9-i ; j>=1 ; j--){			
			System.out.print("  ");		
			}
			
			for(k=10-i ; k<=9 ; k++){
			System.out.print(k+" ");
			}
			
			for(l=8 ; l>=1 && l>=9-i ; l--){
				if(i!=1 && l!=9-i){
				System.out.print(l+" ");
				}
			}
			
			System.out.println();		
		}
		
//-----------------------------------------------------------------------
		System.out.println("\n Method 2 - By taking user input n=10 \n");
//-----------------------------------------------------------------------
		
		int n=10;
		
		for(i=1 ; i<=n ; i++){
			
			for(j=n-i ; j>=1 ; j--){			
			System.out.print("   ");		
			}
			
			for(k=(n+1)-i ; k<=n ; k++){
			System.out.print(k+"  ");
			}
			
			for(l=(n-1) ; l>=1 && l>=n-i ; l--){
				if(i!=1 && l!=n-i){
				System.out.print(l+"  ");
				}
			}
			
			System.out.println();		
		}
		
		
		
	}
}

/*
op - 

 Method 1

                9
              8 9 8
            7 8 9 8 7
          6 7 8 9 8 7 6
        5 6 7 8 9 8 7 6 5
      4 5 6 7 8 9 8 7 6 5 4
    3 4 5 6 7 8 9 8 7 6 5 4 3
  2 3 4 5 6 7 8 9 8 7 6 5 4 3 2
1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1

 Method 2 - By taking user input n=10

                           10
                        9  10  9
                     8  9  10  9  8
                  7  8  9  10  9  8  7
               6  7  8  9  10  9  8  7  6
            5  6  7  8  9  10  9  8  7  6  5
         4  5  6  7  8  9  10  9  8  7  6  5  4
      3  4  5  6  7  8  9  10  9  8  7  6  5  4  3
   2  3  4  5  6  7  8  9  10  9  8  7  6  5  4  3  2
1  2  3  4  5  6  7  8  9  10  9  8  7  6  5  4  3  2  1

*/
