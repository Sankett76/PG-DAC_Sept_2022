

class p13{
	
	public static void main (String args []){

//-------------------------------------------------------
		System.out.println("\n Method 1 \n");
//-------------------------------------------------------
	
		for (int i=65 ; i<=69 ; i++){
			
			for (int j=69+65-i ; j>=65 ; j--){
				
				System.out.print(" ");
				
			}
			
			for (int k=65 ; k<=i ; k++){
			
				System.out.print((char)i+" ");
			
			}
			
			System.out.println();
			
		}
		
//-------------------------------------------------------
		System.out.println("\n Method 2 \n");
//-------------------------------------------------------
		
		int l=65;
		
		for (int i=1 ; i<=5 ; i++){
			
			for (int j=5-i ; j>=1 ; j--){
				
				System.out.print(" ");
				
			}
			
			for (int k=1 ; k<=i ; k++){
			
				System.out.print((char)l+" ");
			
			}
			
			System.out.println();
			l++;
			
		}

	
	}

}

/*
op-

 Method 1

     A
    B B
   C C C
  D D D D
 E E E E E

 Method 2

    A
   B B
  C C C
 D D D D
E E E E E

*/