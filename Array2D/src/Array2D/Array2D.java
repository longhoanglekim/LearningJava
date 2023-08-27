package Array2D;
import java.util.Scanner;
public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[5][5];
		for(int i = 0 ; i < arr.length ; i++)
		{
			for(int j = 0 ; j < arr[0].length ; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		for(int i[] : arr)
		{
			for(int j : i)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	

}
