
//import java.util.scanner;

class p5{
	
	public static void main(String args []){
		
//-------------------------------------------------------
		System.out.println("\n Method 1 \n");
//-------------------------------------------------------
		
		for (int i=65 ; i<=69 ; i++){
			
			for (int j=65 ; j<=i ; j++){				
				System.out.print((char)i+" ");					
			}
			
			System.out.println();
						
		}

//-------------------------------------------------------
		System.out.println("\n Method 2 \n");
//-------------------------------------------------------

		for (char i='A' ; i<='E' ; i++){
			
			for (char j='A' ; j<=i ; j++){					// j<=i 			
				System.out.print(i+" ");					
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