
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

	int b[][];
	int size1;
	int count=-1;
	
	
	public Display(int n) {
		size1=n;
	}
	
	public Display() {
		// TODO Auto-generated constructor stub
	}

	public Display(boolean[][] first,int size) {
		// TODO Auto-generated constructor stub
		
	}



//	public Display(boolean[][] createBoard,int size) {
//		// TODO Auto-generated constructor stub
//		printBoard(createBoard,size);
//	}

	public void printBoard(int [][] first,int size) {
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
