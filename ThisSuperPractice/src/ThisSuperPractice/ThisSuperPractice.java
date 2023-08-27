package ThisSuperPractice;
class Parent
{
	
	String name;
	int age;
	Parent()
	{
		this.name = "";
		this.age = 0;
	}
	Parent(String name_,int age_)
	{
		
		this.name = name_;
		this.age = age_;
	}
	void display()
	{
		System.out.println( "Name :" + this.name );
		System.out.println( "Age  :" + this.age  );
	}
}
class Child extends Parent
{
	String group;
	Child(String name_,int age_,String group)
	{
		super(name_,age_);
		this.group = group;	
	}
	void display()
	{
		super.display();
		System.out.println(this.group);
	}
}
public class ThisSuperPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child("long",19,"RPT");
		c.display();
		
	}

}
