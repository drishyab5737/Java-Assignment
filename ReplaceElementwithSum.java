package myArray;

public class ReplaceElementwithSum {
	static void findEncryptedArray(int arr[], int n)
	{
		int sum = 0;
		for (int i = 0; i < n; i++)
			sum += arr[i];

		for (int i = 0; i < n; i++)
			System.out.print(sum - arr[i] + " ");
	}

	
	public static void main(String[] args)
	{
		int arr[] = { 2,3,5,4,6 };
		int N = arr.length;
		findEncryptedArray(arr, N);
	}


}

	