
/**
 * ****************Conway's Game Of Life***********************************
 * Initially, there is a board with some cells which may be alive or dead. 
 * Task is to generate the next generation of cells based on the following rules: 
 *     
 * Rule 1: Any live cell with fewer than two live neighbors dies, as if caused by under
 * population. 
 * Rule 2:Any live cell with two or three live neighbors lives on
 * to the next generation. 
 * Rule 3: Any live cell with more than three live  neighbors dies, as if by overpopulation. 
 * Ruele 4: Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
 * 
 * Step 1 => find the no Of Neighbours that are alive; 
 * Step 2 => apply rules of game to get next genration by use the if conditions
 * to check all neighbors exluding it self as given video lecture
 * 
 * *************Rules of Life********************* 
 * Lonely cell will die ==> aliveNeighbours < 2 ;
 * Cell will die due to overpopulation ==> aliveNeighbours > 3 
 * A new cell will born ==> if currently dead cell have aliveNeighbours == 3
 * 
 * @author Sridevi. K.
 * @author N. D. V. Siva Sankar
 * @author prasanth kumar 2020501099
 * 
 */





public class RunGame  
{
	
	/**
	 * this is RunGame class generally which contains 
	 * vairables size
	 * Here I have taken one 2d arrays to generate  Game of life.
	 */
	 int size;
	 
	 int array1[][];
//	 int m[][];
//	 int n[][];
	 int alivecount;
	RunGame(int size)
	{
		
	/**
	 * in this constructor we are declaring size of board to be created
	 */
		this.size=size;
		int  array1[][]=new int[size][size];
	}
	
	
			
		
}







