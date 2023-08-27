package PracticeArgument;

public class PracticeArgument {
	static void show( int ...ar)
	{
		for (int x:ar)
		{
			System.out.println(x);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= new int[]{1,2,3};
		show(arr);
	}

}
