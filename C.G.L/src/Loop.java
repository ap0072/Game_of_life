
public class Loop {
	int count=5;
	int l=10;
	int m=20;
	int n=30;
	int temp=0;
	public static void main(String[] args) {
		Loop o=new Loop();
		while(o.count!=0) {
			System.out.println("Generation : "+o.count);
			System.out.println(o.l);
			System.out.println(o.m);
			System.out.println(o.n);
			o.temp=o.m;
			o.m=o.n;
			o.l=o.temp;
			o.n+=10;
			o.count-=1;
		}
	}

}
