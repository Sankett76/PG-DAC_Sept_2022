
//import java.util.scanner;

class p9{
	
	public static void main(String args []){
		
//-------------------------------------------------------
		System.out.println("\n Method 1 \n");
//-------------------------------------------------------
		/*
		for (int i=65 ; i<=69 ; i++){
			
			for (int j=65 ; j<=i ; j++){				
				System.out.print((char)j+" ");					
			}
			
			System.out.println();
						
		}
		*/
		for (int i=1 ; i<=5 ; i++){
			
			for (int j=5-i ; j>=1 ; j--){				
				System.out.print(" ");					
			}
			for (int k=65 ; k<=64+i ; k++){				
				System.out.print((char)k+" ");					
			}
			
			System.out.println();
						
		}

//-------------------------------------------------------
		System.out.println("\n Method 2 \n");
//-------------------------------------------------------
		/*
		for (char i='A' ; i<='E' ; i++){
			
			for (char j='A' ; j<=i ; j++){					// j<=i 			
				System.out.print(j+" ");					
			}
			
			System.out.println();
						
		}			
		*/
		for (char i='A' ; i<='E' ; i++){
			
			for (char j='E' ; j>i ; j--){				//for (char j='E'-i ; j>=1 ; j--){		
				System.out.print(" ");					
			}
			for (char k='A' ; k<=i ; k++){				
				System.out.print(k+" ");					
			}
			
			System.out.println();
						
		}
//-------------------------------------------------------
		
	}

}

/*
//op - 

 Method 1

    A
   A B
  A B C
 A B C D
A B C D E

 Method 2

    A
   A B
  A B C
 A B C D
A B C D E

*/