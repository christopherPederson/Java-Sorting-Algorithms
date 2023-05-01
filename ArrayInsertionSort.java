import java.util.Random;

public class ArrayInsertionSort {
	public static void main(String[] args) {
		
		int[] array = {0,0,0,0,0,0,0,0,0,0};
		
		//////////////randomizing array////////////////
		Random random = new Random();
		for (int i = 0; i<10; i++) {
			array[i] = (random.nextInt(101));
		}
		//////////////randomizing array////////////////
		
		print(array);
		array = insertionSort(array);
		print(array);
	}
	
	
	public static int[] insertionSort(int[] array) {
		
		for(int i = 1; i <= array.length - 1; i++) {
			
			for (int j = i; j > 0 && array[j] < array[j - 1]; j--) {
				array = swap(array, j -1, j);
			}
		}
		return array; 
	}
	
	public static int[] swap(int[] array, int first, int last) {
		int temp = array[last];
		array[last] = array[first];
		array[first] = temp;
		return array;
	}

	public static void print(int[] array) {
		for (int c = 0; c < array.length; c++) {
			System.out.print(array[c] + ",");
		}
		System.out.println();
	}
}
