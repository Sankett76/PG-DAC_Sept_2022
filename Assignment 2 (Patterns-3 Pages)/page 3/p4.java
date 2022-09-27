
class p4{

	public static void main (String args []){
	
	int i,j,k,l;
	
		for(i=1 ; i<=9 ; i++){
			
			for(j=9-i ; j>=1 ; j--){			
			System.out.print("  ");		
			}
			
			for(k=1 ; k<=i ; k++){
			System.out.print(k+" ");
			}
			
			for(l=i ; l>1 ; l--){
			System.out.print((l-1)+" ");
			}
			
			System.out.println();
		
		}
	}
}

/*
op - 
                1
              1 2 1
            1 2 3 2 1
          1 2 3 4 3 2 1
        1 2 3 4 5 4 3 2 1
      1 2 3 4 5 6 5 4 3 2 1
    1 2 3 4 5 6 7 6 5 4 3 2 1
  1 2 3 4 5 6 7 8 7 6 5 4 3 2 1
1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1

*/
