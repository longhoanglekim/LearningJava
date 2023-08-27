	package RecursionPractice;

public class RecursionPractice {
	static void func(int n)
	{
		if( n > 0)
		{
			System.out.println(n);
			func(n-1);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		func(3);
	}

}
