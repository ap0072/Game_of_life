
/**
 * The Board Game class should provide basic operations such as 
 * creating a board with taking initall position from Run_Game class 
 * 
 * 
 * @author Sridevi. K.
 * @author N. D. V. Siva Sankar
 * @author <Prasanth Kumar Chaluvadi>
 * 
 * @version: 1.0
 */

public class Board {

int  a1;
int b1;
int c1;
int d1;
int size;
boolean first[][];
	
public Board(int a,int b,int c,int d) {
	a1=a;
			b1=b;
			c1=c;
			d1=d;
}
public Board(int size) {
	// TODO Auto-generated constructor stub
	this.size=size;
	first=new boolean[size][size];
	System.out.println("A Current Generation Created");
	
}
public int  position() {
	
	return a1+b1;

}
}
