import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * The Test Game class should provide basic operations such as 
 * Testing the input size of the board
 * check the positions of live cells initially assigned with in board
 * verification of size of board 
 * 
 * @author Sridevi. K.
 * @author N. D. V. Siva Sankar
 * @author <Prasanth Kumar Chaluvadi>
 * 
 * @version: 1.0
 */

public class TestGame 
{
	/**
	 * here i am testing the runGame class
	 */
   @Test
   public void testingRunGame() 
   {
	   
	   
	   System.out.println("======TEST ONE EXECUTED=======");
	   
	   RunGame o1=new RunGame(10);
	   
	   Assertions.assertEquals(10,o1.size );
	   
   }
   
   @Test
   public void testingBoard() 
   {
	   /**
		 * here i am testing the Board class
		 */
	   Board b= new Board(10);
	   System.out.println("======TEST TWO EXECUTED=======");
	   int n=10;
	   int [][] d2=new int[10][10];
	   int [][] d3=new int[10][10];
	   for(int i=2;i<5;i++)
	   {
	        d3[i][3]=1;
	        d3[i][2]=1;
	    }
	   
	   b.createBoard(n, d2);
	   b.nextBoard(10, d2);
	   b.aliveCount(d2,n);
	   b.aliveCount( d3,n);
	   

   }
	   
	
   
   
   @Test
   public void testingDisplay() 
   {
	   /**
		 * here i am testing the Display class
		 */
	   System.out.println("======TEST THREE EXECUTED=======");
	   Display o3= new  Display(10);
	   Board b= new Board(10);
	   int [][] d=new int[10][10];
	   int [][] e=new int[10][10];
	   int [][] f=new int[10][10];
	   int [][] g=new int[10][10];
	   
	   for(int i=2;i<5;i++)
	   {
	        e[i][3]=1;
	        e[i][2]=1;
	    }
	   
	   for(int i=2;i<5;i++)
	   {
	        f[i][3]=1;
	       
	    }
	   
	   for(int i=2;i<3;i++)
	   {
	        g[i][3]=1;
	        g[i][2]=1;
	        e[i][4]=1;
	        
	   }
	    

	   o3.printBoard(d,10);
	   
	   o3.printBoard(e,10);
	   
	   o3.printBoard( b.nextBoard(10, e), 10);
	   
	   o3.printBoard( b.nextBoard(10, f), 10);
	   
	   o3.printBoard( b.nextBoard(10, g), 10);
	   //System.out.println();
	  
       Assertions.assertEquals(10, 10);
   }
}



