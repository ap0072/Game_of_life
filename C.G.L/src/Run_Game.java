
/**
 * The Run Game class should provide basic operations such as 
 * Initializing a size variable and declaring its size
 * 
 * 
 * @author Sridevi. K.
 * @author N. D. V. Siva Sankar
 * @author <Prasanth Kumar Chaluvadi>
 * 
 * @version: 1.0
 */





public class Run_Game {
	int size;

	Run_Game(int size){
		this.size=size;
	}
	
	public static void main(String[] args) {
		Run_Game c=new Run_Game(10);
		
		Board b= new Board(c.size);
		
		Display d=new Display();
	}


}




