
//import java.util.scanner;

class p11{
	
	public static void main(String args []){
		
		int l=0;
		for (int i=1 ; i<=5 ; i++){
			
			for (int j=5-i ; j>=1 ; j--){				
				System.out.print(" ");					
			}
			
			//System.out.println("*");
						
			if((i%2)!=0)
				for (int k=1 ; k<=i ; k++){
					l++;					
					System.out.print("*");
				}
/*				
			for (int k=1 ; k<=10 ; k++){
					l++;
					if(l==1 || k%2!=0){
					System.out.print("*");
					}
			}
*/			
			System.out.println();
						
		}
	}
}

/*
if(l==1 || (i%2)!=0
	for (int k=1 ; k<=10 ; k++){
						l++;
						if(l==1 || k%2!=0){
						System.out.print("*");
						}
				}
*/				