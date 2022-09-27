
class p7{
	
	public static void main (String args []){
	
	int i,j,k,l;
	
		for(i=1 ; i<=5 ; i++){
		
		
			for(j=5-i ; j>=1 ; j--){
			
			System.out.print(" ");
			
			}
			
			
			for(k=1 ; k<=i ; k++){
			
			System.out.print("*");
			
			}
			
			
			for(l=1 ; l<i ; l++){
			
			System.out.print("*");
			
			}
			
			System.out.println();
		
		}
		
		
		
		for(i=1 ; i<=4 ; i++){
		
		
			for(j=1 ; j<=i ; j++){						//just by removing "= from <=", we skipped thhis for loops execution for 1st outside for loops execution
			
			System.out.print(" ");
			
			}
			
			
			for(k=5-i ; k>=1 ; k--){
			
			System.out.print("*");
			
			}
			
			
			for(l=4-i ; l>=1 ; l--){
			
			System.out.print("*");
			
			}
			
			System.out.println();
		
		}
	
	}

}

/*
op - 
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *

*/