package q2;

public class Bubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] unsorted = {5, 3, 7, 8, 10 , 2};
		unsorted = sort(unsorted);
		for (int i : unsorted) {
			System.out.print(i + " ");
		}
	}
	
	public static int[] sort(int[] arr) {
		for (int outer = 0; outer < arr.length; outer++) {
			// check each element and swap as needed
			for (int i = 1; i < arr.length - outer; i++) {
				if (arr[i - 1] > arr[i]) {
					int temp = arr[i - 1];
					arr[i - 1] = arr[i];
					arr[i] = temp;
				}
			}
		}

		return arr;
	}
}
