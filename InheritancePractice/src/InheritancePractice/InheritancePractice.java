package InheritancePractice;
class Animal
{
	String name ;
	int age ;
	
	public Animal()
	{
		name = "No name";
		age = 1;
	}
	public Animal(String name,int age)
	{
		this.name = name ;
		this.age = age;
	}
	public void eat()
	{
		System.out.println("It is eating");
	}
	public void speak()
	{
		System.out.println("....");
	}

}
class Dog extends Animal
{
	public Dog(String name_ ,int age_)
	{
		name = name_;
		age = age_;
	}
	public void speak()
	{
		System.out.println("Worf Worf");
	}
}
public class InheritancePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog xu_beo = new Dog("Xu beo",2) ;
		xu_beo.speak();
		xu_beo.eat();
		
		
		
	}

}
