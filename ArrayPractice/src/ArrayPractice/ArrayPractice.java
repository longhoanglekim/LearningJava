package ArrayPractice;
import java.util.Scanner;
public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int arr[] = new int[num];
		int sum = 0;
		// find sum of array 
		for(int i= 0 ; i < num ; i++)
		{
			arr[i] = sc.nextInt();
			sum+= arr[i];
		}
		System.out.println("Sum of array is " + sum);
//		//find number in the array
//		System.out.println("Enter the number:");
//		int find = sc.nextInt();
//		for(int i= 0 ; i < num ; i++)
//		{
//			if( find == arr[i]) System.out.println(i) ;
//		}
//		//find biggest number
//		for(int i = 0 ; i < num ; i++)
//		{
//			for(int j = i+ 1 ; j < num ; j++)
//			{
//				if( arr[i] < arr[j] ) 
//				{
//					int tmp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = tmp ;
//				}
//			}
//		}
//		System.out.println("The biggest number is "+ arr[0]);
//		System.out.println("The second biggest number is "+ arr[1]);
		// rotate left array
//		int tmp = arr[0];
//		for(int i = 0 ; i < num - 1; i++)
//		{
//			arr[i] = arr[i+1];
//		}
//		arr[num-1] = tmp;
		// rotate right array
//		int tmp = arr[num-1];
//		for(int i = num- 1 ; i >= 1; i--)
//		{
//			arr[i] = arr[i-1];
//		}
//		arr[0] = tmp;
//		for(int i = 0 ; i < num ; i++)
//		{
//			System.out.print(arr[i] + " ");
//		}
//		System.out.println();
		//insert new element 
		int tmp_arr[] = arr.clone();
		int i_num = sc.nextInt();
		int index= sc.nextInt();
		arr = new int[num+1];
		for(int i = 0 ; i < index ; i++)
		{
			arr[i] = tmp_arr[i];
		}
		arr[index] = i_num;
		for(int i = index ; i < num ; i++)
		{
			arr[i+1] = tmp_arr[i];
		}
		for(int i = 0 ; i < num + 1; i++)
		{
			System.out.print(arr[i] + " ");
		}
		//
	}

}
