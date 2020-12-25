
/**
 * The Display class should provide basic operations such as 
 * printing board to the console
 * 
 * 
 * @author Sridevi. K.
 * @author N. D. V. Siva Sankar
 * @author Prasanth Kumar Chaluvadi 2020501099
 * 
 * @version: 1.0
 */

public class Display 
{
		/**
		 * This is Display class used for printing board to console
		 * in this class I take one 2d empty array output board,
		 * one size variable to store size of board
		 * count variable to give user clarity about printing generation 1 or generation 2
		 * printBoard method to print board.
		 */
	
		int outputboard[][];
		int size;
		int count=-1;
	
	
		public Display(int n) 
		{
			size=n;
		}
	
//		public Display() 
//		{
//			/** default constructor
//			 * 
//			 */
//			// TODO Auto-generated constructor stub
//		}


		public void printBoard(int [][] inputboard) 
		{
			/**
			 * This is printBoard method used to print the board according to live cells in board
			 * if there are any live cells then output will be printed as '*' 
			 * other wise output will be printed as '.'
			 * 
			 * here input board is passed as parameter and output board is printed based on required output format.
			 * 
			 */
			
			
			outputboard=inputboard;
			count+=1;
			System.out.println("Genration : "+count);
			for(int i=0;i<inputboard.length;i++) 
			{
				   for(int j=0;j<inputboard[0].length;j++) 
				   {
					   if(outputboard[i][j]==0)
					   {
						   System.out.print(".");
						   
					   }
					   else 
					   {
						   System.out.print("*");
					   }
					   
					   if(j<inputboard[0].length-1) 
					   {
						   System.out.print("");
					   }
					  
				   }
				   System.out.println();
			   }
		}
	
}
