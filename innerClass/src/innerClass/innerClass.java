package innerClass;
class Outer
{
	private int val ;
	Outer(int value)
	{
		val = value;
	}
	public class Inner
	{
		int pos = 0;
		public void innerDisplay()
		{
			System.out.println("The position of "+ val + " is " + pos);
		}
	}
	public void outerDisplay()
	{
		Inner i = new Inner();
		i.innerDisplay();
		System.out.println("The value is " + val);
	}
}
public class innerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer.Inner oi = new Outer(10).new Inner();
		oi.innerDisplay();
		
	}

}
