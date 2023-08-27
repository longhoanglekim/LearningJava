package Circle1;
class Circle
{
	private double radius ;
	
	public Circle()
	{
		radius = 1;
	}
	public Circle(int r)
	{
		if( r > 0) 
		{
			radius = r;
		}
		else radius = 0;
	}
	
	public double getRadius()
	{
		return radius;
	}
	public void setRadius(double len)
	{
		if( len > 0)
		{
			radius = len;
		}
		else len = 0;
	}
	
	public double area()
	{
		return Math.PI* radius * radius;
	}
	public double premeiter()
	{
		return Math.PI* 2 * radius;
	}
}

public class Circle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle(8) ;
		
		System.out.println("Radius is " + c1.getRadius());
		System.out.println("Area is " + c1.area());
		System.out.println("Premeiter is " + c1.premeiter());
		
	}

}
