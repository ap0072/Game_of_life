
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

	boolean b[][];
	int size1;
	
	
	public Display(int n) {
		size1=n;
	}
	
	public Display() {
		// TODO Auto-generated constructor stub
	}

	public Display(boolean[][] first,int size) {
		// TODO Auto-generated constructor stub
		printBoard(first,size);
	}



	public void printBoard(boolean [][] first,int size) {
		int n=size;
		b=first;
		for(int i=0;i<n;i++) {
			   for(int j=0;j<n;j++) {
				   if(b[i][j]==false){
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
