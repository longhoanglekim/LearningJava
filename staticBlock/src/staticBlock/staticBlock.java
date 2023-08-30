package staticBlock;

public class staticBlock {
	static 
	{
		System.out.println("Block 1");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main");
	}
	static 
	{
		System.out.println("Block 2");
	}
}
