
/**
 * The Board Game class should provide basic operations such as 
 * creating a board with taking initial position from createBoard method in this class
 * In nextBoard we are taking input from create board and generating next generation of Game.
 * 
 * @author Sridevi. K.
 * @author N. D. V. Siva Sankar
 * @author Prasanth Kumar Chaluvadi 2020501099
 * 
 * @version: 1.0
 */

public class Board 
{


	static int size;
	int firstarray[][];

	public Board(int size) 
	{
		// TODO Auto-generated constructor stub
		this.size=size;
		firstarray=new int[size][size];
	
	}
	
	public Board(int boardSizeWidth, int boardSizeHeight) {
		// TODO Auto-generated constructor stub
	}

	

	public Board() {
		// TODO Auto-generated constructor stub
	}

	

	public int[][]  createBoard(int n) 
	{
		/**
		 * this is createBoard method which  initializing  positions that is required to start the game.
		 * by taking an array board with size n 
		 * here n is int which is passed in parameters
		 */
		
		size=n;
		//emptyarray=new int[n][n]; 
		int [][] board=new int[n][n];
		for(int i=2;i<5;i++){
		    board[i][3]=1;
		    board[i][2]=1;
		}     
		    return board;
	}




	public int[][] nextBoard(int size2, int[][] currentboard) 
	{
		/**
		 * This is nextBoard method used for generating next generation of Game.
		 * in order to create next generation we have to follow certain rules like
		 * if any live cell have >3 or <2 neighbors alive then this cell will die in next generation
		 *  if any cell have exactly 2 or 3 neighbor alive cells then this cell will be alive in next generation
		 *  if any cell which have three neighbors alive and if this cell is in dead state then due to reproductivity this cell will get life in next generation
		 *  
		 *  
		 *  here in this nextGeneration i took variables such as alive to count no of alive neighbors 
		 *  and a 2d array future of size passed in parameter
		 *  with using currentboard and applying rules we are generating and returning  future board.
		 *  
		 */
		
		
		// TODO Auto-generated method stub
		int alive;
		
		int [][] futureboard=new int[size2][size2];
		
		for(int l=1;l<size2-1;l++)
		{
	        for(int m=1;m<size2-1;m++)
	        {
	           alive=0;
	            for(int i=-1;i<=1;i++)
	                for(int j=-1;j<=1;j++)            
	               
	                	alive+=currentboard[l+i][m+j];
	            alive-=currentboard[l][m];
	            if((currentboard[l][m]==1) && (alive<2))
	            {
	            	futureboard[l][m]=0;
	            }
	            else if((currentboard[l][m]==1)&&(alive>3))
	            {
	
	            	futureboard[l][m]=0;
	
	            } 
	           else if((currentboard[l][m]==0)&&(alive==3) || (currentboard[l][m]==1)&&(alive==2) || (currentboard[l][m]==1)&&(alive==3))
	           {
	        	   futureboard[l][m]=1;
	           }
	           
	            else
	            {
	            	futureboard[l][m]=currentboard[l][m];
	            }
	        }
		}
	
		return futureboard;
	
	}
	
	public int aliveCount(int[][] board) 
	{
		/**
		 *  This alive count we count no of alive cells in present board
		 *  I created this method inorder to generate infinite generation usinf while loop taking condition
		 *  as if this aliveCount not equal to zero then pass current generation board to nextBoard method 
		 *  else end of the loop
		 *  
		 *  Here I take one int variable alive to count no of alive cells in whole  board.
		 *  
		 *  
		 */
		// TODO Auto-generated method stub
		int alive = 0;
		for(int l=0;l<board.length;l++)
		{
	        for(int m2=0;m2<board[0].length;m2++)
	        {
	           if(board[l][m2]==1) 
	           {
	        	   alive+=1;
	           }
	        }
		}
		return alive;
	}
}
