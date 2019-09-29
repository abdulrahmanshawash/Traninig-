import java.util.*;
public class ArraysSum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int arr1[] = new int[6];
		int arr2[] = new int[6];
		int result[] = new int[6];
		System.out.println("Enter the elements of the 1st array");
		for(int x=0;x<6;x++)
		{
			System.out.println("Enter an element");
			arr1[x]=input.nextInt();
		}

		System.out.println("Enter the elements of the 2nd array");
		for(int y=0;y<6;y++)
		{
			System.out.println("Enter an element");
			arr2[y]=input.nextInt();
		}

		for(int z=0;z<6;z++)
		{
			System.out.println("Enter an element");
			result[z]=arr1[z]+arr2[z];
		}
		System.out.println("The Sum of the two array : ");
		for(int temp: result)
		{
			System.out.println(temp);
		}
	}
}
