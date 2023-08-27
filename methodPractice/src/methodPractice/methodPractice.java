package methodPractice;

public class methodPractice {

	int max(int x,int y)
	{
		if( x> y) return x;
		return y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 10,b=15;
		methodPractice mp = new methodPractice();
		System.out.println(mp.max(a, b));
	}

}
