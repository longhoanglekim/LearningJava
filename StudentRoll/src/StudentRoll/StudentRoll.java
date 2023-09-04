package StudentRoll;
import java.util.Date;
class Student
{
	String rollNo ;
	private static int count = 1;
	private String generateRollNo()
	{
		Date d = new Date();
		String rn = "Univ-" + (d.getYear() + 1900) + "-" + count; 
		count++;
		return rn;
	}
	public Student()
	{
		rollNo = generateRollNo();
	}
	void printNo()
	{
		System.out.println( "rollNo :" + rollNo );
	}
}
public class StudentRoll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st[] = new Student[3];
		st[0] = new Student();
		st[0].printNo();
		st[1] = new Student();
		st[1].printNo();
		st[2] = new Student();
		st[2	].printNo();
	}

}
