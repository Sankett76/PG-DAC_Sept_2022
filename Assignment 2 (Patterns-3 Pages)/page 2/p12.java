
class p12{

	public static void main(String args[]){
	
	int i,j,k;
		
//----------------------------------------------------------------------------------------------------
		System.out.println("\n Method 1 - Jugaad to bring ans in only 1 nested, poor readibility\n");
//----------------------------------------------------------------------------------------------------
		
		for(i=1 ; i<=10 ; i++){
		
			for(j=1 ; j<=6-i ; j++){
			System.out.print("*");
			}
			if(i!=5)
			System.out.println();
			
			for(k=i+1 ; i>5 && i<10 && k>5 ; k--){
			System.out.print("*");
			}			
		}
		

//---------------------------------------------------------------
		System.out.println("\n Method 2 - Simple n Readable\n");
//---------------------------------------------------------------		
	
		for(i=1 ; i<=5 ; i++){
		
			for(j=6-i ; j>=1 ; j--){
			System.out.print("*");
			}
			System.out.println();
		}
		
		for(i=1 ; i<=4 ; i++){
		
			for(j=i+1 ; j>=1 ; j--){
			System.out.print("*");
			}
			System.out.println();	
		}
		
	}
}

/*
op - 
 Method 1 - Jugaad to bring ans in only 1 nested, poor readibility

*****
****
***
**
*
**
***
****
*****

 Method 2 - Simple n Readable

*****
****
***
**
*
**
***
****
*****

*/