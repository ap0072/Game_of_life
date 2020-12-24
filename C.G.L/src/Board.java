
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

public class Board extends Display {

int  a1;
int b1;
int c1;
int d1;
int size;
int first[][];
	
public Board(int a,int b,int c,int d) {
	a1=a;
			b1=b;
			c1=c;
			d1=d;
}
public Board(int size) {
	// TODO Auto-generated constructor stub
	this.size=size;
	first=new int[size][size];
	
	
	
}
public int[][]  createBoard(int n, int l[][]) {
    size=n;
    l=new int[n][n]; 
    int [][] board=new int[n][n];
    for(int i=2;i<5;i++){
        board[i][3]=1;
        board[i][2]=1;
    }     
        return board;
    }



public int  position() {
	
	return a1+b1;

}
public int[][] nextBoard(int size2, int[][] m1) {
	// TODO Auto-generated method stub
	int alive;
	int size3=size2;
	int [][] future=new int[size][size];
	int [][] numberboard=m1;
	for(int l=1;l<size3-1;l++){
        for(int m=1;m<size3-1;m++){
           alive=0;
            for(int i=-1;i<=1;i++)
                for(int j=-1;j<=1;j++)            
               
                	alive+=numberboard[l+i][m+j];
            alive-=numberboard[l][m];
            if((numberboard[l][m]==1) && (alive<2)){
                future[l][m]=0;
            }
            else if((numberboard[l][m]==1)&&(alive>3)){

                future[l][m]=0;

            } 
           else if((numberboard[l][m]==0)&&(alive==3) || (numberboard[l][m]==1)&&(alive==2) || (numberboard[l][m]==1)&&(alive==3)){
                future[l][m]=1;
            }
           
            else{
                future[l][m]=numberboard[l][m];
            }
           
           

	
        }
	}
	
	return future;
	
	
}
public int aliveCount(int[][] m, int size4) {
	// TODO Auto-generated method stub
	int alive = 0;
	for(int l=0;l<size4;l++){
        for(int m2=0;m2<size4;m2++){
           if(m[l][m2]==1) {
        	   alive+=1;
           }
	
	
}
	}
	return alive;
}
}
