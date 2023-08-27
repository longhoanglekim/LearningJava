package AbstractClassPractice;
abstract class KFC
{
	KFC()
	{
		System.out.println("This is a KFC ");
	}
	void makeItems()
	{
		System.out.println("Making items");
	}
	abstract void billing();
	abstract void offer();
}
class MyKFC extends KFC
{
	void billing()
	{
		System.out.println("Paid by card");
	}
	void offer()
	{
		System.out.println("Offer onl or off");
	}
}
public class AbstractClassPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KFC res = new MyKFC();
		res.offer();
		res.makeItems();
		res.billing();
	}

}
