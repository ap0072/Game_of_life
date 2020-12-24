
/**
 * The Display class should provide basic operations such as 
 * printing board to the console
 * 
 * 
 * @author Sridevi. K.
 * @author N. D. V. Siva Sankar
 * @author <Prasanth Kumar Chaluvadi>
 * 
 * @version: 1.0
 */

public class Display {
	/**
	 * this is Display class used for printing board to console
	 * in this class i take one 2d empty array,
	 * one size variable
	 */

	int b[][];
	int size1;
	int count=-1;
	
	
	public Display(int n) {
		size1=n;
	}
	
	public Display() {
		/** default constructor
		 * 
		 */
		// TODO Auto-generated constructor stub
	}







	public void printBoard(int [][] first,int size) {
		/**
		 * this is printBoard method used to print the board according to live cells in board
		 * if there are live cells then output will be '*' 
		 * other wise output will be '.'
		 */
		
		int n=size;
		b=first;
		count+=1;
		System.out.println("Genration : "+count);
		for(int i=0;i<n;i++) {
			   for(int j=0;j<n;j++) {
				   if(b[i][j]==0){
					   System.out.print(".");
					   
				   }
				   else {
					   System.out.print("*");
				   }
				   
				   if(j<n-1) {
					   System.out.print("");
				   }
				  
			   }
			   System.out.println();
		   }
		
	}
	
	
	
	
	
}
