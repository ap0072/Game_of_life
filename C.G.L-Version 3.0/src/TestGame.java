//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;

/**
 * In this Test Game class here i  provide basic operations such as 
 * Testing the input size of the board 
 * generating next generation boards using RunGame,Board,Display classes.
 * verification of size of board 
 * 
 * @author Sridevi. K.
 * @author N. D. V. Siva Sankar
 * @author Prasanth Kumar Chaluvadi 2020501099
 * 
 * @version: 1.0
 */

public class TestGame 
{
	/**
	 * Here i am testing the runGame class
	 */
  // @Test
   public void testingRunGame() 
   {
	   
	   
	   System.out.println("======TEST ONE EXECUTED=======");
	   
	   RunGame o1=new RunGame(10);
	   
	   //Assertions.assertEquals(10,o1.size );
	   
   }
   
  // @Test
   public void testingBoard() 
   {
	   /**
		 * Here i am testing the Board class
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
	   
	   b.createBoard(n);
	   b.nextBoard(10, d2);
	   b.aliveCount(d2);
	   b.aliveCount( d3);
	   
   }
	   
	
   
   
   //@Test
   public void testingDisplay() 
   {
	   /**
		 * Here i am testing the Display class
		 */
	   System.out.println("======TEST THREE EXECUTED=======");
	   Display o3= new  Display(10);
	   Board b= new Board(10);
	   int [][] d=new int[10][10];
	   int [][] e=new int[10][10];
	   int [][] f=new int[10][10];
	   int [][] g=new int[10][10];
	   int count=1;
	   int size=10;
	   
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
	    

//	   o3.printBoard(d);
//	   
//	   o3.printBoard(e);
//	   
//	   o3.printBoard( b.nextBoard(10, e));
//	   
//	   o3.printBoard( b.nextBoard(10, b.nextBoard(10, e)));
//	   
//	   o3.printBoard( b.nextBoard(10, g));
	   
	   //System.out.println();
	   int count1=b.aliveCount(e);
	   
	   System.out.println("\nConway's Game of Life "+"Started");
	  // o3.printBoard(d);
	   
	   while(count1!=0) {
		   
		   System.out.println("\nGeneration : "+count);
		   o3.printBoard(e);
		   e=b.nextBoard(size, e);
		   count1=b.aliveCount(e);
		   count+=1;
		   
	   }
	   
	   System.out.println("\nGeneration : "+"The End");
	   o3.printBoard(d);
	   
	   System.out.println("\nConway's Game of Life Ended\n");
	   
	   
	  
      // Assertions.assertEquals(10, 10);
   }
}



