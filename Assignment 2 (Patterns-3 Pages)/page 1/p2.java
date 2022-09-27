
//import java.util.scanner;
/*
class p1{
	
	public static void main(String args []){
		
		for (char i=A ; i<=E ; i++){
			
			for (char j=A ; j<=i ; j++){				
				System.out.print('j'+" ");					
			}
			
			System.out.println();
						
		}			
		
	}

}

op- errors

p2.java:8: error: cannot find symbol
                for (char i=A ; i<=E ; i++){
                            ^
  symbol:   variable A
  location: class p1
p2.java:8: error: cannot find symbol
                for (char i=A ; i<=E ; i++){
                                   ^
  symbol:   variable E
  location: class p1
p2.java:10: error: cannot find symbol
                        for (char j=A ; j<=i ; j++){
                                    ^
  symbol:   variable A
  location: class p1
3 errors

*/



class p2{
	
	public static void main(String args []){
		
//-------------------------------------------------------
		System.out.println("\n Method 1 \n");
//-------------------------------------------------------
		
		for (int i=65 ; i<=69 ; i++){
			
			for (int j=65 ; j<=i ; j++){				
				System.out.print((char)j+" ");					
			}
			
			System.out.println();
						
		}

//-------------------------------------------------------
		System.out.println("\n Method 2 \n");
//-------------------------------------------------------

		for (char i='A' ; i<='E' ; i++){
			
			for (char j='A' ; j<=i ; j++){					// j<=i 			
				System.out.print(j+" ");					
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
