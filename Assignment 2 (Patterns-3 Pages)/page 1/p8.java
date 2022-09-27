
//import java.util.scanner;

class p8{
	
	public static void main(String args []){
		
		for (int i=1 ; i<=5 ; i++){
			
			for (int j=5-i ; j>=1 ; j--){				
				System.out.print(" ");					
			}
			for (int k=6-i ; k<=5 ; k++){				
				System.out.print(k+" ");					
			}
			
			System.out.println();
						
		}			
		
	}

}

/*
op - 
    5
   4 5
  3 4 5
 2 3 4 5
1 2 3 4 5
*/