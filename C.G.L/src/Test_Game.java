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

public class Test_Game {
   @Test
   public void testOne() {
	   System.out.println("======TEST ONE EXECUTED=======");
	   
	   Run_Game o1=new Run_Game(10);
	   
	   Assertions.assertEquals(10,o1.size );
	   
   }
   
   @Test
   public void testTwo() {
	   System.out.println("======TEST TWO EXECUTED=======");
	   int n=10;
	   Board o2=new Board(10,5,4,3);
	   
	   for(int i=0;i<n;i++) {
		   for(int j=0;j<n;j++) {
			   if((i+j)== o2.position()){
				   System.out.println("with in limits");
				   
			   }
		   }
	   }
	   
	
   }
   
   @Test
   public void testThree() {
	   System.out.println("======TEST THREE EXECUTED=======");
	   Display o3= new  Display(10);
	 int r= o3.printBoard();
	   
	  
       Assertions.assertEquals(10, r);
   }
}



