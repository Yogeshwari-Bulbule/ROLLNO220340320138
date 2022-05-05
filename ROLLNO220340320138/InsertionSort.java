import java.util.*;
class InsertionSort{
	public static void insertion(int arr[])
	{
		int temp=arr[arr.length -1];
		int j;
	for( j=arr.length-2 ; j>=0 && arr[j]>temp;j--)
	{
	arr[j+1]=arr[j];
     }
	 arr[j+1]=temp;
	}
	public static void insertionSort(int arr[])
	{
		for(int i=1;i<arr.length;i++)
		{
			int temp=arr[i];
			int j;
			
			for(j=i-1; j>=0 && arr[j]>temp;j--)
			{
				arr[j+1]=arr[j];
			}
			arr[j+1],p;
			System.out.println("pass"+i+Arrays.toString(arr));
		}
		public static void main(String args[])
		{
			int arr[]={2,4,6,8,3};
			System.out.println("Before Insertion"+Array.toString(arr));
			insertion(arr);
			System.out.println("After Insertion"+Array.toString(arr));
		}
	}

	
