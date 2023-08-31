package finalLearning;
class Test 
{
	public final void show()
	{
		System.out.println("Hallo");
	}
}
class Test1 extends Test 
{
	/*
	can not override the final method of super class
	public void show()
	{
		
	}
	*/
}
public class finalLearning {
	static final float PI = 3.1425f;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int x ;
		x = 10;
	
		System.out.println(x);
		System.out.println(PI);
	}

}
