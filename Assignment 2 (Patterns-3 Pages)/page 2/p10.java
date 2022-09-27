
//import java.util.scanner;

class p10{
	
	public static void main(String args []){
		
		
	int i,j,k;
//-------------------------------------------------------
		System.out.println("\n Method 1 \n");
//-------------------------------------------------------		
		
		for (i=1 ; i<=5 ; i++){
			
			for (j=5-i ; j>=1 ; j--){				
				System.out.print(" ");					
			}
			for (k=1 ; k<=10 ; k++){
					if(k%2!=0){
					System.out.print("*");
					}
			}			
			System.out.println();						
		}
		
//-------------------------------------------------------
		System.out.println("\n Method 1 \n");
//-------------------------------------------------------		
		
		for (i=1 ; i<=5 ; i++){
			
			for (j=5-i ; j>=1 ; j--){				
				System.out.print(" ");					
			}
			
			for (k=1 ; k<=5 ; k++){
					System.out.print("*");
			}			
			System.out.println();						
		}
		
	}
}



/*
op - 

*/