
class p5{
		
		public static void main (String args []){
		
			for (int i=1 ; i<=5 ; i++){
					
				for (int j=5-i ; j>=1 ; j--){
					
					System.out.print(" ");
					
				}
				
				
				for (int j=1 ; j<=i ; j++){
				
					System.out.print("*");
				
				}
				
				//if(i!=1){
				
					for (int k=1 ; k<i ; k++){						//if k<=i, then if contion b4 for
					
						System.out.print("*");
					
					}
				//}
				
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

*/