package arrayPackage;

public class SortNumbers {

	public static void main(String[] args) {
		int[] numbers = {10, 8, 11, 7, 6, 5, -5, 4, -1, 2, 0, 3};
		int temp;
		for(int i=0;i<numbers.length;i++)
		{
			for(int j=i+1;j<numbers.length;j++)
			{
				if(numbers[j]<=numbers[i]) {
					temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		System.out.println("Sorted Numbers are:");
		for(int num: numbers)
		{	
			System.out.print(num+ ",");
		}
	}

}
