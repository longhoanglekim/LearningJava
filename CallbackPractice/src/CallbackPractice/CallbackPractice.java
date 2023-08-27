package CallbackPractice;
interface Member
{
	void callback();
}
class Customer implements Member
{
	String name;
	Customer(String name)
	{
		this.name = name ;
	}
	public void callback()
	{
		System.out.println("I will call back " + name);
	}
}
class Store 
{
	Member mem[] = new Member[100];
	int count = 0;
	void register(Member m)
	{
		mem[count++] = m ;
	}
	void invite()
	{
		for(int i=  0 ; i < count ; i++)
		{
			mem[i].callback();
		}
	}
}
public class CallbackPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c = new Customer("Long");
		Customer c1 = new Customer("Son");
		Store s = new Store();
		s.register(c);
		s.register(c1);
		s.invite();
	}

}
