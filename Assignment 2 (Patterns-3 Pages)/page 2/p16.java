
class p16{

	public static void main(String args[]){
	
	int i,j,k;

		for(i=1 ; i<=4 ; i++){						//i<=n-1, when we'll take ip from user
			
			for(j=1 ; j<=5-i ; j++){				//i<=n-i, when we'll take ip from user
					System.out.print(" ");
			}
			
			for(k=1 ; k<=i ; k++){
				if(k!=1 && k!=i){
					System.out.print(" ");
					continue;
				}
			System.out.print("*");
			}
			System.out.println();
		}
		
		for(i=1 ; i<=5 ; i++){						//i<=n, when we'll take ip from user
			System.out.print("*");
		}
	}
}

/*
op -
    *
   **
  * *
 *  *
*****
*/